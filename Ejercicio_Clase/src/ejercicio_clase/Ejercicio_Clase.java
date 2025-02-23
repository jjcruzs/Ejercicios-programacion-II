package ejercicio_clase;

public class Ejercicio_Clase {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", "Cruz", 4444, "14/02/2000");
   
        Persona persona2 = new Persona("Jose", "Serna", 4444, "15/06/2070");
        
        System.out.println("Informacion persona 1: ");
        persona1.imprimir();
        
        System.out.println("\nInformacion persona 2: ");
        persona2.imprimir();
        
        }

    }

