/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ramos_Jonatan_estructuraControl;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jona Ramos
 */
public class estructuraControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lea = new Scanner(System.in);
        Random aleatorio = new Random();
        lea.useDelimiter("/n");
        int opcion;

        do {
            System.out.println("*****Menu Principal*****");
            System.out.println("1-Palabra Alreves.");
            System.out.println("2-Numero Perfecto.");
            System.out.println("3-Numeros Primos.");
            System.out.println("4-Votaciones.");
            System.out.println("5-Salir.");
            System.out.println("selecciona una opcion:");
            opcion = lea.nextInt();
     
         while (opcion != 5);

        String palabraLarga = "";
        boolean palindromo = false;

        if (opcion == 1) {
            System.out.print("ingrese una cantidad de palabras");
            int cantidadPalabras = lea.nextInt();

            for (int contador = 0; contador < cantidadPalabras; contador++) {
                System.out.print("palabra #" + (contador + 1) + ":");
                String palabra = lea.next();

                String invertida = "";

                int posicion = palabra.length();
                while (posicion > 0) {
                    posicion = posicion - 1;
                    char letra = palabra.charAt(posicion);
                    invertida = invertida + letra;

                }
                System.out.print("Palabra Alreves:" + invertida);

                if (palabra.equalsIgnoreCase(invertida)) {
                    palindromo = true;
                }
                if (palabra.length() > palabraLarga.length()) {
                    palabraLarga = palabra;
                }

            }

            System.out.println("la palabra mas larga fue:" + palabraLarga);

            if (palindromo) {
                System.out.println("la palabra es palindroma");
            } else {
                System.out.println("no hay una palabra palindroma");
            }

        } else if (opcion == 2) {
            System.out.print("ingrese un numero");
            int numero = lea.nextInt();
            int suma = 0;

            for (int contador = 1; contador < numero; contador++) {
                if (numero % contador == 0) {
                    suma += contador;
                }
            }
            if (suma == numero) {
                System.out.println("el numero que ingreso es perfecto");
            } else {
                System.out.println("el numero que ingreso no es perfecto");
            }

        } else if (opcion == 3) {
            int numeroAleatorio = aleatorio.nextInt(100) + 1;
            System.out.println("el numero aleatorio es:" + numeroAleatorio);

            int divisores=0;
            String listaDivisores = "";
            for (int contador = 1; contador <= numeroAleatorio; contador++) {
                if (numeroAleatorio % contador == 0);
                divisores++;
                listaDivisores+=contador+"";
            }
            if(divisores==2){
                System.out.println(numeroAleatorio+"es un numero primo");
            }else{
                System.out.println(numeroAleatorio+"no es un numero primo");
            }
            System.out.println("numero de divisores enteros:"+divisores);
            System.out.println("Lista de Divisores:"+listaDivisores);
                   
        }
        else if (opcion==4);
        System.out.println("¿cuantos votantes hay en el pais?");
        int votantes=lea.nextInt();
        
        int azul=0;
        int rojo=0;
        int amarillo=0;
        int negro=0;
        int nulo=0;
        int validos= azul+rojo+amarillo+negro;
        
        for(int contador=0;contador<votantes;contador++){
            System.out.print("voto#"+(contador+1)+"(azul/rojo/amarillo/negro):");
            String voto=lea.next();
            
            if (voto.equals("azul"))azul++;
            else if(voto.equals("rojo"))rojo++;
            else if(voto.equals("amarillo"))amarillo++;
            else if(voto.equals("negro"))negro++;
            else nulo++;
            
        }
        
        }
}
}