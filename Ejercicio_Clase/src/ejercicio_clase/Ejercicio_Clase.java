package ejercicio_clase;

public class Ejercicio_Clase {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", "Cruz", 4444, "14/02/2000", "Colombia", 'H');
        Persona persona2 = new Persona("Jose", "Serna", 4444, "15/06/1995", "México", 'H');
        Persona persona3 = new Persona("Maria", "Lopez", 5555, "20/08/1998", "Argentina", 'M');
        
        System.out.println("Información persona 1: ");
        persona1.imprimir();
        
        System.out.println("\nInformación persona 2: ");
        persona2.imprimir();
        
        System.out.println("\nInformación persona 3: ");
        persona3.imprimir();
    }
}


