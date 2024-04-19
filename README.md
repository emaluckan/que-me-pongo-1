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


[QMP1](https://docs.google.com/document/d/1k1f-9AuIohlBGB2soSNePJ6jLxM37_tZeSD-hW_esIQ/edit)




SEGUNDA TERACION
---------------------------------------
Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado). LISTO
Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es. LISTO
Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc) 
para evitar elegir materiales inconsistentes con el tipo de prenda.LISTO
Como usuarie de QuéMePongo, quiero guardar un borrador de la última prenda que empecé a cargar para continuar después. FALTA
Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa. LISTO
Como usuarie de QuéMePongo, quiero poder guardar una prenda solamente si esta es válida. FALTA

Como usuario QueMePongo, quiero poder recibir sugerencias de uniformes armados. FALTA
Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado FALTA
Como administrador de QueMePongo, quiero poder configurar diferentes uniformes para distintas instituciones FALTA

