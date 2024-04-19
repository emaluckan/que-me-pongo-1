package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TipoPrenda zapato = new TipoPrenda(Categoria.CALZADO);
        TipoPrenda campera = new TipoPrenda(Categoria.SUPERIOR);
        TipoPrenda pantalon = new TipoPrenda(Categoria.INFERIOR);
        TipoPrenda boina = new TipoPrenda(Categoria.ACCESORIO);


        Prenda zapatoPunta = new Prenda(zapato, Color.MARRON, null, Material.CUERO, Trama.ESTAMPADO);
        Prenda camperaDeNoche = new Prenda(campera, Color.ROJO, Color.BLANCO, Material.TELA, Trama.CUADROS);
        Prenda pantalonMoon = new Prenda(pantalon, Color.AZUL, null, Material.ALGODON, Trama.RAYADA);
        Prenda boinaCampestre = new Prenda(boina, Color.AMARILLO, Color.NARANJA, Material.CUERO, Trama.LISA);

    }

}