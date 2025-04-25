/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planilla.de.empleado;
import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
public class PlanillaDeEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            String nombreEmpleado = scanner.next("Jonatan Ramos hola");
            int horasMensuales = scanner.nextInt(160) ;
            int tarifaHora = scanner.nextInt(500);
            int salarioSemanal = scanner.nextInt(20000);
            
            System.out.println("\n****Boleta del empleado****");
            System.out.println("Hora de Trabajo Mensual :" + nombreEmpleado);
            System.out.println("Hora de Trabajo Mensual :" + horasMensuales);
            System.out.println("Tarifa por Hora :Lps." + tarifaHora);
            System.out.println("Salario del Empleado Semanal :lps." + salarioSemanal);
        }
    
}
    
}
