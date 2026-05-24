package net.salesianos.cocheCombustion;

import net.salesianos.vehiculos.Vehiculos;

public abstract class CocheCombustion extends Vehiculos {

    protected boolean motorEncendido = false;

    protected int litrosCombustible;

    public CocheCombustion(String color, int numPuertas, int numRuedas, String modelo, String matricula, int litrosCombustible) {
        super(color, numPuertas, numRuedas, modelo, matricula);
        this.litrosCombustible = litrosCombustible;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public int getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(int litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    } 

    @Override
    public void arrancar() {
        if (motorEncendido = true) {
            litrosCombustible -= 1;
            System.out.println("El coche ha arrancado. Litros de combustible restantes: " + litrosCombustible);
        } else if (litrosCombustible <= 0) {
            System.out.println("ENo hay combustible por lo tanto no se puede arrancar el coche.");
        }
    }

    @Override
    public void pararMotor() {
        motorEncendido = false;
        System.out.println("El motor se ha apagado.");
    }

    @Override
    public void mover() {
        if (motorEncendido == true && litrosCombustible > 0) {
            litrosCombustible -= 1;
            System.out.println("El coche se ha movido. Litros de combustible restantes: " + litrosCombustible);
        } else if (litrosCombustible <= 0 || motorEncendido == false) {
            System.out.println("No se puede mover el coche porque el motor está apagado o no hay combustible.");

        }
    }
}