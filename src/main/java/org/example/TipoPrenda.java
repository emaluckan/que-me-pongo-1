package org.example;

public class TipoPrenda {
  Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }




}

enum Categoria {
  SUPERIOR,
  CALZADO,
  INFERIOR,
  ACCESORIO
}
