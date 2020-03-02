package pl.zhr.hak.realrpg20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    public static final String shared_PREFS = "sharedPref";
    private String nazwa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        ImageButton imageButton;
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nazwa.equals("unknown")) {
                    Intent figureActivity = new Intent(MainActivity.this, CreateFigureActivity.class);
                    startActivity(figureActivity);
                    finish();
                }else {
                    Intent homeActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(homeActivity);
                    finish();
                }

            }
        });
    }
    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(shared_PREFS, MODE_PRIVATE);
        nazwa = sharedPreferences.getString("nazwa", "unknown");
    }
}