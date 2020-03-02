package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TOFigureActivity extends AppCompatActivity {
    public static final String shared_PREFS = "sharedPref";
    private String nazwa;
    private int sila;
    private int magia;
    private int charyzma;
    private int spostrzegawczosc;
    private int wytrzymalosc;
    private int zrecznosc;
    private int avatar;
    private int cechy;
    private Button silaPrzycisk;
    private Button charyzmaPrzycisk;
    private Button spostrzegawczoscPrzycisk;
    private Button magiaPrzycisk;
    private Button wytrzymaloscPrzycisk;
    private Button zrecznoscPrzycisk;
    private TextView nazwa_textView;
    private TextView cechyPunkty;
    private ImageView avatarFigure;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);
        silaPrzycisk = (Button)findViewById(R.id.buttonSiła_Figure);
        charyzmaPrzycisk = (Button)findViewById(R.id.buttonCharyzma_Figure);
        spostrzegawczoscPrzycisk = (Button)findViewById(R.id.buttonSpostrzegawczość_Figure);
        wytrzymaloscPrzycisk = (Button)findViewById(R.id.buttonWytrzymałość_Figure);
        zrecznoscPrzycisk = (Button)findViewById(R.id.buttonZręczność_Figure);
        magiaPrzycisk = (Button)findViewById(R.id.buttonMagia_Figure);
        nazwa_textView = findViewById(R.id.nazwa_Figure);
        cechyPunkty = findViewById(R.id.cechyPunkty_Figure);
        avatarFigure = (ImageView)findViewById(R.id.avatarFigure_IV);
        loadData();
        nazwa_textView.setText(nazwa);
        silaPrzycisk.setText(""+sila);
        charyzmaPrzycisk.setText(""+charyzma);
        spostrzegawczoscPrzycisk.setText(""+spostrzegawczosc);
        wytrzymaloscPrzycisk.setText(""+wytrzymalosc);
        magiaPrzycisk.setText(""+magia);
        zrecznoscPrzycisk.setText(""+zrecznosc);
        cechyPunkty.setText(""+cechy);
        switch (avatar){
            case 1:
                avatarFigure.setImageResource(R.drawable.avatar1);
                break;
            case 2:
                avatarFigure.setImageResource(R.drawable.avatar2);
                break;
            case 3:
                avatarFigure.setImageResource(R.drawable.avatar3);
                break;
        }

        }

    public void buttonSila_Figure(View view) {
        if(cechy>0) {
            sila += 1;
            String text = "";
            silaPrzycisk.setText(text + sila);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void buttonSpostrzegawczosc_Figure(View view) {
        if(cechy>0) {
            spostrzegawczosc += 1;
            String text = "";
            spostrzegawczoscPrzycisk.setText(text + spostrzegawczosc);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void buttonMagia_Figure(View view) {
        if(cechy>0) {
            magia += 1;
            String text = "";
            magiaPrzycisk.setText(text + magia);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void buttonZrecznosc_Figure(View view) {
        if(cechy>0) {
            zrecznosc += 1;
            String text = "";
            zrecznoscPrzycisk.setText(text + zrecznosc);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void buttonWytrzymalosc_Figure(View view) {
        if(cechy>0) {
            wytrzymalosc += 1;
            String text = "";
            wytrzymaloscPrzycisk.setText(text + wytrzymalosc);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void buttonCharyzma_Figure(View view) {
        if(cechy>0) {
            charyzma += 1;
            String text = "";
            charyzmaPrzycisk.setText(text + charyzma);
            cechy--;
            cechyPunkty.setText("" + cechy);
        }
    }
    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(shared_PREFS, MODE_PRIVATE);
        nazwa = sharedPreferences.getString("nazwa", "unknown");
        sila = sharedPreferences.getInt("sila", 1);
        spostrzegawczosc = sharedPreferences.getInt("spostrzegawczosc", 1);
        wytrzymalosc = sharedPreferences.getInt("wytrzymalosc", 1);
        magia = sharedPreferences.getInt("magia", 1);
        zrecznosc = sharedPreferences.getInt("zrecznosc", 1);
        charyzma = sharedPreferences.getInt("charyzma", 1);
        avatar = sharedPreferences.getInt("avatar", 1);
        cechy = sharedPreferences.getInt("cechy", 1);
    }

    public void Powrot_postac(View view) {
        Intent powrot = new Intent(TOFigureActivity.this, HomeActivity.class);
        startActivity(powrot);
        finish();
    }
}
