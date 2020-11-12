package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.weatherapp.api.locations.SearchRepository;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends ArrayAdapter<String> {
    private  Context context;
    private  ArrayList<String> repoList;
    private int resourceLayout;

    public Adapter(Context context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.repoList = objects;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String country;
        String localizedname;

        convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        LayoutInflater inflater = LayoutInflater.from(context);
        TextView txvcountry = convertView.findViewById(R.id.country);
        TextView txvlocalizedname = convertView.findViewById(R.id.localizedName);
        txvcountry.setText(repoList.get(2));
        txvlocalizedname.setText(repoList.get(1));
        return convertView;
    }



    /*
    private final Context context;
    private RecyclerView.ViewHolder holder;
    private final List<SearchRepository> repoList;
    private TextView country,localizedName;


    public Adapter(Context context,List<SearchRepository> repoList) {
        super(context,0, repoList);
        this.context = context;
        this.repoList = repoList;


    }

    @Override
    public int getCount() {
        return repoList.size();
    }

    @Override
    public SearchRepository getItem(int position) {
        return repoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return repoList.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            country = convertView.findViewById(R.id.country);
            localizedName = convertView.findViewById(R.id.localizedName);
            country.setText("Country" + repoList.get(position).getCountry().getEnglishName());
            localizedName.setText("Localized Name"+repoList.get(position).getAdministrativeArea().getEnglishName());

            return convertView;


    }
    */
}
