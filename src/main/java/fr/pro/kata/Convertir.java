package fr.pro.kata;

public class Convertir {

    /**
     * Méthode permet de convertir chiffre arabe en chiffre romain.
     * @param nombreArabe
     * @return
     */
    public static String enChiffreRomain(int nombreArabe) {
        if (nombreArabe <= 0) {
            return "";
        }

        if (nombreArabe >= 40) {
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
