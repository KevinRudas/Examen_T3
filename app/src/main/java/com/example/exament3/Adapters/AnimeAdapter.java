package com.example.exament3.Adapters;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exament3.Modelos.Anime;
import com.example.exament3.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

    List<Anime> listaAnime;
    public AnimeAdapter(List<Anime> listaAnime){
        this.listaAnime = listaAnime;
    }

    @NonNull
    @Override
    public AnimeAdapter.AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_anime, parent, false);
        AnimeViewHolder animViewHolder = new AnimeViewHolder(view);
        return animViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.AnimeViewHolder holder, int position) {
        holder.setAnime(listaAnime.get(position));
    }

    @Override
    public int getItemCount() {
        return listaAnime.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public TextView descripcion;
        public ImageView imagen;
        public ImageButton estrella;

        Integer click = 1;

        Anime anime;
        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvNombre);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            imagen = itemView.findViewById(R.id.idImagenAnime);
            estrella = itemView.findViewById(R.id.btn_est);

            estrella.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if(event.getAction() == MotionEvent.ACTION_UP && click == 1){
                        estrella.setImageResource(R.drawable.estn);
                        click++;
                    }else if(event.getAction() == MotionEvent.ACTION_UP && click ==2){
                        estrella.setImageResource(R.drawable.estb);
                        click--;
                    }
                    return true;
                }
            });
        }

        public void setAnime(Anime anime){
            this.anime = anime;
            nombre.setText(anime.getNombre());
            descripcion.setText(anime.getDescripcion());
            Picasso.get()
                    .load(anime.getImage())
                    .into(imagen);

            estrella.setImageResource(R.drawable.estb);
        }
    }
}
