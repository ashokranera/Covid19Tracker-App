package com.friends.covid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.friends.covid19.R;

public class DetailActivity extends AppCompatActivity {

    TextView txtCountry,txtCases, txtRecovered, txtCritical, txtActive, txtTodayCases, txtDeaths, txtTodayDeaths;

    private int positionCounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        positionCounty = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModelList.get(positionCounty).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        txtCountry = findViewById(R.id.txtCountryName);
        txtCases = findViewById(R.id.txtCases);
        txtRecovered = findViewById(R.id.txtRecovered);
        txtCritical = findViewById(R.id.txtCritical);
        txtActive = findViewById(R.id.txtActive);
        txtTodayCases = findViewById(R.id.txtTodayCases);
        txtDeaths = findViewById(R.id.txtDeaths);
        txtTodayDeaths = findViewById(R.id.txtTodayDeaths);

        txtCountry.setText(AffectedCountries.countryModelList.get(positionCounty).getCountry());
        txtCases.setText(AffectedCountries.countryModelList.get(positionCounty).getCases());
        txtRecovered.setText(AffectedCountries.countryModelList.get(positionCounty).getRecovered());
        txtCritical.setText(AffectedCountries.countryModelList.get(positionCounty).getCritical());
        txtActive.setText(AffectedCountries.countryModelList.get(positionCounty).getActive());
        txtTodayCases.setText(AffectedCountries.countryModelList.get(positionCounty).getTodayCases());
        txtDeaths.setText(AffectedCountries.countryModelList.get(positionCounty).getDeaths());
        txtTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCounty).getTodayDeaths());

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        finish();
        return super.onOptionsItemSelected(item);
    }
}