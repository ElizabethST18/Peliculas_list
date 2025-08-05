package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        Pelicula otraPelicula = new Pelicula("Avatar" , 2023);
        var peliculaDeBruno = new Pelicula("el señor de los anillos", 2001);
        Serie lost = new Serie("Lost" , 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);
        
    }
}
