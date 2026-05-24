package net.salesianos.vehiculos;

public abstract class Vehiculos {
    
    protected String color;
    protected int numPuertas;
    protected int numRuedas;
    protected String modelo;
    protected String matricula;

    public Vehiculos(String color, int numPuertas, int numRuedas, String modelo, String matricula) {
        this.color = color;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
   
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract void arrancar();
        
    public abstract void pararMotor();
    
    public abstract void mover();

}
