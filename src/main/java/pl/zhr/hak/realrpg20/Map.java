package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng start = new LatLng(52.292597, 21.170268);
        LatLng antaria = new LatLng(52.289303, 21.209780);
        mMap.addMarker(new MarkerOptions().position(start).title("Start"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(antaria));
        mMap.setMapType(2);
        mMap.setMinZoomPreference(12);
        mMap.setMaxZoomPreference(20);
        mMap.getMaxZoomLevel();
    }

    public void Powrot_mapa(View view) {
        Intent homeActivity = new Intent(Map.this, HomeActivity.class);
        startActivity(homeActivity);
        finish();
    }
}