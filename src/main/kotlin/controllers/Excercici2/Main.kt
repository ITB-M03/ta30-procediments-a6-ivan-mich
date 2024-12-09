package org.example.controllers

import java.util.*

var scanner = Scanner(System.`in`)
fun main() {

    var fila = 20
    var butacas = 15
    var matrizCinema = Array(fila) { Array(butacas) { '_' } }
    var comenzar = mostrarMenu(matrizCinema)
}

/**
 * Funcion para Mostrar y Gestionar un  Menu
 * @author Mich
 */
fun mostrarMenu(matriz: Array<Array<Char>>) {
    var opcion: Int

    do {
        println("\nMenú Principal")
        println("1. Vaciar Sala")
        println("2. Ver butacas Disponibles")
        println("3. reservar Butacas ")
        println("4. Salir")
        print("Seleccione una opción: ")

        opcion = scanner.nextInt()

        when (opcion) {
            1 -> vaciarLaSala(matriz)
            2 -> visualizarAsientos(matriz)
            3 -> reservarButaca(matriz)
            4 -> println("Saliendo del menú. ¡Vuelva Pronto!")
            else -> println("Opción no válida, por favor intente nuevamente.")
        }
    } while (opcion != 4)
}

/**
 * Función que vacia la sala para una nueva proyeccion
 * @author Mich
 * @param matriz
 */
fun vaciarLaSala(matriz: Array<Array<Char>>) {
    var resultado = matriz

    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            resultado[i][j] = '_'
        }
    }
}
/**
 * Funcion para reservar butacas
 * @author Mich
 */
fun reservarButaca(matriz: Array<Array<Char>>){
    println("Ingrese fila")
    var fila = scanner.nextInt() - 1
    println("Ingrese butaca")
    var butaca = scanner.nextInt() - 1
    if (matriz[fila][butaca] == '_') {
        matriz[fila][butaca] = 'X'
        println("Se ha reservado su asiento")
    } else {
        println("Esta ocupada")
    }
}

/**
 * Funcion para visualizar asientos disponibles.
 * @author Mich
 */
fun visualizarAsientos(matriz: Array<Array<Char>>) {
    for (i in 0 until matriz.size) {
        for (j in 0 until matriz[i].size) {
            print(matriz[i][j])
        }
        println()
    }

}







