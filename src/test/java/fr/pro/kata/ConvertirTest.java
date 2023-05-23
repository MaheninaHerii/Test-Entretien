package fr.pro.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertirTest {

    @Test
    void convertirLeChiffre1() {
        //given
        int valeur = 1;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("I",chiffreRomain);
    }
}