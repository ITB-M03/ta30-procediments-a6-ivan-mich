package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class IncrementarNumeroSiEsNegativoKtTest {

@Test
 fun incrementarNumero() {
 var esperat= -4
 assertEquals(esperat, controllers.incrementarNumero(-2, -2), "suma bien")
 }
}