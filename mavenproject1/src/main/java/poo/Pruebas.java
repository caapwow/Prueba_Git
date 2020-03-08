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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Empleados trabajador1 = new Empleados("Cesar");
        Empleados trabajador2 = new Empleados("Abarca");
        System.out.println(trabajador1.toString()+"\n"+trabajador2.toString());
        System.out.println(Empleados.getIdSiguiente()); 
    }
}

class Empleados {

    private String nombre;
    private String seccion;
    private  int id;
    private static int idSiguiente=1;
    
    public Empleados(String nombre) {

        this.nombre = nombre;
        this.seccion = "Administracion";
        id=idSiguiente;
        idSiguiente++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

     

     

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", seccion=" + seccion + ", id=" + id + '}';
    }

}
