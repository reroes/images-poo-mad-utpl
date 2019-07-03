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
public class JugadorFutbol extends DeportistaAltoRendimiento {
    int numeroPartidosJugados;
    int numeroGoles;
    
    // Declarar métodos
    // Método establecerNumeroPartidosJugados(g: Entero)
    public void establecerNumeroPartidosJugados(int g){
        numeroPartidosJugados = g;
    }
    
    // Método obtenerNumeroPartidosJugados() : Entero
    public int obtenerNumeroPartidosJugados(){
        return numeroPartidosJugados;
    }
    
    // Método establecerNumeroGoles(g: Entero)
    public void establecerNumeroGoles(int g){
        numeroGoles = g;
    }
    
    // Método obtenerNumeroGoles() : Entero
    public int obtenerNumeroGoles(){
        return numeroGoles;
    }
    
    // Método calcularIncentivo() MÉTODO ABSTRACTO
    public void calcularIncentivo(){
        incentivoMensual = (numeroGoles * 500) + (numeroPartidosJugados * 100);
    }

}
