/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Cesar Abarca Piñones
 */
public class Uso_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Empleado empleado1 = new Empleado("Cesar Abarca", 16000, 2010, 8, 25);
        Empleado empleado2 = new Empleado("Andres Abarca", 11000, 2011, 2, 22);
        Empleado empleado3 = new Empleado("Javiera Abarca", 13000, 2017, 5, 6);
        empleado1.subirSueldo(6);
        Empleado[] empleadoss = new Empleado[3];
        empleadoss[0] = new Empleado("Cesar Abarca", 16000, 2010, 8, 25);
        empleadoss[1] = new Empleado("Andres Abarca", 1100, 2011, 2, 22);
        empleadoss[2] = new Empleado("Javiera Abarca", 13000, 2017, 5, 6);

        for (int i = 0; i < empleadoss.length; i++) { 
            empleadoss[i].subirSueldo(5);
        }
        
        Arrays.sort(empleadoss);
        
        for (int i = 0; i < empleadoss.length; i++) {
            System.out.println("Nombre: " + empleadoss[i].getNombre() + " Sueldo: $" + empleadoss[i].getSueldo() + " Fecha de Alta: " + empleadoss[i].getAltaContrato());
        }

        System.out.println("_________________________________________________________________________________________________________________");
        System.out.println("Nombre: " + empleado1.getNombre() + " sueldo: " + empleado1.getSueldo() + " Fecha de Alta: " + empleado1.getAltaContrato());
    }

}

class Empleado implements Comparable{
    
    
    
    
    private String nombre;
    private double sueldo;
    private int ano;
    private int mes;
    private int dia;
    private Date altaContrato;

    public Empleado() {

    }

    public Empleado(String nombre, double sueldo, int ano, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    public void subirSueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
    
    public int compareTo(Object miObjeto){
        Empleado otroEmpleado=(Empleado)miObjeto;
        if (this.sueldo<otroEmpleado.sueldo) {
            return -1;
        }
        
        if (this.sueldo>otroEmpleado.sueldo) {
            return 1;
        }
        
        return 0;
    }

    class Jefatura extends Empleado {
        private double incentivo;
        public Jefatura(String nombre, double sueldo, int ano, int mes, int dia) {
            super(nombre, sueldo, ano, mes, dia);
        }

        public void establecerIncentivo(double i) {
            incentivo = i;
        }

        public double sueldo() {
            double sueldoJefe =super.getSueldo();
            return sueldoJefe + incentivo;
        }
       
    }

}
