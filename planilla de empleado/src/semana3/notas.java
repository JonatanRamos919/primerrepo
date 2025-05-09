/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;
import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
public class notas {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
 System.out.print("Ingresar la cantidad de notas:");
 int cantidadnotas = lea.nextInt();
 
 int cantidadNota=0;
 double valor_nota;
 double sumaNotas=0;
 
 while (cantidadNota<cantidadnotas){
     System.out.println("nota# "+(cantidadNota +1)  + ":");
       valor_nota=lea.nextDouble(); 
      
      if (valor_nota<0  || valor_nota>100){
          System.out.println("ingrese un numero entre 0 y 100.");
          continue;
 }
 sumaNotas+=valor_nota;
 cantidadNota++;   
}
 
 double promedio=(sumaNotas/cantidadnotas);
 
 
 System.out.println("Promedio :"+promedio);
}
}
