/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

/**
 *
 * @author reroes
 */
public class ProductoLacteo {
    String codigo;
    int numeroUnidad;
    double precio;
    
    // creación de los métodos establecer
    public void establecerCodigo(String x){
        codigo = x;
    }
    
    public void establecerNumeroUnidad(int x){
        numeroUnidad = x;
    }
    
    public void establecerPrecio(double x){
        precio = x;
    }
    
    // creación de los métodos obtener
    public String obtenerCodigo(){
        return codigo;
    }
    
    public int obtenerNumeroUnidad(){
        return numeroUnidad;
    }
    
    public double obtenerPrecio(){
        return precio;
    }
    
}
