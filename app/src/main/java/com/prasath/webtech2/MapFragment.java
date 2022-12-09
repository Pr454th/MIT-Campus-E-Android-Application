package com.prasath.webtech2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Initialize view
        View view=inflater.inflate(R.layout.fragment_map,container,false);

        //Initialize map fragment
        SupportMapFragment supportMapFragment=(SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.googleMap);

        //Async map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                LatLng mit = new LatLng(12.948278020161936, 80.13972053713492);
                googleMap.addMarker(new MarkerOptions()
                        .position(mit)
                        .title("MIT"));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                               mit,15
                        ));
//                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
//                    @Override
//                    public void onMapClick(@NonNull LatLng latLng) {
//                        //When clicked on map
//                        //Initialize marker options
//                        MarkerOptions marketOptions=new MarkerOptions();
//                        //Set position of marker
//                        marketOptions.position(new LatLng(12.948278020161936, 80.13972053713492));
//                        //Set title of marker
//                        marketOptions.title(latLng.latitude+":"+latLng.longitude);
//                        //Remove all marker
////                        //googleMap.clear();
//                        //animating to zoom the marker
////                        //googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
////                          //      latLng,10
////                       // ));
//                        //Add marker on map
//                        googleMap.addMarker(marketOptions).setPosition(new LatLng(12.948278020161936, 80.13972053713492));
//                    }
//                });
            }
        });
        return view;
    }
}