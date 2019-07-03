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
public class Atleta extends DeportistaAltoRendimiento {
    // Declarar atributos
    // numeroCompetencias: Entero
    int numeroCompetencias;
    
    // Declarar métodos
    // Método establecerNumeroCompetencias(g: Entero)
    public void establecerNumeroCompetencias(int g){
        numeroCompetencias = g;
    }
    
    // Método obtenerNumeroCompetencias() : Entero
    public int obtenerNumeroCompetencias(){
        return numeroCompetencias;
    }
    
    // Método calcularIncentivo()
    public void calcularIncentivo(){
        incentivoMensual = (numeroCompetencias * 1000) + 500;
    }

}
