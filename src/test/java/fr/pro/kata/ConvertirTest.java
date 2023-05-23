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

    @Test
    void convertirLeChiffre4() {
        //given
        int valeur = 4;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("IV",chiffreRomain);
    }

    @Test
    void convertirLeChiffre5() {
        //given
        int valeur = 5;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("V",chiffreRomain);
    }

    @Test
    void convertirLeChiffre9() {
        //given
        int valeur = 9;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("IX",chiffreRomain);
    }

    @Test
    void convertirLeChiffreEntre10et39() {
        //given
        int valeur = 27;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("XXVII",chiffreRomain);
    }
}