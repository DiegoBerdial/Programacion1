/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finanzas.ej3.finanzas;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FinanzasObj {

    public static void main(String[] args) {
        // Crear objeto finanza con el constructor por defecto
        Finanzas finanza = new Finanzas();
        Scanner scanner=new Scanner(System.in);
        // Solicitar al usuario que introduzca los dólares
        System.out.print("Introduce la cantidad de dólares que tienes: ");
        double dolares = scanner.nextDouble();
        double euros = finanza.dolaresToEuros(dolares);
        System.out.println(dolares + " dólares son " + euros + " euros.");
        
        System.out.println("Mi programa Diego Berdial");   


        // Solicitar al usuario que introduzca los euros
        System.out.print("Introduce la cantidad de euros que tienes: ");
        double eurosInput = scanner.nextDouble();
        double dolaresConvertidos = finanza.eurosToDolares(eurosInput);
        System.out.println(eurosInput + " euros son " + dolaresConvertidos + " dólares.");

        // Crear otro objeto finanza2 con el cambio a 1.10
        Finanzas finanza2 = new Finanzas(1.10);
        double eurosConCambioNuevo = finanza2.dolaresToEuros(dolares);
        System.out.println("Con el cambio a 1.10, " + dolares + " dólares son " + eurosConCambioNuevo + " euros.");
        
            
            
        }
    }
       
            
        