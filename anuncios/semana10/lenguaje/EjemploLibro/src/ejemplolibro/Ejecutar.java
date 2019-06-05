/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolibro;

/**
 *
 * @author reroes
 */
public class Ejecutar {
    public static void main(String[] args) {
        /*
        a.  // Declarar Variables
            lista_valores: <<Arreglo>>[5] Cadena
            valorNombre: Cadena
        */
        String [] lista_valores = new String[2];
        String valorNombre;
        
        /*
        b.  lista_valores[0] = "Roger Cadenhead"
            lista_valores[1] = "Leobardo López"
        */
        lista_valores[0] = "Roger Cadenhead";
        lista_valores[1] = "Leobardo López";
        
        // en nuestra mente imaginamos la lista de valores como
        // un arreglo de cadenas:
        // [ "Roger Cadenhead", "Leobardo López" ]
        //      0                     1           // posiciones del arreglo
        
        /*
        c.  // Declarar un objeto de tipo Libro
            Libro miLibro = new Libro()
        */
        Libro miLibro = new Libro();
        
        // hago uso del método que permite asignar valores
        // al atributo nombresAutores
        miLibro.establecerNombresAutores(lista_valores);
        
        /*
        d.  // para presentar los datos guardados:
            // hago uso de un ciclo repetitivo para recorrer los valores
            // asignados al atributo nombresAutores, a través del método
            // obtenerNombresAutores
            // Considerar que dicho método devulve el valor del atributo
            // nombresAutores del objeto miLibro; además dicho atributo es de
            // tipo arreglo de cadenas.
        */
        //    for i = 0; i<2; i++
        for (int i = 0; i < 2; i++) {
            // en una variable tipo cadena recibo cada uno de los valores
            // de las posiciones que se tiene almacenado en el 
            // arreglo que devuelve el método obtenerNombresAutores en una 
            // posición determinada; para el objeto miLibro
            // La posición en el ciclo me lo da la variable i
            // Ejemplo: si el valor de i es 0, estamos accediendo a:
            // Roger Cadenhead
            valorNombre = miLibro.obtenerNombresAutores()[i];
            
            // Imprimir "Autor :", valorNombre
            System.out.printf("Autor : %s\n", valorNombre);
        // endfor
        }

    }
}
