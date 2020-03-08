/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Cesar Abarca Piñones
 */
public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean cuero, climatizador;

    public Coche() {

    }

    public Coche(int ruedas, int largo, int ancho, int motor, int peso_plataforma, String color, int peso_total, boolean cuero, boolean climatizador) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
        this.color = color;
        this.peso_total = peso_total;
        this.cuero = cuero;
        this.climatizador = climatizador;
    }


    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public boolean isCuero() {
        return cuero;
    }

    public void setCuero(boolean cuero) {
        this.cuero = cuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public String infoLargo() {
        return "El largo del coche es: " + largo;
    }

    public void EstablecerColor() {
        color = "azul";
    }
    
    public void InfoAuto(){
        System.out.println("ruedas: "+ruedas);
        System.out.println("Largo: "+largo);
        System.out.println("Ancho: "+ancho);
        System.out.println("Motor: "+motor);
        System.out.println("Peso plataforma: "+peso_plataforma);
        System.out.println("Color: "+color);
        System.out.println("Peso total: "+peso_total);
        if (cuero=true) {
            System.out.println("Cuero: SI");
        }else{
            System.out.println("Cuero: NO");
        }
        if (climatizador=true) {
            System.out.println("Climatizador: SI");
        }else{
            System.out.println("Climatizador: NO");
        }
        
    }
}
