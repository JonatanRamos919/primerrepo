/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramos_jonatan_exam1.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
public class Ramos_Jonatan_Exam1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner lea=new Scanner(System.in);
    Random random=new Random();
   
    int opcion=0;
    while(opcion!=5){
    System.out.println("---- Menu ----");
    System.out.println("1- Piramide");
    System.out.println("2- Clave");
    System.out.println("3- Piedra,papel o tijera");
    System.out.println("4- Adivinar");
    System.out.println("5- Salir");
    System.out.print("seleccione una opcion :");
    opcion=lea.nextInt();
    lea.nextLine();
            
    if(opcion==1){
        
      System.out.print("ingrese la cantidad de fila de la piramide :");
      int filas=lea.nextInt();
      lea.nextLine();
       
      int numero=1;
      int contador=1;
      
      while(contador<=filas){
          int suma =0;
          int  resultado=contador*contador*contador;
          
          while(suma<resultado){
      System.out.print(numero+ " ");
      suma=suma+numero;
      numero=numero+2;
      
      
          }
          System.out.println("="+suma);
          contador++;
      }
    }
    
    if(opcion==2){
        System.out.print("ingrese un texto :");
        String texto=lea.nextLine();
        
        
       String mayusculas="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
       String minusculas="abcdefghijklmnñopqrstuvwxyz";
       String minusculasReves="zyxwvutsrqpoñnmlkjihgfedcba";
       String mayusculasReves="ZYXWVUTSRQPOÑNMLKJIHGFEDCBA";
       String textoNuevo="";
       int conteo=0;
       while(conteo<texto.length()){
          char letra=texto.charAt(conteo);
          char letraNueva=letra;
          
        int contador=0;
        while(contador<mayusculas.length()){
        if(letra==mayusculas.charAt(contador)){
            letraNueva=mayusculasReves.charAt(contador);
            contador=mayusculas.length();
        }
         contador++; 
       }
       
        int contar=0;
        while(contar<minusculas.length()){
          if(letra==minusculas.charAt(contar)){
          letraNueva=minusculasReves.charAt(contar);
          contar=minusculas.length();
          }
          contar++;
        }
       
        textoNuevo+=letraNueva;
        conteo++;
      } 
       System.out.println("texto cifrado : "+textoNuevo);
    }
    if(opcion==3){
      String jugar="si";
        while(jugar=="si")
        System.out.println("Bienvenido al juego de piedra, papel o tijera");
        System.out.println("ingrese (piedra/papel/tijera) :");
        String usuario=lea.nextLine();
        
        if(usuario.equals("piedra") ||usuario.equals("papel")||usuario.equals("tijera")){ 
            int numeroRandom=random.nextInt(3);
            String consola="";
            
            if(numeroRandom==0){
                consola="papel";
            }else if(numeroRandom==1){
                consola="tijera";
            }else{
                consola="piedra";
            }
          System.out.println("la maquina eligio :"+consola);
           
            if(usuario==consola){
                System.out.println("EMPATE");
            }else if((usuario.equals("papel")&&consola.equals("piedra"))||(usuario.equals("tijera")&&consola.equals("papel"))||(usuario.equals("piedra")&&consola.equals("tijeras"))){
            System.out.println("GANASTE");
            }else{
                System.out.println("Perdiste");
        }
            
        }else{
            System.out.println("ingrese la palabra correctamente");
            


            
        }          

    }
    if(opcion==4){
    }
    if(opcion==5){
        System.out.println("Gracias por usar el menu");
    }
    }
}
}


