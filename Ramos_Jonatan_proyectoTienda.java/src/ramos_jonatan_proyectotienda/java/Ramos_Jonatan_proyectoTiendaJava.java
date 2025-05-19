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
            System.out.println("\n===== TIENDA=====");
            System.out.println("1. Abrir caja");
            System.out.println("2. Ventas");
            System.out.println("3. Compras");
            System.out.println("4. reportes");
            System.out.println("5. Cierre de caja");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt();

            if (opcion == 1) {
                if (efectivoCaja == 0) {
                    System.out.print("Ingrese monto inicial: ");
                    efectivoCaja = lea.nextDouble();
                    System.out.println("Caja abierta con: Lps. " + efectivoCaja);
                } else {
                    System.out.print("Agregar efectivo a caja: ");
                    double adicional = lea.nextDouble();
                    efectivoCaja = efectivoCaja + adicional;
                    System.out.println("Caja actual: Lps. " + efectivoCaja);
                }
            }

            if (opcion == 2) {
                if (efectivoCaja == 0) {
                    System.out.println("Debe abrir la caja primero.");
                } else {
                    double subtotal = 0;
                    String detalleFactura = "";
                    char seguir = 'S';
                    System.out.print("Tipo de cliente (A/B/C): ");
                    char tipoCliente = lea.next().toUpperCase().charAt(0);

                    while (seguir == 'S') {
                        System.out.println("1. Azúcar - Lps. 30");
                        System.out.println("2. Avena - Lps. 25");
                        System.out.println("3. Trigo - Lps. 32");
                        System.out.println("4. Maíz  - Lps. 20");
                        System.out.print("Código del producto: ");
                        int codigo = lea.nextInt();

                        if (codigo < 1 || codigo > 4) {
                            System.out.println("Código inválido. Solo entre 1 y 4.");
                        } else {
                            int permitido = 0;
                            if (tipoCliente == 'A') permitido = 1;
                            if (tipoCliente == 'B' && codigo != 4) permitido = 1;
                            if (tipoCliente == 'C' && codigo == 4) permitido = 1;

                            if (permitido == 1) {
                                System.out.print("¿Cuántos kg desea?: ");
                                double kg = lea.nextDouble();

                                double precio = 0;
                                String nombre = "";

                                if (codigo == 1)
                                    precio = 30;
                                if (codigo == 1)
                                    nombre = "Azúcar";
                                if (codigo == 1)
                                    vendido1 = vendido1 + kg;

                                if (codigo == 2)
                                    precio = 25;
                                if (codigo == 2)
                                    nombre = "Avena";
                                if (codigo == 2)
                                    vendido2 = vendido2 + kg;

                                if (codigo == 3)
                                    precio = 32;
                                if (codigo == 3)
                                    nombre = "Trigo";
                                if (codigo == 3)
                                    vendido3 = vendido3 + kg;

                                if (codigo == 4)
                                    precio = 20;
                                if (codigo == 4)
                                    nombre = "Maíz";
                                if (codigo == 4)
                                    vendido4 = vendido4 + kg;

                                subtotal = subtotal + (kg * precio);
                                detalleFactura = detalleFactura + kg + " kg de " + nombre + " a Lps. " + precio + "\n";
                            } else {
                                System.out.println("Este cliente no puede comprar ese producto.");
                            }
                        }

                        System.out.print("¿Desea comprar otro producto? (S/N): ");
                        seguir = lea.next().toUpperCase().charAt(0);
                    }

                    if (subtotal > 0) {
                        double descuento = 0;
                        if (subtotal >= 5000) descuento = subtotal * 0.10;
                        else if (subtotal >= 1000) descuento = subtotal * 0.05;

                        double subtotalConDescuento = subtotal - descuento;
                        double impuesto = subtotalConDescuento * 0.07;
                        double total = subtotalConDescuento + impuesto;

                        efectivoCaja = efectivoCaja + total;
                        totalVentas = totalVentas + total;
                        cantidadVentas = cantidadVentas + 1;

                        double ganancia = subtotal * 0.20;
                        if (ganancia > mayorGananciaVenta) {
                            mayorGananciaVenta = ganancia;
                        }

                        System.out.println("\n----- FACTURA -----");
                        System.out.println("Detalle de productos:");
                        System.out.print(detalleFactura);
                        System.out.println("Subtotal: " + subtotal);
                        System.out.println("Descuento: " + descuento);
                        System.out.println("Impuesto: " + impuesto);
                        System.out.println("TOTAL A PAGAR: " + total);
                    } else {
                        System.out.println("No se realizó ninguna compra.");
                    }
                }
            }

            if (opcion == 4) {
                System.out.println("\n***** REPORTES *****");
                System.out.println("Efectivo actual: Lps. " + efectivoCaja);
                System.out.println("Ventas realizadas: " + cantidadVentas);
                System.out.println("Compras realizadas: " + cantidadCompras);
                System.out.println("Total ventas: Lps. " + totalVentas);
                System.out.println("Total compras: Lps. " + totalCompras);
                System.out.println("Ganancia neta: Lps. " + (totalVentas - totalCompras));

                if (cantidadVentas > 0)
                    System.out.println("Promedio venta: Lps. " + (totalVentas / cantidadVentas));
                else
                    System.out.println("Promedio venta: 0");

                if (cantidadCompras > 0)
                    System.out.println("Promedio compra: Lps. " + (totalCompras / cantidadCompras));
                else
                    System.out.println("Promedio compra: 0");

                System.out.println("Mayor ganancia en venta: Lps. " + mayorGananciaVenta);
                System.out.println("Compra más costosa: Lps. " + mayorGastoCompra);

                double mayorVendido = vendido1;
                String estrella = "Azúcar";

                if (vendido2 > mayorVendido) { mayorVendido = vendido2; estrella = "Avena"; }
                if (vendido3 > mayorVendido) { mayorVendido = vendido3; estrella = "Trigo"; }
                if (vendido4 > mayorVendido) { mayorVendido = vendido4; estrella = "Maíz"; }

                if (mayorVendido > 0)
                    System.out.println("Producto estrella: " + estrella);
                else
                    System.out.println("Aún no hay producto estrella.");
            }

            if (opcion == 5) {
                System.out.println("\n***** CIERRE DE CAJA *****");
                System.out.println("Ganancia del día: Lps. " + (totalVentas - totalCompras));
                System.out.print("¿Cuánto desea depositar (máx. 60%)? ");
                double deposito = lea.nextDouble();
                double maximo = efectivoCaja * 0.60;

                if (deposito <= maximo) {
                    efectivoCaja = efectivoCaja - deposito;
                    System.out.println("Depósito exitoso. Caja restante: " + efectivoCaja);
                } else {
                    System.out.println("No puede depositar más del 60%.");
                }

                totalVentas = 0;
                totalCompras = 0;
                cantidadVentas = 0;
                cantidadCompras = 0;
                mayorGananciaVenta = 0;
                mayorGastoCompra = 0;
                vendido1 = 0;
                vendido2 = 0;
                vendido3 = 0;
                vendido4 = 0;
                efectivoCaja = 0;
            }

            if (opcion == 6) {
                System.out.println("Gracias por usar Tienda Java, Jonatan.");
            }
        }

        lea.close();
    }
}
