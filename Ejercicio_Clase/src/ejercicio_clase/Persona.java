package ejercicio_clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Persona {
    
    public String nombre;
    public String apellido;
    public int identificacion;
    public String fechaNacimiento;
    public String paisNacimiento;
    public char genero;

    public Persona(String nombre, String apellido, int identificacion, String fechaNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
        
       
        if (genero == 'H' || genero == 'M') {
            this.genero = genero;
        } else {
            System.out.println("Género inválido. Se asignará 'H' por defecto.");
            this.genero = 'H';
        }
    }
    
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNac, hoy);
        return periodo.getYears();
    }
    
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
        System.out.println("Edad: " + calcularEdad() + " años");
    }
}

