package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        int opcion;
        do {
            String menu = "Seleccione la operación:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n"
                    + "5. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcion == 5) {
                break;
            }
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                default:
                    break;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        } while (opcion != 5);
    }
}
