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
public class TABLAS {
    public static void main(String[] args){
Scanner lea=new Scanner(System.in);

System.out.print("¿Que numero desea multiplicar?");
        int numero=lea.nextInt();
        
System.out.print("¿Hasta que numero desea multiplicar?");
        int limite=lea.nextInt();
        
    int multiplicador=1;
    int resultado=0;
       
while (true){
    if (multiplicador>limite){
    break;
}else {
     resultado=numero*multiplicador;
     System.out.println(numero+"*"+multiplicador+"="+resultado);
        multiplicador++;
        }
}
    }
}
    

    
    
    
    
    
    
    
    
    
    
    
    
    
