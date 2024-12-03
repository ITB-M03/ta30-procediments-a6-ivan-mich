package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IncrementarNumeroKtTest {

    @Test
    fun incrementarNumero() {
        var esperat = 7

        assertEquals(esperat, controllers.incrementarNumero(3, 4), "No suma bien")

    }
}