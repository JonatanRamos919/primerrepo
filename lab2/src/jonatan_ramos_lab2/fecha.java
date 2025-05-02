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
public class fecha {
    public static void main (String[] args){
    Scanner lea=new Scanner(System.in);
    lea.useDelimiter("\n");
    
    System.out.print("Ingrese la primera fecha(dia/mes/año):");
    String fecha1=lea.next();
    System.out.print("Ingrese la segunda fecha(dia/mes/año):");
    String fecha2=lea.next();
    
    String Dia1= fecha1.substring(0,2);
    String Mes1=fecha1.substring(3,5);
    String Año1=fecha1.substring(6,10);
    String Dia2=fecha2.substring(0,2);
    String Mes2=fecha2.substring(3,5);
    String Año2=fecha2.substring(6,10);
    
    int dia1=Integer.parseInt(Dia1);
    int dia2=Integer.parseInt(Dia2);
    int mes1=Integer.parseInt(Mes1);
    int mes2=Integer.parseInt(Mes2);
    int año1=Integer.parseInt(Año1);
    int año2=Integer.parseInt(Año2);
    
    int total1=año1*360+mes1*30+dia1;
    int total2=año2*360+mes2*30+dia2;
    
    int dif=0;
            
    if (total1>total2){
        dif=total1-total2;
    }
    else{
        dif=total2-total1;
    }
    System.out.println("La diferencia de dias es :"+ dif);
    
    }
}
