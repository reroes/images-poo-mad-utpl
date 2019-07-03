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
public class EjecutaPolimorfismo {

    public static void main(String[] args) {
        // deportista: <<Arreglo>> [2] DeportistaAltoRendimiento 
        // Se crea un arreglo de tipo DeportistaAltoRendimiento (que almacene
        // objetos que hereden de la clase DeportistaAltoRendimiento)
        DeportistaAltoRendimiento[] deportista = new DeportistaAltoRendimiento[2];
        
        JugadorFutbol jugador = new JugadorFutbol();
        Atleta atleta = new Atleta();

        jugador.establecerNombre("Alex Aguinaga");
        jugador.establecerNumeroPartidosJugados(2);
        jugador.establecerNumeroGoles(1);

        atleta.establecerNombre("Alexandra Tenorio");
        atleta.establecerNumeroCompetencias(2);

        deportista[0] = jugador; // se agrega un objeto de tipo JugadorFutbol
                                 // al arreglo de tipo DeportistaAltoRendimiento
        deportista[1] = atleta;  // se agrega un objeto de tipo Atleta
                                 // al arreglo de tipo DeportistaAltoRendimiento

        // for i = 0; i<2; i++
        for (int i = 0; i < 2; i++) {
            deportista[i].calcularIncentivo(); // se llama al método abstracto
                                               // de las clases del arreglo.
                                               // Ellas de manera obligatoria 
                                               // IMPLEMENTARON dicho método
                                               // por heredar
                                               // de la clase abstracta
                                               
            // Imprimir "Nombre Deportista :", deportista[i].obtenerNombre()
            System.out.println("Nombre Deportista :" + deportista[i].obtenerNombre());
            // Imprimir "Incentivo Mensual :", deportista[i].obtenerIncentivo()
            System.out.println("Incentivo Mensual :" + deportista[i].obtenerIncentivo());
        }

    }
}
