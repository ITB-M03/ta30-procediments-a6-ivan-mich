package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class IncrementarNumeroFallaKtTest {

@Test
 fun incrementarNumero() {
 var esperat = 1000
 assertEquals(esperat, controllers.incrementarNumero(700,200),"falla tu suma,return to the kinderGarden")
 }
}