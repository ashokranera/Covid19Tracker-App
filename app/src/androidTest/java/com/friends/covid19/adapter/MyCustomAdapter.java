package com.friends.covid19.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.friends.covid19.R;
import com.friends.covid19.model.CountryModel;

import java.util.List;

class MyCustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private List<CountryModel> countryModelsList;

    public MyCustomAdapter(Context context, List<CountryModel> countryModelsList) {
        super(context, android.R.layout.activity_list_item, countryModelsList);

        this.context = context;
        this.countryModelsList = countryModelsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null, true);
        TextView txtCountryName = view.findViewById(R.id.txtCountryName);
        ImageView imageView = view.findViewById(R.id.imgFlag);
        txtCountryName.setText(countryModelsList.get(position).getCountry());

        Glide.with(context).load(countryModelsList.get(position).getFlag()).into(imageView);

        return view;

    }
}
