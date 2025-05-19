/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
public class ejercicio {

    public static void main(String[] args) {
boolean vocal=false;
        Scanner lea = new Scanner(System.in);

        System.out.print("ingresar una palara");
        String palabra = lea.next();

        System.out.println("tamaño:" + palabra.length());

        for (int indice = 0; indice < palabra.length(); indice++){
        char letra = palabra.charAt(indice);
        System.out.println("[" + indice + "]:"+letra);
    
      
    
        if (letra == 'a' || letra == 'e' ||letra == 'i' || letra == 'o' || letra == 'u'){
        
        vocal=true;
        
    
        }
        }    
    
    
    
    
    
    
    
    
    
    
    
    }
}
