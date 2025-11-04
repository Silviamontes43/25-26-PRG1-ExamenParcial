#Pregunta 1
System.out.println ("Donde golpeas (entre 1 y " + NUMERO_CASILLAS + ")"
posicionGolpe =scanner.nextInt();
##1. Identificar a que se refiere la observación
**Se refiere a un error de sintaxis en la primera línea del código**
**Falta poner ; al final de la primera línea del código.En la segunda línea, se usa scanner sin haberlo declarado ni inicializado antes.**

##2. Explicar si es o no un error y por qué
**Es un error. Faltaría el cierre del punto y coma. La clase scanner no está creada**

##3. Proponer la corrección

System.out.println ("Donde golpeas (entre 1 y " + NUMERO_CASILLAS + ")";
posicionGolpe =scanner.nextInt();

Scanner scanner = new Scanner(System.in); // esto iria al principio del bloque main.






#Pregunta 3
boolean algunMuerto =false;
// ...
boolean algunMuerto=false;

##1. Identificar a que se refiere la observación
**La variable algunMuerto está declarada dos veces con el mismo nombre. No se puede declarar dos veces una variable con el mismo identificador dentro del mismo bloque ya que esto nos daría un error de compilación.**

##2. Explicar si es o no un error y por qué
**Si es un error. En la segunda línea, se intenta volver a crear la variable en el mismo ámbito y java no lo permite. Esto se debe a que en la primera línea ya se ha creado una memoria con la variable algunMuerto**

##3. Proponer la corrección
boolean algunMuerto = false;  

if (condicion) {
    boolean algunMuerto = false; 
}




#Pregunta 6
dineroPorDevolver=cdineroPorDevolver %100;
##1. Identificar a que se refiere la observación
**La observación se refiere a que la variable cdineroPorDevolver no ha sido declarada ni inicializada en ninguna parte del programa.**
**La variable correcta en este caso seria dineroPorDevolver**

##2. Explicar si es o no un error y por qué
**Si, es un error. Nos va a dar error de compilación ya que la variable cdineroPorDevolver no está declarada en ninguna parte**

##3. Proponer la corrección
dineroPorDevolver = dineroPorDevolver % 100;




##Pregunta 7
String salida;
salida = "Se devuelven";
salida=billetesDe200> 0 ? "y"+ billetesDe200+ "billete(s) de 200" : "";
salida=salida+(billetes100>0? "y" +billetes100 +"billete(s) de 100": "");
##1. Identificar a que se refiere la observación
**La observación se refiere a que la variable que se usa no existe. La variable que se ha de utlizar es billetes200**

##2. Explicar si es o no un error y por qué
**Si es un error. Porque la variable billetesDe200 no está declarada**

##3. Proponer la corrección
String salida;
salida = "Se devuelven";
salida = billetes200 > 0 ? " " + billetes200 + " billete(s) de 200" : "";
salida = salida + (billetes100 > 0 ? " y " + billetes100 + " billete(s) de 100" : "");




##Pregunta 10
boolean algunMuerto =false;
final int DAÑO_ESPADA=2;
int vidaGuerrero =20;
final double PORCENTAJE_EXITO_GUERRERO=0.5;
final int DAÑO_MORDIDA =4;
int vidaVampiro=10;
final double PORCENTAJE_EXITO_VAMPIRO=0.5;
boolean algunMuerto=false;
boolean guerreroVivo= true;
boolean vampiroVivo=true;
int vidaGuerrero = 150;
int vidaVampiro = 60;

##1. Identificar a que se refiere la observación
**Hay variables declaradas que están  duplicadas. Estas son algunMuerto, vidaGuerrero y vidaVampiro**

##2. Explicar si es o no un error y por qué
**Si es un error. Porque no se puede declarar una misma variable dos veces**

##3. Proponer la corrección
boolean algunMuerto = false;
final int DAÑO_ESPADA = 2;
final double PORCENTAJE_EXITO_GUERRERO = 0.5;
final int DAÑO_MORDIDA = 4;
final double PORCENTAJE_EXITO_VAMPIRO = 0.5;
boolean guerreroVivo = true;
boolean vampiroVivo = true;
int vidaGuerrero = 150;
int vidaVampiro = 60;
