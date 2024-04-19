package org.example;

import java.util.List;

class Prenda {
  TipoPrenda tipoPrenda;
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  Trama trama;


  public Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Material material, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.colorPrimario = colorPrimario;
    this.material = material;
    this.trama = trama;
  }

  public Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Color colorSecundario, Material material, Trama trama) {

    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color es obligatorio");
    }

    if (tipoPrenda == null) {
      throw new IllegalArgumentException("La prenda es obligatorio");
    }

    if (material == null) {
      throw new IllegalArgumentException("La prenda es obligatorio");
    }

    if (trama == null) {
      this.trama = Trama.LISA;
    }
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
  }

}

enum Material {
  ALGODON,
  TELA,
  CUERO
}

enum Color {
  AZUL,
  MARRON,
  NARANJA,
  AMARILLO,
  ROJO,
  ROSA,
  NEGRO,
  BLANCO
}

enum Trama {
  LISA,
  RAYADA,
  CUADROS,
  ESTAMPADO
}

/*class Prenda {
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

  @Override
  public String toString() {
    return "Prenda{" +
        "tipoPrenda='" + tipoPrenda + '\'' +
        ", categoria='" + categoria + '\'' +
        ", telaOMaterial='" + telaOMaterial + '\'' +
        ", colorPrincipal='" + colorPrincipal + '\'' +
        ", colorSecundario='" + colorSecundario + '\'' +
        '}';
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


*/
