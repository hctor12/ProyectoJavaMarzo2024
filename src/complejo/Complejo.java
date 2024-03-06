/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejo;

public class Complejo {

    private double Real;
    private double Imaginario;

    public Complejo(double re, double imag) {
        Real = re;
        Imaginario = imag;

    }

    public double getReal() {
        return Real;

    }

    public double getImaginario() {
        return Imaginario;

    }

    public Complejo Sumar(Complejo c) {
        return new Complejo(getReal() + c.getReal(), getImaginario()
                + c.getImaginario());

    }

    public Complejo Multiplicar(Complejo c) {
        double re = getReal() * c.getReal() - getImaginario() * c.getImaginario();

        double imag = getImaginario() * c.getReal() + getReal() * c.getImaginario();
        return new Complejo(re, imag);

    }

    public boolean Iguales(Object c) {

        if (c instanceof Complejo) {

            Complejo cl = (Complejo) c;
            return ((cl.getReal() == getReal()) && (cl.getImaginario()
                    == getImaginario()));
        } else {
            return false;
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Complejo complejo = (Complejo) obj;
        return Double.compare(complejo.getReal(), getReal()) == 0
                && Double.compare(complejo.getImaginario(), getImaginario()) == 0;
    }
}//clase complejo

