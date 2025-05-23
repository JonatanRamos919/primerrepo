/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramos_jonatan_proyectotienda.java;

import java.util.Scanner;

/**
 *
 * @author Jona Ramos
 */
public class Ramos_Jonatan_proyectoTiendaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lea = new Scanner(System.in);

        double efectivoCaja = 0;
        double totalVentas = 0;
        double totalCompras = 0;
        int cantidadVentas = 0;
        int cantidadCompras = 0;
        double mayorGananciaVenta = 0;
        double mayorGastoCompra = 0;

        double vendido1 = 0;
        double vendido2 = 0;
        double vendido3 = 0;
        double vendido4 = 0;

        int opcion = 0;

        while (opcion != 6) {
        System.out.println("\n******TIENDA*****");
        System.out.println("1. Abrir caja");
        System.out.println("2. Ventas");
        System.out.println("3. Compras");
        System.out.println("4. Reportes");
        System.out.println("5. Cierre de caja");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = lea.nextInt();

            if (opcion == 1) {
                if (efectivoCaja == 0) {
                    System.out.print("Ingrese monto inicial: ");
                    efectivoCaja = lea.nextDouble();
                    System.out.println("Caja abierta con: Lps. " + efectivoCaja);
                    
            if (efectivoCaja != 0) {
                System.out.print("Ingrese monto adicional: ");
            }
            double adicional = lea.nextDouble();
            efectivoCaja = efectivoCaja + adicional;
            System.out.println("Nuevo monto en caja: Lps. " + efectivoCaja);

            if (opcion == 2) {
                if (efectivoCaja == 0) {
                    System.out.println("Debe abrir la caja primero.");
                } else {
                    double subtotal = 0;
                    String detalle = "";
                    char seguir = 'S';
                    System.out.print("Tipo de cliente (A/B/C): ");
                    char tipo = lea.next().toUpperCase().charAt(0);

         while (seguir == 'S') {
         System.out.println("1. Azucar - 30");
         System.out.println("2. Avena - 25");
         System.out.println("3. Trigo - 32");
         System.out.println("4. Maiz  - 20");
         System.out.print("seleccione el codigo del producto: ");
         int codigo = lea.nextInt();

            if (codigo < 1 || codigo > 4) {
               System.out.println("Codigo invalido.");
             } else {
               int permitido = 0;
               if (tipo == 'A') {
               permitido = 1;
               }
               if (tipo == 'B' && codigo != 4) {
               permitido = 1;
               }
               if (tipo == 'C' && codigo == 4) {
               permitido = 1;
               }

            if (permitido == 1) {
              System.out.print("Cuantos kg?: ");
              double kg = lea.nextDouble();
              double precio = 0;
              String nombre = "";

              
             if (codigo == 1) {
                 precio = 30;
            }
             if (codigo == 1) {
                 nombre = "Azucar";
            }
             if (codigo == 1) {
                 vendido1 = vendido1 + kg;
            }
             if (codigo == 2) {
                 precio = 25;
                                }
             if (codigo == 2) {
                 nombre = "Avena";
             }
             if (codigo == 2) {
                 vendido2 = vendido2 + kg;
             }
            if (codigo == 3) {
                precio = 32;
            }
             if (codigo == 3) {
                 nombre = "Trigo";
             }
             if (codigo == 3) {
                 vendido3 = vendido3 + kg;
             }
             if (codigo == 4) {
                 precio = 20;
             }
             if (codigo == 4) {
                 nombre = "Maiz";
             }
             if (codigo == 4) {
                 vendido4 = vendido4 + kg;
             }

         subtotal = subtotal + (kg * precio);
         detalle = detalle + kg + " kg de " + nombre + " a " + precio + "\n";
  
          } else {
          System.out.println("Este cliente no puede comprar ese producto.");
          }
          }
          System.out.print("Desea otro producto? (SI/NO): ");
          seguir = lea.next().toUpperCase().charAt(0);
          }

     if (subtotal > 0) {
     double desc = 0;
     if (subtotal >= 5000) {
         desc = subtotal * 0.10;
    } else if (subtotal >= 1000) {
               desc = subtotal * 0.05;
    }

     double subdesc = subtotal - desc;
     double imp = subdesc * 0.07;
     double total = subdesc + imp;

     efectivoCaja = efectivoCaja + total;
     totalVentas = totalVentas + total;
     cantidadVentas = cantidadVentas + 1;

     double ganancia = subtotal * 0.20;
     
     if (ganancia > mayorGananciaVenta) {
     mayorGananciaVenta = ganancia;
     }

     System.out.println("\n*****FACTURA*****");
     System.out.print(detalle);
     System.out.println("Subtotal: " + subtotal);
     System.out.println("Descuento: " + desc);
     System.out.println("Impuesto: " + imp);
     System.out.println("TOTAL: " + total);
     }
     }
     }

     if (opcion == 3) {
     if (efectivoCaja == 0) {
     System.out.println("Debe abrir la caja primero.");
     } else {
     System.out.print("Tipo proveedor (A/B/C): ");
     char tipo = lea.next().toUpperCase().charAt(0);

     System.out.println("1. Azucar - 25");
     System.out.println("2. Avena - 20");
     System.out.println("3. Trigo - 30");
     System.out.println("4. Maiz  - 18");
     System.out.print("Seleccione el codigo del producto: ");
     int codigo = lea.nextInt();

     if (codigo < 1 || codigo > 4) {
     System.out.println("Codigo invalido.");
     } else {
     int permitido = 0;
     
     if (tipo == 'A' && (codigo == 1 || codigo == 4)) {
         permitido = 1;
     }
     if (tipo == 'B' && (codigo == 2 || codigo == 3)) {
         permitido = 1;
     }
     if (tipo == 'C' && codigo == 2) {
         permitido = 1;
     } 
     if (permitido == 1) {
     System.out.print("Cuantos kg?: ");
     double kg = lea.nextDouble();
     double precio = 0;

     if (codigo == 1) {
         precio = 25;
     }
     if (codigo == 2) {
         precio = 20;
     }
     if (codigo == 3) {
         precio = 30;
     }
     if (codigo == 4) {
         precio = 18;
     }

     double total = kg * precio;

     if (total <= efectivoCaja) {
         efectivoCaja = efectivoCaja - total;
         totalCompras = totalCompras + total;
         cantidadCompras = cantidadCompras + 1;
         
         if (total > mayorGastoCompra) {
         mayorGastoCompra = total;
         }

         System.out.println("Compra hecha por: " + total);
         } else {
           System.out.println("No hay suficiente dinero en caja.");
                            }
      } else {
          System.out.println("Proveedor no puede vender ese producto.");
      }
      }
      }
      }

        if (opcion == 4) {
        System.out.println("\n*****REPORTES*****");
        System.out.println("Efectivo actual: " + efectivoCaja);
        System.out.println("Ventas realizadas: " + cantidadVentas);
        System.out.println("Compras realizadas: " + cantidadCompras);
        System.out.println("Total ventas: " + totalVentas);
        System.out.println("Total compras: " + totalCompras);
        System.out.println("Ganancia neta: " + (totalVentas - totalCompras));

        if (cantidadVentas > 0) {
            System.out.println("Promedio venta: " + (totalVentas / cantidadVentas));
        } else {
            System.out.println("Promedio venta: 0");
        }

        if (cantidadCompras > 0) {
            System.out.println("Promedio compra: " + (totalCompras / cantidadCompras));
        } else {
            System.out.println("Promedio compra: 0");
        }

         System.out.println("Mayor ganancia en venta: " + mayorGananciaVenta);
         System.out.println("Compra mas costosa: " + mayorGastoCompra);

        double mayorVendido = vendido1;
        String estrella = "Azucar";

      if (vendido2 > mayorVendido) {
          mayorVendido = vendido2;
          }
          estrella = "Avena";
      if (vendido3 > mayorVendido) {
          mayorVendido = vendido3;
           }
          estrella = "Trigo";
      if (vendido4 > mayorVendido) {
          mayorVendido = vendido4;
            }
          estrella = "Maiz";

      if (mayorVendido > 0) {
          System.out.println("Producto estrella: " + estrella);
           } else {
          System.out.println("Aun no hay producto estrella.");
           }
           }

       if (opcion == 5) {
          System.out.println("\n*****CIERRE DE CAJA******");
          System.out.println("Ganancia en caja: " + (totalVentas - totalCompras));
          System.out.print("Cuanto desea depositar (max 60%): ");
       
       double deposito = lea.nextDouble();
       double maximo = efectivoCaja * 0.60;

       if (deposito<= maximo) {
       efectivoCaja = efectivoCaja - deposito;
       System.out.println("Deposito hecho.");
       
       } else {
       System.out.println("No puede depositar mas del 60%.");
       }

     totalVentas =0;
     totalCompras =0;
     cantidadVentas =0;
     cantidadCompras =0;
     mayorGananciaVenta =0;
     mayorGastoCompra =0;
     vendido1 =0;
     vendido2 =0;
     vendido3 =0;
     vendido4=0;
    efectivoCaja =0;
     }

    if (opcion==6) {
      System.out.println("Gracias por usar la tienda.");
     }
     }
     }
     }
     }
     }
