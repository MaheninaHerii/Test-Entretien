package fr.pro.kata;

public class Convertir {

    /** Approche par Récursivité
     * Méthode permet de convertir chiffre arabe en chiffre romain.
     * @param nombreArabe
     * @return
     */
    public static String enChiffreRomain(int nombreArabe) {
        if (nombreArabe <= 0) {
            return "";
        }

        if (nombreArabe >= 1000) {
            return "M" + enChiffreRomain(nombreArabe - 1000);
        } else if (nombreArabe >= 900) {
            return "CM" + enChiffreRomain(nombreArabe - 900);
        } else if (nombreArabe >= 500) {
            return "D" + enChiffreRomain(nombreArabe - 500);
        } else if (nombreArabe >= 400) {
            return "CD" + enChiffreRomain(nombreArabe - 400);
        } else if (nombreArabe >= 100) {
            return "C" + enChiffreRomain(nombreArabe - 100);
        } else if (nombreArabe >= 90) {
            return "XC" + enChiffreRomain(nombreArabe - 90);
        } else if (nombreArabe >= 50) {
            return "L" + enChiffreRomain(nombreArabe - 50);
        } else if (nombreArabe >= 40) {
            return "XL" + enChiffreRomain(nombreArabe - 40);
        } else if (nombreArabe >= 10) {
            return "X" + enChiffreRomain(nombreArabe - 10);
        } else if (nombreArabe >= 9) {
            return "IX" + enChiffreRomain(nombreArabe - 9);
        } else if (nombreArabe >= 5) {
            return "V" + enChiffreRomain(nombreArabe - 5);
        }else if(nombreArabe >= 4){
            return "IV" + enChiffreRomain(nombreArabe - 4);
        }else {
            return "I" + enChiffreRomain(nombreArabe - 1);
        }
    }
}
