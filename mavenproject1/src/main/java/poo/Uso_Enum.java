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
public class Uso_Enum {

    /**
     * @param args the command line arguments
     */
    
    enum talla{
        Mini("S"),Mediando("M"),Grande("L"),Muy_Grande("XL");
        
        private talla(String abreviatura){
            this.abreviatura=abreviatura;
        }
        private String abreviatura;

        public String getAbreviatura() {
            return abreviatura;
        }

        public void setAbreviatura(String abreviatura) {
            this.abreviatura = abreviatura;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
}
