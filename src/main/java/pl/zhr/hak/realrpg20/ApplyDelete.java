package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class ApplyDelete extends AppCompatActivity {

    public static final String shared_PREF = "sharedPref";
    private Switch switchUsuniecie;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applydelete);
        switchUsuniecie = findViewById(R.id.switchDelete);
    }

    public void powrót(View view) {
        Intent homeActivity = new Intent(ApplyDelete.this, HomeActivity.class);
        startActivity(homeActivity);
        finish();
    }

    public void zatwierdzUsuniecie(View view) {
        if (switchUsuniecie.isChecked()){
            SharedPreferences sharedPreferences = getSharedPreferences(shared_PREF, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("nazwa", "unknown");
            editor.putInt("sila", 1);
            editor.putInt("spostrzegawczosc", 1);
            editor.putInt("magia",1);
            editor.putInt("zrecznosc", 1);
            editor.putInt("wytrzymalosc", 1);
            editor.putInt("charyzma", 1);
            editor.apply();
            Intent mainActivity = new Intent(ApplyDelete.this, MainActivity.class);
            startActivity(mainActivity);
            finish();
        }
    }
}
