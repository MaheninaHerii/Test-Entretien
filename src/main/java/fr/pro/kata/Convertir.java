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
        return "I" + enChiffreRomain(nombreArabe - 1);
    }
}
