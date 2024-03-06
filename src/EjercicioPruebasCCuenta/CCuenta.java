/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPruebasCCuenta;

public class CCuenta {
// Propiedades de la Clase Cuenta

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */
    public CCuenta() {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    public void asignarNombre(String nom) {
        nombre = nom;
    }
    // Método que me devuelve el nombre del titular

    public String obtenerNombre() {
        return nombre;
    }
    // Método que me devuelve el número de cuenta

    public String obtenerCuenta() {
        return cuenta;
    }
    // Método que me devuelve el saldo disponible en cada momento

    public double estado() {
        return saldo;
    }
    // Método para ingresar cantidades en la cuenta. Modifica el saldo.

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    // Método para retirar cantidades en la cuenta. Modifica el saldo.

    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CCuenta otraCuenta = (CCuenta) obj;

        return Double.compare(otraCuenta.saldo, saldo) == 0
                && Double.compare(otraCuenta.tipoInterés, tipoInterés) == 0
                && nombre.equals(otraCuenta.nombre)
                && cuenta.equals(otraCuenta.cuenta);
    }
}
