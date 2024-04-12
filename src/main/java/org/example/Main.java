package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda zapatoPunta = new Prenda("Zapato de noche", "calzado", "cuero", "rojo", null);
        Prenda camperaParaSalir = new Prenda("campera", "parte superior", "algodon", "azul", "bordo");
        Prenda pantalonMoon = new Prenda("pantalon", "parte inferior", "algodon", "negro", null);

        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(zapatoPunta);
        prendas.add(camperaParaSalir);
        prendas.add(pantalonMoon);

        Usuario ema = new Usuario("Emanuel", prendas);

        List<Prenda> prendas1 = ema.getPrendas();
        for(Prenda unaPrenda : prendas1){
            System.out.println(unaPrenda);
        }

    }
}