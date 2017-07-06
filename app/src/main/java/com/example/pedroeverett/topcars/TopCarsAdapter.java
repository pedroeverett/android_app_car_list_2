package com.example.pedroeverett.topcars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pedroeverett on 05/07/2017.
 */


public class TopCarsAdapter extends ArrayAdapter<Car> {

    public TopCarsAdapter(Context context, ArrayList<Car> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cars_item, parent, false);
        }

        Car currentCar = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking_text);
        ranking.setText(currentCar.getRanking().toString());

        TextView brand = (TextView) listItemView.findViewById(R.id.brand_text);
        brand.setText(currentCar.getBrand());

        TextView model = (TextView) listItemView.findViewById(R.id.model);
        model.setText(currentCar.getModel());

        listItemView.setTag(currentCar);

        return  listItemView;
    }
}