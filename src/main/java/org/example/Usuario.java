package org.example;


//Llamar a cargarPrenda(prenda) y llamaria a prenda.esValida()
//ahi el encargado de validar la prenda o no, sera de la prenda en si

import java.util.ArrayList;
import java.util.List;

class Usuario{
  private String nombre;
  private List<Prenda> prendas;


  public Usuario(String nombre) {
    this.nombre = nombre;
    this.prendas = new ArrayList<Prenda>();
  }

  public void cargarPrenda(Prenda unaPrenda){
    if(unaPrenda.esValida()){
      prendas.add(unaPrenda);
    }
  }







}