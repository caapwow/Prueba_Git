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
public class Uso_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Coche auto1= new Coche();
        auto1.setColor("rojo");
        Furgoneta furgon1=new Furgoneta(2000, 4);
        furgon1.EstablecerColor();
         
    }
    
}
