/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
const val PI = 3.1416
fun main() {
    println("Hello, world!!!")
    
    var dinero: Int = 5000
    println(dinero)
    dinero = 2000 
    println(dinero)
    
    val dineroFijo: Int =2500 
    println(dineroFijo)
 //		dineroFijo = 2000
 //		println(dineroFijo)
 
 
 	// 1. DECLARAR DISTINTAS VARIABLES DE LOS SIGUIENTES TIPOS: STRING, INT, BOOLEAN, DOUBLE.
    val valorcadena: String = "Mi nombre"
    val valorbool: Boolean = true
    val numerolon: Long = 5000000
    val decimales: Double = 1.797
    val flotante: Float = 1.5f
    
    // impresion de variables
    println(PI)
    println(valorcadena)
    println(valorbool)
    println(numerolon)
    println(decimales)
    println(flotante)
    
    // 2. CONCATENAR DOS VARIABLES DE TIPO STRING USANDO INTERPOLACION DE STRINGS.
    val minombre = "Gustavo"
    val miapellido = "Cruz"
    val nombreCompleto = minombre + " " + miapellido
    println(nombreCompleto)
    val nombreCompleto2 = "$minombre $miapellido ETC"
    println(nombreCompleto2)
    
    // Operaciones
    val primervalor = 10
    val segundovalor = 5
    println(primervalor.times(5)) 
    println(primervalor. minus(segundovalor))
    println(primervalor - segundovalor)
    
    
	// 3. DECLARAR Y ASIGNAR VARIABLE DE TIPO INT, USAR IF PARA VALIDAR SI LA VARIABLE ES > 18 
	// ENTONCES IMPRIMIR "MAYOR DE EDAD" DESPUES USAR ELSE IF PARA VALIDAR SI LA VARIABLE ES > 0 
	// ENTONCES IMPRIMIR "MENOR DE EDAD" Y POR ULTIMO USAR ELSE PARA IMPRIMIR "ERROR"
    var daniel: Int = 27
    var geronimo: Int = 33
    var dorian: Int = 0
    //if para definir edades o error
    var mensaje : String 
    mensaje = if (daniel > 18)"MAYOR DE EDAD" else if (daniel > 0) "MENOR DE EDAD" else "error"
    var mensaje2 : String 
    mensaje2 = if (geronimo > 18)"MAYOR DE EDAD" else if (geronimo > 0) "MENOR DE EDAD" else "error"
    var mensaje3 : String 
    mensaje3 = if (dorian > 18)"MAYOR DE EDAD" else if (dorian > 0) "MENOR DE EDAD" else "error"
   	//impresion de mensajes edad y error
    println (mensaje)
    println (mensaje2)
    println (mensaje3)
 
	// 4. USAR CICLO FOR PARA IMPRIMIR 35 VECES LA CONCATENACION DEL PUNTO 2
    	for(i in 1..35){
        println("Contando $nombreCompleto")}
        
    // 5. DECLARAR Y ASIGNAR VARIABLE INT, USAR CICLO WHILE PARA SEGUIR ITERANDO SIEMPRE Y 
    //CUANDO LA VARIABLE SEA > 10, DENTRO DEL CICLO, GENERAR Y ASIGNAR UN VALOR RANDOM 
    //USANDO .RANDOM() DE LOS RANGOS DE NUMEROS 0..99
    var contador = 20
    while (contador > 10){
        println(contador)
        contador--
    }
    do{
        println ("generando numero")
    	val numerorandom = (0..99).random()
        println("numero random: $numerorandom")
    }  while (numerorandom >10)
   
   val listajuegos = listOf("warzone","battlefield","cyberpunk","daysgone",)
   for (juego in listajuegos)
   println("El juego de hoy es: $juego")
    
    // 6. HACER UN EJEMPLO DEL USO DE SAFE CALL (NULL SAFETY EN KOTLIN)
    
//      var nombre: String? = null
//    println(nombre?.length)
    
    //7. HACER UN EJEMPLO DEL USO DE DOUBLE BANG (NULL SAFETY EN KOTLIN)
//    var nombre: String? = null
//    println(nombre?.length)
    
//    try{
        
//  }
//    catch(ex: NullPointerException){
//        println("error de puntero nulo")
//    }
//    finally {
//        print("sin nombre")
//    }
   
   // 8. DECLARAR Y ASIGNAR DOS VARIABLES INT, LA SEGUNDA QUE SEA = 0,
   //  DESPUES DIVIDIR LA PRIMER VARIABLE ENTRE LA SEGUNDA Y CACHAR 
   //  EL ERROR QUE SE PRODUCE USANDO TRY Y CATCH, EN CATCH IMPRIMIR "ERROR: DIVISION ENTRE CERO"
    val valor1 = 10
    val valor2 = 0
    val resultado: Int = try { valor1 / valor2 } catch(ex: Exception) {0}
   // println(resultado)
     finally{
        print("ERROR: DIVISION ENTRE CERO")}
   // 9. HACER UN EJEMPLO DEL USO DEL OPERADOR ELVIS ?:
    var nombre: String? = null
    val numLetras: Int = nombre?.length ?: 0
    println(numLetras)
   // 10. CREAR UNA LISTA INMUTABLE DE 5 NOMBRES (STRINGS)
   val listaNombres = listOf<String>("Gustavo","Geronimo","Daniel","Dorian","Ariel")
   println(listaNombres)
   
  // 11. CREAR UNA LISTA MUTABLE DE 5 NUMEROS (INTS), AGREGAR 2 ELEMENTOS Y POR ULTIMO BORRAR 1 ELEMENTO
  val listaVacia = mutableListOf<Int>(1,2,3,4,5)
   println(listaVacia)
   // Agregando
    listaVacia.add(6)
   listaVacia.add(7)
   println(listaVacia)
   // Borrando
   listaVacia.remove(7)
   println(listaVacia)
  
 // 12. ORDENAR EN REVERSA EL LISTADO MUTABLE DE LOS 5 NUMEROS E IMPRIMIRLA.
  val numeritos = listOf(1,2,3,4,5)
  val numerosEnReversa = numeritos.reversed()
  	println (numerosEnReversa)
 //	13. CREAR UN MAP.
 var edadAmigos = mapOf(
 "Gustavo" to 26,
 "Geronimo" to 33,
 "Daniel" to 27
 )
 println(edadAmigos)
 // 14. CREAR UN SET.
 val nicks = setOf("Savage","Tfue","Iron","Nickmerch","Aydan")
 println(nicks)
 
//NOTA PARA HACER USO DEL PUNTO 15, 16, 17 QUITAR COMENTARIOS SOLO DEL PUNTO A UTILIZAR.
 
// 15. CREAR UNA VARIABLE LA CUAL RECIBA DOS PARAMETROS (NOMBRE: STRING Y EDAD: INT), 
// RETORNAR UN STRING, EL CONTENIDO DE LA FUNCION UTILIZARA EL IF, ELSE IF Y ELSE DEL PUNTO 3, 
// DONDE DEVOLVEREMOS UN MENSAJE (STRING) AGREGANDO EL PARAMETRO NOMBRE USANDO INTERPOLACION DE STRINGS. 
// EJEMPLOS DE RETORNO: "EL USUARIO JESUS ES MAYOR DE EDAD", "EL USUARIO JOSE ES MENOR DE EDAD",
//  "ERROR" (SI LA EDAD ES 0 O MENOS).
 
// nombreEdad(nombre = "LUIS", edad= 33)
//  }
//     fun nombreEdad(nombre: String, edad: Int){
//    var mensaje : String 
//     mensaje = if (edad > 18)"MAYOR DE EDAD" else if (edad > 0) "MENOR DE EDAD" else "error"     
//    println("EL USUARIO $nombre ES $mensaje ")  
//  }
   
// 16. LLAMAR LA FUNCION ANTERIOR 5 VECES CON DISTINTOS VALORES EN LOS PARAMETROS.
// nombreEdad(nombre = "LUIS", edad= 0)
// nombreEdad(nombre = "JOSE", edad= 20)
// nombreEdad(nombre = "SAUL", edad= 17)
// nombreEdad(nombre = "GUSTAVO", edad= 26)
// nombreEdad(nombre = "LUIS", edad= 33)
//  }
//     fun nombreEdad(nombre: String, edad: Int){
//    var mensaje : String 
//     mensaje = if (edad > 18)"MAYOR DE EDAD" else if (edad > 0) "MENOR DE EDAD" else "error"     
//    println("EL USUARIO $nombre ES $mensaje ")  
//  }
 



// 17. HACER USO DE PARAMETROS POR DEFAULT EN LOS PARAMETROS DE LA FUNCION DEL PUNTO 15.   

//    nombreEdad(nombre = "LUIS", edad= 33)
//  }
//     fun nombreEdad(nombre: String, apellido: String="Default", edad: Int){
//    var mensaje : String 
//     mensaje = if (edad > 18)"MAYOR DE EDAD" else if (edad > 0) "MENOR DE EDAD" else "error"     
//    println("EL USUARIO $nombre $apellido ES $mensaje ")  
  } 
