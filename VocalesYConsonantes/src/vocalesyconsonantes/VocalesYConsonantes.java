package vocalesyconsonantes;

import javax.swing.JOptionPane;

public class VocalesYConsonantes {

    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingresa una palabra:");
        int contadorVocales = 0, contadorConsonantes = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            } else {
                contadorConsonantes++;
            }
        }
        JOptionPane.showMessageDialog(null, "Número de vocales: " + contadorVocales
                + "\nNúmero de consonantes: " + contadorConsonantes);
    }
}
