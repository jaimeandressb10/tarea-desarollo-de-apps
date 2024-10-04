package com.example.pruebarecyclerview.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.MainActivity2;
import com.example.pruebarecyclerview.R;
import com.example.pruebarecyclerview.clases.Bebida;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BebidasAdaptador extends RecyclerView.Adapter<BebidasAdaptador.ViewHolder> {

    private List<Bebida> datos;

    public BebidasAdaptador(List<Bebida> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public BebidasAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BebidasAdaptador.ViewHolder holder, int position) {
        Bebida dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_bebidas, txt_descripcion_bebidas;
        ImageView img_bebidas;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_bebidas = itemView.findViewById(R.id.txt_nombre_bebidas);
            txt_descripcion_bebidas = itemView.findViewById(R.id.txt_descripcion_bebidas);
            img_bebidas = itemView.findViewById(R.id.img_bebidas);
        }

        public void bind(Bebida dato){
            txt_nombre_bebidas.setText(dato.getNombre());
            txt_descripcion_bebidas.setText(dato.getDescripcion());
            //imagen libreria
            Picasso.get().load(dato.getImagen()).into(img_bebidas);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), MainActivity2.class);
                    i.putExtra("imagen",dato.getImagen());
                    i.putExtra("nombre",dato.getNombre());
                    i.putExtra("descripcion",dato.getDescripcion());
                    view.getContext().startActivity(i);
                }
            });
        }
    }

}
