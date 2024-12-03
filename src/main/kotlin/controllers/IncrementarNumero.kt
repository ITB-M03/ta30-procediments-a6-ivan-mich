package controllers

import java.util.Scanner

fun main(){
    var scanner=Scanner(System.`in`)
    var numeroIngresado:Int=scanner.nextInt()
    var cantidadAumentar:Int=scanner.nextInt()
    var numeroIncrementado= incrementarNumero(numeroIngresado,cantidadAumentar)
    println("resultado es: $numeroIncrementado")
}

/**
 *funcion para incrementar un numero a partir de una cantidad dada sea negativo o positivo
 * @author Michelle
 * @param numero
 * @param cantidad
 */
fun incrementarNumero(numero:Int ,cantidad:Int): Int{
    var resultat: Int
    resultat= numero+cantidad
    return resultat
}

