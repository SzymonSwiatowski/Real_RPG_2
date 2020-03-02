package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void usun1(View view) {
        Intent applyDelete = new Intent(HomeActivity.this, ApplyDelete.class);
        startActivity(applyDelete);
        finish();
    }


    public void dziennik(View view) {
        Intent diaryActivity = new Intent(HomeActivity.this, TODiaryActivity.class);
        startActivity(diaryActivity);
        finish();
    }

    public void postac(View view) {
        Intent figureActivity = new Intent(HomeActivity.this, TOFigureActivity.class);
        startActivity(figureActivity);
        finish();
    }

    public void mapaStart(View view) {
        Intent mapa = new Intent(HomeActivity.this, Map.class);
        startActivity(mapa);
        finish();
    }
}
