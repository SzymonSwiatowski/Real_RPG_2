package pl.zhr.hak.realrpg20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TODiaryActivity extends AppCompatActivity {

    private QuestsAdapter questsAdapter;


    protected EditText dodajTytul;
    protected EditText dodajTresc;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewQuests);
        questsAdapter = new QuestsAdapter(questList, TODiaryActivity.this);
        recyclerView.setAdapter(questsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dodajTresc = findViewById(R.id.nowyQuestTresc);
        dodajTytul = findViewById(R.id.nowyQuestTytul);

    }
    List<Quests> questList = new ArrayList<>();


    public void DodajQuest(View view) { questList.add(new Quests(dodajTytul.getText().toString(), dodajTresc.getText().toString()));
    questsAdapter.SetQuests(questList);
    }



    public void powrotDziennik(View view) {
        Intent homeActivity = new Intent(TODiaryActivity.this, HomeActivity.class);
        startActivity(homeActivity);
        finish();
    }


    public void usunTytulZadania(View view) {
        if(dodajTytul.getText().toString().equals("wprowadź tytuł zadania"))
        dodajTytul.setText("");
    }

    public void usunTrescZadania(View view) {
        if(dodajTresc.getText().toString().equals("treść zadania"))
        dodajTresc.setText("");
    }
}