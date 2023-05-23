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

    @Test
    void convertirLeChiffreEntre40et49() {
        //given
        int valeur = 49;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("XLIX",chiffreRomain);
    }

    @Test
    void convertirLeChiffreEntre50et89() {
        //given
        int valeur = 84;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("LXXXIV",chiffreRomain);
    }

    @Test
    void convertirLeChiffreEntre90et99() {
        //given
        int valeur = 95;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("XCV",chiffreRomain);
    }

    @Test
    void convertirLeChiffreEntre100et399() {
        //given
        int valeur = 297;
        //when
        String chiffreRomain = Convertir.enChiffreRomain(valeur);
        //then
        Assertions.assertEquals("CCXCVII",chiffreRomain);
    }
}