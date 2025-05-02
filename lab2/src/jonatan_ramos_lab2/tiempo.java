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
public class tiempo {
    public static void main (String[] arg){
     Scanner lea= new Scanner(System.in);
     
     System.out.print("Ingrese un numero de segundos:");
     int segundos=lea.nextInt();
     int Horas= segundos/ 3600;
     int sobrante= segundos% 3600;
     int minutos=sobrante/60;
     int segundosSobrantes= sobrante%60;
     
     if (segundos<=0){ 
     String mensaje= (segundos<=0)? "no se permite ese valor" : "" ;
     System.out.println(mensaje);  
     }
     
     System.out.println("Horas:"+ Horas);
     System.out.println("Minutos:"+ minutos);
     System.out.println("Segundos:"+ segundosSobrantes);
     
     
     
            
     
     
     
     
    }
    }

