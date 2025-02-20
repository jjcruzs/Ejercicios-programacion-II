package invertircadena;

import javax.swing.JOptionPane;

public class InvertirCadena {

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Ingresa una cadena de texto:");
        String invertida = new StringBuilder(cadena).reverse().toString();
        JOptionPane.showMessageDialog(null, "Cadena invertida: " + invertida);
    }
}




