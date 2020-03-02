package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateFigureActivity extends AppCompatActivity {
    public static final String shared_PREF = "sharedPref";
    private ImageView imageView;
    private Button buttonSila;
    private Button buttonMagia;
    private Button buttonCharyzma;
    private Button buttonZrecznosc;
    private Button buttonSpostrzegawczosc;
    private Button buttonWytrzymalosc;
    private TextView dostepnePunkty;
    private EditText nazwa;
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createfigure);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.avatar1);
        buttonSila = (Button)findViewById(R.id.buttonSiła);
        buttonCharyzma = (Button)findViewById(R.id.buttonCharyzma);
        buttonMagia = (Button)findViewById(R.id.buttonMagia);
        buttonSpostrzegawczosc = (Button)findViewById(R.id.buttonSpostrzegawczość);
        buttonWytrzymalosc = (Button)findViewById(R.id.buttonWytrzymałość);
        buttonZrecznosc = (Button)findViewById(R.id.buttonZręczność);
        dostepnePunkty = (TextView)findViewById(R.id.dostepnePunkty);
        nazwa = (EditText)findViewById(R.id.nazwaBohatera);
}
    int avatarNumber = 1;
    public void następny(View view) {
        if (avatarNumber<3)
            avatarNumber++;
        else avatarNumber=1;
        if (avatarNumber==1)
            imageView.setImageResource(R.drawable.avatar1);
         else if(avatarNumber==2)
            imageView.setImageResource(R.drawable.avatar2);
        else if(avatarNumber==3)
        imageView.setImageResource(R.drawable.avatar3);

    }

    public void poprzedni(View view) {
        if (avatarNumber>1)
            avatarNumber--;
        else avatarNumber=3;
        if (avatarNumber==1)
            imageView.setImageResource(R.drawable.avatar1);
        else if(avatarNumber==2)
            imageView.setImageResource(R.drawable.avatar2);
        else if(avatarNumber==3)
            imageView.setImageResource(R.drawable.avatar3);
    }
    int cechy = 6;
    int sila = 1;
    int zrecznosc = 1;
    int magia = 1;
    int spostrzegawczosc = 1;
    int wytrzymalosc = 1;
    int charyzma = 1;
    public void buttonSila(View view) {
        if(cechy>0) {
            sila += 1;
            String text = "";
            buttonSila.setText(text + sila);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }
    public void buttonSpostrzegawczosc(View view) {
        if(cechy>0) {
            spostrzegawczosc += 1;
            String text = "";
            buttonSpostrzegawczosc.setText(text + spostrzegawczosc);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }
    public void buttonMagia(View view) {
        if(cechy>0) {
            magia += 1;
            String text = "";
            buttonMagia.setText(text + magia);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }
    public void buttonZrecznosc(View view) {
        if(cechy>0) {
            zrecznosc += 1;
            String text = "";
            buttonZrecznosc.setText(text + zrecznosc);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }
    public void buttonWytrzymalosc(View view) {
        if(cechy>0) {
            wytrzymalosc += 1;
            String text = "";
            buttonWytrzymalosc.setText(text + wytrzymalosc);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }
    public void buttonCharyzma(View view) {
        if(cechy>0) {
            charyzma += 1;
            String text = "";
            buttonCharyzma.setText(text + charyzma);
            cechy--;
            dostepnePunkty.setText("Dostępne punkty: " + cechy);
        }
    }

    public void reset(View view) {
        charyzma = 1;
        spostrzegawczosc = 1;
        sila = 1;
        magia = 1;
        wytrzymalosc = 1;
        zrecznosc = 1;
        cechy = 6;
        buttonSpostrzegawczosc.setText("1");
        buttonMagia.setText("1");
        buttonZrecznosc.setText("1");
        buttonWytrzymalosc.setText("1");
        buttonCharyzma.setText("1");
        buttonSila.setText("1");
        dostepnePunkty.setText("Dostępne punkty: " + cechy);
    }
    public void utworz(View view) {
        saveData();
        Intent homeActivity = new Intent(CreateFigureActivity.this, HomeActivity.class);
        startActivity(homeActivity);
        finish();
    }
    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(shared_PREF, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("nazwa", nazwa.getText().toString());
        editor.putInt("sila", sila);
        editor.putInt("spostrzegawczosc", spostrzegawczosc);
        editor.putInt("magia", magia);
        editor.putInt("zrecznosc", zrecznosc);
        editor.putInt("wytrzymalosc", wytrzymalosc);
        editor.putInt("charyzma", charyzma);
        editor.putInt("avatar", avatarNumber);
        editor.putInt("cechy", cechy);
        editor.apply();
    }

    public void usunNazweBohatera(View view) {
        if (nazwa.getText().toString().equals("Wprowadź nazwę bohatera"))
         nazwa.setText("");
    }
}

