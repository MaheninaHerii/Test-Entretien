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
        if (nombreArabe >= 5) {
            return "V" + enChiffreRomain(nombreArabe - 5);
        }else if(nombreArabe >= 4){
            return "IV" + enChiffreRomain(nombreArabe - 4);
        }else {
            return "I" + enChiffreRomain(nombreArabe - 1);
        }
    }
}
