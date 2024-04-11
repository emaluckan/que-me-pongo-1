Primera Iteración

Comenzaremos definiendo que un atuendo es una combinación de prendas que tiene sentido usar juntas. Algunos ejemplos de atuendos podrían ser:
tus anteojos de sol favoritos, una remera de mangas cortas azul, el pantalón que te regaló tu mamá y unas zapatillas converse.
un pañuelo verde, una remera de mangas largas rayada, un pantalón de jean y un par de botas de cuero.
una musculosa de mickey, una pollera amarilla y unas crocs.

Como primer paso para generar los atuendos, les usuaries de QuéMePongo identificaron el siguiente requerimiento como principal:

//importante
Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.

entonces el primer "Requerimiento" que tenemos es VALIDAR las prendas que carguemos


entonces hasta el momento tendria algo por el estilo

//pseudo
class Prenda{
    String tipoPrenda;
    String categoria;
    String telaOMaterial;
    String colorPrincipal;
    String colorSecundario;
}

y para el constructor 

public Prenda(String tipoPrenda, String categoria, String telaOMaterial, String colorPrincipal, String colorSecundario){
self.tipoPrenda = tipoPrenda;
self.categoria = categoria;
self.telaOMaterial = telaOMaterial;
self.colorPrincipal = colorPrincipal;
self.colorSecundario = colorSecundario;
}

Prenda buzoInvierno = new Prenda("buzo", "parte superior", "algodon", "negro", null);

//"Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado)."

Entonces Ahi chequeo los pocos casos con ifs si es null, en tal caso lanzo una excepcion

if (tipoPrenda == null) {
throw new PrendaInvalida("El tipo de prenda no puede ser un campo vacío");
}

