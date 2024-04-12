package org.example;

class Prenda {
  String tipoPrenda;
  String categoria;
  String telaOMaterial;
  String colorPrincipal;
  String colorSecundario;

    public Prenda(String tipoPrenda, String categoria, String telaOMaterial, String colorPrincipal, String colorSecundario) {
      if (tipoPrenda == null) {
        throw new PrendaInvalida("El tipo de prenda no puede ser un campo vacío");
      }

      if (categoria == null) {
        throw new PrendaInvalida("la categoria no puede ser un campo vacío");
      }

      if (telaOMaterial == null) {
        throw new PrendaInvalida("La tela o material no puede ser un campo vacío");
      }

      if (colorPrincipal == null) {
        throw new PrendaInvalida("El color principal no puede ser un campo vacío");
      }

      this.tipoPrenda = tipoPrenda;
      this.categoria = categoria;
      this.telaOMaterial = telaOMaterial;
      this.colorPrincipal = colorPrincipal;
      this.colorSecundario = colorSecundario;
    }

    public boolean esValida(){

      if(false){//si una prenda se condice con su tipo -> tirar error
        throw new PrendaInvalida("El tipo de prenda que intentas ingresar no le corresponde a esa categoria");
      }

      return true;
    }

  }

class PrendaInvalida extends RuntimeException {
  public PrendaInvalida(String mensaje) {
    super("La prenda es inválida porque " + mensaje);
  }
}