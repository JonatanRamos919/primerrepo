/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana1;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Jona Ramos
 */
public class cuotas {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
      
      
    
    System.out.print("ingrese el monto del prestamo (prestamo): ");
    double prestamo = scanner.nextDouble();
    System.out.print("ingrese el plazo de pago en meses : ");
    int meses = scanner.nextInt();
    System.out.print("ingrese el interes mensual (%) : ");
    double intereses = scanner.nextDouble();
    System.out.print("ingrese la comision por cuota : ");
    double comision = scanner.nextDouble();
    System.out.print("ingrese el porcentaje de seguro mensual (%): ");
    double porcentaje = scanner.nextDouble();
    
        double interesTotal = prestamo * intereses / 100 * meses;
        double totalBase = prestamo + interesTotal;
        double cuotaBase = totalBase / meses;
        double valorSeguro = cuotaBase * porcentaje / 100;
        double cuotaFinal = cuotaBase + comision + valorSeguro;
        double totalFinal = cuotaFinal * meses;
        
        System.out.println("\n****cuotas mensuales****");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f\n", cuotaFinal);
        System.out.printf("Total a Pagar: HNL %.2f\n", totalFinal);
        
                
                }
    
}
    
    
    
   

