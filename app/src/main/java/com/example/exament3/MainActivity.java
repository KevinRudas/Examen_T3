package com.example.exament3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exament3.Adapters.AnimeAdapter;
import com.example.exament3.Modelos.Anime;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv_animes = findViewById(R.id.lista_animes);
        rv_animes.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv_animes.setLayoutManager(layoutManager);

        AnimeAdapter animeAdapter = new AnimeAdapter((ArrayList<Anime>) getAnime());
        rv_animes.setAdapter(animeAdapter);
    }

    private ArrayList<Anime> getAnime(){
        ArrayList<Anime> listaAnime = new ArrayList<>();
        listaAnime.add(new Anime("Super Campeones","1) Anime super campeones futbol","https://i.imgur.com/OFVZ8o4.png"));
        listaAnime.add(new Anime("Dragon Ball Z","2) Anime peleas con super poderes","https://i.imgur.com/MrEm2ne.png"));
        listaAnime.add(new Anime("Pokemon","3) Anime visto por todos","https://i.imgur.com/z0Uxi5v.png"));
        listaAnime.add(new Anime("Super Campeones","4) Anime super campeones futbol","https://i.imgur.com/OFVZ8o4.png"));
        listaAnime.add(new Anime("Dragon Ball Z","5) Anime peleas con super poderes","https://i.imgur.com/MrEm2ne.png"));
        listaAnime.add(new Anime("Pokemon","6) Anime visto por todos","https://i.imgur.com/z0Uxi5v.png"));
        listaAnime.add(new Anime("Super Campeones","7) Anime super campeones futbol","https://i.imgur.com/OFVZ8o4.png"));
        listaAnime.add(new Anime("Dragon Ball Z","8) Anime peleas con super poderes","https://i.imgur.com/MrEm2ne.png"));
        listaAnime.add(new Anime("Pokemon","9) Anime visto por todos","https://i.imgur.com/z0Uxi5v.png"));
        listaAnime.add(new Anime("Super Campeones","10) Anime super campeones futbol","https://i.imgur.com/OFVZ8o4.png"));

        return listaAnime;
    }
}
