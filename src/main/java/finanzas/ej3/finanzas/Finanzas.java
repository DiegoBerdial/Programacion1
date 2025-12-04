/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package finanzas.ej3.finanzas;

/**
 *
 * @author diego
 */
public class Finanzas {
    private double tipoCambio; // Atributo para almacenar el tipo de cambio

    // Constructor por defecto
    public Finanzas() {
        this.tipoCambio = 1.06; // 1 dólar = 1.06 euros
    }

    // Constructor que permite establecer el tipo de cambio
    public Finanzas(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
      // Método para convertir dólares a euros
    public double dolaresToEuros(double dolares) {
        return dolares * tipoCambio;
    }

    // Método para convertir euros a dólares
    public double eurosToDolares(double euros) {
        return euros / tipoCambio;
    }
        
    }

