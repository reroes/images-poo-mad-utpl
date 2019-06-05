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

/*
    Se hace relación con la miniespecificación
    realizada
*/
public class Libro {
  // nombreLibro: Cadena 
  String nombreLibro;        
  // nombresAutores: <<Arreglo>>[2] Cadena // atributo tipo arreglo de cadenas
  String [] nombresAutores = new String[2];
  
  /*
  Método establecerNombresAutores(lista_nom []: <<Arreglo>> Cadena)
    a.  nombresAutores = lista_nom
    b.  Fin Método establecerNombresAutores
    */
  public void  establecerNombresAutores(String [] lista_nom){
      nombresAutores = lista_nom;
  }
  
  /*
  Método obtenerNombresAutores() : <<Arreglo>> [] Cadena
    a.  return nombresAutores
    b.  Fin Método obtenerNombresAutores
    */
  public String []  obtenerNombresAutores(){
      return nombresAutores;
  }
  
  /*
  Método establecerNombreLibro(c: Cadena)
    a.  nombreLibro = c
    b.  Fin Método establecerNombreLibro
  */
  public void establecerNombreLibro(String c){
      nombreLibro = c;
  }
  
  /*
  Método obtenerNombreLibro() : Cadena
    a.  return nombreLibro
    b.  Fin Método obtenerNombreLibro
  */
  public String obtenerNombreLibro(){
      return nombreLibro;
  }
    
}
