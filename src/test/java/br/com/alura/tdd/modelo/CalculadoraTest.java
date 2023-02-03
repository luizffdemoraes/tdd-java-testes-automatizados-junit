package br.com.alura.tdd.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void beforeClassTest() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveriaSomarDoisNumerosPositivos() {

        int soma = calculadora.somar(3, 7);

        Assertions.assertEquals(10, soma);
    }

    @Test
    public void testeSomaCalculadora2() {

        int soma = calculadora.somar(3, 0);;

        Assertions.assertEquals(3, soma);
    }

    @Test
    public void testeSomaCalculadora3() {

        int soma = calculadora.somar(3, -1);

        Assertions.assertEquals(2, soma);
    }
}