/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jonatan_ramos_lab2;
import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
 
public class pagos {
   public static void main (String[] args) {
      Scanner lea= new Scanner(System.in);
      lea.useDelimiter("\n");
      
      
      System.out.println("****Datos del empleado****");
      System.out.print("Ingresar codigo de empleado:");
      int codigo= lea.nextInt();
      System.out.print("Ingresar nombre y apellido:");
      String nombre= lea.next();
      System.out.print("Ingrese las horas trabajadas:");
      int Horas= lea.nextInt();  
      System.out.print("ingrese la categoria:");
      int categoria=lea.nextInt();
      int horasNormales= 0;
      int horasExtra = 0;   
      double pagonormal= 35.99;
      double pagoExtra= 0;
    
      
      if (Horas<=40){
          horasExtra=0;
          horasNormales= Horas;
      }
      else{
          horasNormales=40;
          horasExtra=Horas-40;
      }
      if(horasExtra>15){
      horasExtra=15;   
      }
      switch (categoria){
          case 1:
              pagoExtra= 40;
              break;
          case 2:
              pagoExtra=50;
              break;
          case 3:
              pagoExtra=85;
              break;
          case 4:
              pagoExtra=0;
              break;
          default:
              System.out.println("categoria inexistente,ingrese una correcta.");
              return;
      }
      double pagototalNormal=Horas*pagonormal;
      double pagototalExtra=horasExtra*pagoExtra;     
      double pagoTotal=pagototalNormal+pagototalExtra;
      
      
      System.out.println("****Boleta de pago****");
      System.out.println("codigo:"+codigo);
      System.out.println("Nombre:"+nombre);
      System.out.println("Horas Normales:"+ horasNormales);
      System.out.println("Horas Extras:"+horasExtra );
      System.out.println("Pago Horas Normales:"+String.format("%.2f", pagototalNormal));
      System.out.println("Pago Horas Extras:"+pagototalExtra);
      System.out.println("Total De Pago:"+String.format("%.2f", pagoTotal));
   }
   
}
