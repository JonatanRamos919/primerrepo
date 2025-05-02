/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;
import java.util.Scanner;
        
/**
 *
 * @author Jona Ramos
 */
public class estructuracondicional {
    public static void main(String[] arg){
     /*
        Tema: Estructura condicional
        Tipos de Estructura:
        1-Simple 
        Sntaxis:
        *prueba logicaica: expresion + Operador relacional + Expresion = true-false 
        -idVariable               Mayor         > 
        -Valor Constante          Menor         <
        -Lllamar una funcion      Mayor igual   >=
        -Formula                  menor igual   <=
                                  Igual         == - String : equals(String)
                                  Distinto      !=
        *Conectivos logicos: Y - and - &&
                             o - or  - !!
        if(prueba logica)
        {
         Bloque codigo - true 
        }
        
        2- Doble
        Sintaxis
        if((prueba logica)
        {
                Bloque Codigo - True
        }else{
                Bloque Codigo - False
        }
        
        3-Anidada
        Sintaxis:
        if(prueba logica)
        {
                Bloque Codigo - True
        if - simple o doble
        }else if(prueba logica)
        {
                Bloque Codigo - True
        }else{
                Bloque Codigo - False
        }
        */ 
     
     // Ex. FACTURACION
     
     Scanner lea=new Scanner(System.in);
     lea.useDelimiter("\n");
     
     System.out.println("***** Facturacion - CP1 *****");
     System.out.print("Ingresar nombre: ");
     String nombreUsuario=lea.next();  
     System.out.print("Ingresar edad:");
     int edad=lea.nextInt();
     System.out.print("Ingresar producto:");
     String nombre_Producto=lea.next();
     System.out.print("Ingresar precio unitario : L. ");
     double precioUnit=lea.nextDouble();
     System.out.print("Ingresar cantidad: ");
     int cantidad=lea.nextInt();
     double subtotal=cantidad*precioUnit;
     double descuento=0;
     String porcentajeDsct= "0%";
           
     if (edad>=60){
          if (subtotal>10000){
         descuento=subtotal*0.35;
         porcentajeDsct= "35%";
     }else {
         descuento=subtotal*0.30;
          porcentajeDsct="30%";
     }
     }
     else{
     if (subtotal>=2000 && subtotal<5000){
         descuento=subtotal*0.15;
         porcentajeDsct= "15%";
   
     } else if (subtotal>=5000 && subtotal<=10000) {
             descuento=subtotal*0.25;
             porcentajeDsct="25%";
     }else if (subtotal>10000){
             descuento=subtotal*0.35;
             porcentajeDsct= "35%";
     }else{
             descuento=0;
             porcentajeDsct="0%";
     }
     }
     
   
     
                         
             
     double impuesto=subtotal*0.15;
     double total=(subtotal-descuento)+impuesto;
     
     System.out.println("****DETALLE DE FACTURA****");
     System.out.println("Subtotal: L. "+String.format("%.2f", subtotal));
     System.out.println("descuento"+porcentajeDsct+": L."+String.format("%.2f",descuento));
     System.out.println("ISV - 15%: L."+impuesto);
     System.out.println("total: L. " +total);
     
     
        
     
     
     
           
     
             
     
     
     
       
    }
    
}
