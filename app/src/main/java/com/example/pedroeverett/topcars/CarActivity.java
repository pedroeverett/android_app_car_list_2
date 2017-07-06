package com.example.pedroeverett.topcars;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.net.Uri.parse;

public class CarActivity extends AppCompatActivity {

    TextView ranking_text;
    TextView brand_text;
    TextView model_text;
    ImageView carImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        ranking_text = (TextView) findViewById(R.id.ranking_text);
        brand_text = (TextView) findViewById(R.id.brand_text);
        model_text = (TextView) findViewById(R.id.model_text);
        carImage = (ImageView) findViewById(R.id.carImage);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String ranking = extras.getString("ranking");
        String brand = extras.getString("brand");
        String model = extras.getString("model");
        Uri image = parse(extras.getString("image"));
        ranking_text.setText(ranking);
        brand_text.setText(brand);
        model_text.setText(model);
        carImage.setImageURI(image);

    }


}
