package ejercicio_clase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Persona {
    
    public String nombre;
    public String apellido;
    public int identificacion;
    public String fechaNacimiento;

    public Persona(String nombre, String apellido, int identificacion, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public int calcularEdad(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNac, hoy);
        return periodo.getYears();
    }
    
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Fecha nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
}
