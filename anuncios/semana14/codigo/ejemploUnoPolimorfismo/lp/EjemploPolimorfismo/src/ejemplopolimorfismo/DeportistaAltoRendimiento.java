/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author reroes
 */
public abstract class DeportistaAltoRendimiento {
// Clase abstracta DeportistaAltoRendimiento 
    // Declarar atributos
    protected String nombre;
    protected double incentivoMensual;
    
    // Declarar métodos
    // Método establecerNombre(l:Cadena)
    public void establecerNombre(String l){        
        nombre = l;
    }
      
    // Método obtenerNombre() : Cadena
    public String obtenerNombre(){
        return nombre;
    }

    // Método abstracto calcularIncentivo()
    public abstract void calcularIncentivo();
      // método sin impĺementar
      
    // Método obtenerIncentivo() : Real
    public double obtenerIncentivo(){
        return incentivoMensual;
    }

// Fin Clase DeportistaAltoRendimiento 

}
