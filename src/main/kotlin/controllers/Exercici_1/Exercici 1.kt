package controllers.Exercici_1
import java.util.*

data class Punt(
    var x: Float,
    var y: Float
)

/**
 * @author Ivan Torres
 * @param p punto al que dar formato
 */
fun mostraPunt(p: Punt): String {
    var resultat ="(${"%.6f".format(p.x)}, ${"%.6f".format(p.y)})"
    return resultat
}
/**
 * @author Ivan Torres
 * @param p punto que trasladar
 * @param desplacament es el punt a que es desplaça
 */
fun transladaPunt(p: Punt, desplacament: Punt) {
    p.x += desplacament.x
    p.y += desplacament.y
}
/**
 * @author Ivan Torres
 * @param factor el numero per el que haurem de multiplicar el punt
 */
fun escalaPunt(p: Punt, factor: Float) {
    p.x *= factor
    p.y *= factor
}
/**
 * @author Ivan Torres
 * @param p1 primer punt a comparar
 * @param p2 segon numero a comparar
 * @return boolean
 */
fun sonPuntsIguals(p1: Punt, p2: Punt): Boolean {
    var resultat :Boolean
    if (p1.x == p2.x && p1.y == p2.y) resultat=true
    else resultat=false
    return resultat
}
/**
 * @author Ivan Torres
 */
fun llegirPunt(): Punt {
    println("Introdueix les coordenades del punt (x, y):")
    var scan = Scanner(System.`in`)
    print("x: ")
    var x = scan.nextFloat()
    print("y: ")
    val y = scan.nextFloat()
    return Punt(x, y)
}

fun main() {
    println("Punt inicial:")
    var p1 = llegirPunt()
    mostraPunt(p1)
    var p2 = llegirPunt()
    if (sonPuntsIguals(p1,p2)==true) println("Son punts iguals")
    else println("Son punts diferents")
    mostraPunt(p1)
    mostraPunt(p2)
    println("Desplaçament:")
    var desplacament = llegirPunt()

    transladaPunt(p1, desplacament)
    println("Després de la translació:")
    mostraPunt(p1)

    println("Introdueix un factor d'escala:")
    var scanner = Scanner(System.`in`)
    var factor = scanner.nextFloat()
    escalaPunt(p1, factor)
    println("Després de l'escalat:")
    mostraPunt(p1)
}
