package com.example.weatherapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.weatherapp.api.ApiClient;
import com.example.weatherapp.api.WeatherAPI;
import com.example.weatherapp.api.currentLocation.CurrentPosition;
import com.example.weatherapp.api.forecasts.DailyForecast;
import com.example.weatherapp.api.forecasts.Temperature;
import com.example.weatherapp.api.locations.SearchRepository;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String API_KEY="BVG0IGqQKjrxrl1p2IU4V7Myu6y7TH8k";
    private WeatherAPI weatherAPI;
    private SearchView searchInput;
    private ListView listView;
    private TextView country,localizedName,temperature,currentlocationtemperature;
  //  private Adapter adapter;
    ArrayAdapter<String> adapter;
    private DailyForecast dailyForecast;
    private String searchParam;
    private List<SearchRepository> repoList = new ArrayList<>();
    private String location ;
    private ArrayList<String> locations= new ArrayList<>();
    private FusedLocationProviderClient fusedLocationClient;
    private LocationListener mLocationListener = null;
    private CurrentPosition currentPosition;
    private String currentPositionKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchInput = findViewById(R.id.locationSearch);
        listView =(ListView) findViewById(R.id.list_view);
        temperature = findViewById(R.id.temperature);

        currentlocationtemperature = findViewById(R.id.currentlocationtemperature);
        country = findViewById(R.id.country);
        localizedName = findViewById(R.id.localizedName);


        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            //get address information from  current location
            getLocation();
        }else {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},44);
        }


        searchInput.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                callRequest(query);
                System.out.println(query);


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                searchParam=newText;


                return false;
            }
        });


        //adapter = new Adapter(this,R.layout.list_item, locations);
       adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, locations);
        listView.setAdapter(adapter);
        /*
        ArrayAdapter<List> adapter=new ArrayAdapter<List>
                (this,R.layout.list_item,R.id.localizedName, Collections.singletonList(locations));
        listView.setAdapter(adapter);

         */



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp = repoList.get(position).getKey();
                //int value = callTempRequest(temp);
                //System.out.println(value+"Temperature from select list");
                //temperature.setText("Temperature from select list"+value);
            }
        });

    }

    private void getLocation() {

        fusedLocationClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if (location != null) {

                    try {
                        Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());
                        List<Address> addresses = geocoder.getFromLocation(
                                location.getLatitude(),location.getLongitude(),1
                        );

                        //send address information for get locationkey with search latitude and longitude
                        callCurrentLocationKeyRequest(addresses);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
        });
    }

    private void callCurrentLocationKeyRequest(List<Address> addresses) {

        double latitude;
        double longitude;
        latitude = addresses.get(0).getLatitude();
        longitude = addresses.get(0).getLongitude();
        String concat = latitude+","+longitude;


        weatherAPI = ApiClient.getClient().create(WeatherAPI.class);
        Call<CurrentPosition> call= weatherAPI.getCurrentLocation(API_KEY,concat);
        call.enqueue(new Callback<CurrentPosition>() {

            @Override
            public void onResponse(Call<CurrentPosition> call, Response<CurrentPosition> response) {


                if(response.isSuccessful()){
                    currentPosition=response.body();
                    currentPositionKey = currentPosition.getKey();
                    callTempRequest(currentPositionKey);

                    return;
                }
                System.out.println("Başarısız" + response.message());
                return;

            }
            @Override
            public void onFailure(Call<CurrentPosition> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }

    public void callRequest(String query){
        weatherAPI = ApiClient.getClient().create(WeatherAPI.class);
        Call<List<SearchRepository>> call= weatherAPI.getBySearch(API_KEY,query);
        call.enqueue(new Callback<List<SearchRepository>>() {

            @Override
            public void onResponse(Call<List<SearchRepository>> call, Response<List<SearchRepository>> response) {



                if(response.isSuccessful()){
                    System.out.println(response.body());
                    repoList=response.body();

                    for (int i=0;i<repoList.size();i++){
                        String ikey = repoList.get(i).getKey();
                        String ienglishName = repoList.get(i).getAdministrativeArea().getEnglishName();
                        String icountry = repoList.get(i).getCountry().getEnglishName();
                        locations.add(ikey);
                        locations.add(ienglishName);
                        locations.add(icountry);

                        adapter.notifyDataSetChanged();
                        System.out.println(locations);


                    }

                    return;
                }
                System.out.println("Başarısız" + response.message());
                return;

            }
            @Override
            public void onFailure(Call<List<SearchRepository>> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }

    public void  callTempRequest(String locationKey){
        final int[] tempValue = new int[1];
        weatherAPI = ApiClient.getClient().create(WeatherAPI.class);



        Call<DailyForecast> call= weatherAPI.getDailyForecasts(locationKey,API_KEY);
        call.enqueue(new Callback<DailyForecast>() {
            @Override
            public void onResponse(Call<DailyForecast> call, Response<DailyForecast> response) {

                if(response.isSuccessful()){
                    System.out.println(response.body());
                    dailyForecast=response.body();
                    System.out.println("callTempRequest" + dailyForecast);
                    System.out.println("temp" + dailyForecast.getDailyForecasts().get(0).getTemperature().getMaximum().value);
                    tempValue[0] = dailyForecast.getDailyForecasts().get(0).getTemperature().getMaximum().value;
                    int degree =(int) Math.floor((tempValue[0]-32)*(0.5556));
                    currentlocationtemperature.setText("Current Location Temperature"+ degree);
                    return;
                }

                System.out.println("Başarısız" + response.message());
                return;

            }
            @Override
            public void onFailure(Call<DailyForecast> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });

    }
}


