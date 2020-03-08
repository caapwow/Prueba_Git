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
public class Furgoneta extends Coche{
    
    private int capacidad_carga;
    private int plazas_extra;
    
    public Furgoneta(int capacidad_carga,int plazas_extra){
        super();//llamar al constructor de la clase padre 
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "capacidad_carga=" + capacidad_carga + ", plazas_extra=" + plazas_extra + '}';
    }
    
    
    
    
}
