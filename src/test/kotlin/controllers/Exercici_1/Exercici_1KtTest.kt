package controllers.Exercici_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Exercici_1KtTest {

    @Test
    fun testMostraPunt() {
        val punt1 = Punt(3.0f, 4.5f)
        val resultat = mostraPunt(punt1)
        val esperat = "(3,000000, 4,500000)"
        assertEquals(esperat, resultat)
    }

    @Test
    fun testMostraPunt2() {
        val punt2 = Punt(-2.3f, -5.8f)
        val resultat = mostraPunt(punt2)
        val esperat = "(-2,300000, -5,800000)"
        assertEquals(esperat, resultat)
    }

    @Test
    fun testMostraPunt3() {
        val punt3 = Punt(0.001f, 0.0001f)
        val resultat = mostraPunt(punt3)
        val esperat = "(0,001000, 0,000100)"
        assertEquals(esperat, resultat)
    }

    @Test
    fun transladaPunt1() {
        val puntOriginal = Punt(2.0f, 3.0f)
        val desplaçament = Punt(1.0f, 2.0f)
        transladaPunt(puntOriginal, desplaçament)
        assertEquals(3.0f, puntOriginal.x)
        assertEquals(5.0f, puntOriginal.y)
    }

    @Test
    fun transladaPunt2() {
        val puntOriginal = Punt(-3.0f, -4.0f)
        val desplaçament = Punt(2.0f, 1.0f)
        transladaPunt(puntOriginal, desplaçament)
        assertEquals(-1.0f, puntOriginal.x)
        assertEquals(-3.0f, puntOriginal.y)
    }

    @Test
    fun transladaPunt3() {
        val puntOriginal = Punt(5.0f, 6.0f)
        val desplaçament = Punt(-5.0f, -6.0f)
        transladaPunt(puntOriginal, desplaçament)
        assertEquals(0.0f, puntOriginal.x)
        assertEquals(0.0f, puntOriginal.y)
    }

    @Test
    fun escalaPunt1() {
        val puntOriginal = Punt(2.0f, 3.0f)
        val factorEscalat = 2.0f
        escalaPunt(puntOriginal, factorEscalat)
        assertEquals(4.0f, puntOriginal.x)
        assertEquals(6.0f, puntOriginal.y)
    }

    @Test
    fun escalaPunt2() {
        val puntOriginal = Punt(4.0f, 6.0f)
        val factorEscalat = 0.5f
        escalaPunt(puntOriginal, factorEscalat)
        assertEquals(2.0f, puntOriginal.x)
        assertEquals(3.0f, puntOriginal.y)
    }

    @Test
    fun escalaPunt3() {
        val puntOriginal = Punt(3.0f, -2.0f)
        val factorEscalat = -1.0f
        escalaPunt(puntOriginal, factorEscalat)
        assertEquals(-3.0f, puntOriginal.x)
        assertEquals(2.0f, puntOriginal.y)
    }

    @Test
    fun sonPuntsIguals() {
        val punt1 = Punt(3.0f, 4.0f)
        val punt2 = Punt(3.0f, 4.0f)
        assertTrue(sonPuntsIguals(punt1, punt2))
    }

    @Test
    fun sonPuntsIguals2() {
        val punt1 = Punt(3.0f, 4.0f)
        val punt2 = Punt(4.0f, 5.0f)
        assertFalse(sonPuntsIguals(punt1, punt2))
    }

    @Test
    fun sonPuntsIguals3() {
        val punt1 = Punt(0.0001f, 0.0002f)
        val punt2 = Punt(0.0001f, 0.0002f)
        assertTrue(sonPuntsIguals(punt1, punt2))
    }
}