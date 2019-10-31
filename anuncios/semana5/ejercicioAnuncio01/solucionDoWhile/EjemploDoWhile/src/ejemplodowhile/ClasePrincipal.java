/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación del objeto tipo Scanner, para manipular
        // el ingreso de información desde teclado
        Scanner entrada = new Scanner(System.in);
        String codigoProducto;
        int unidadesProducto;
        double precioProducto;
        String bandera;
        
        // inicio del ciclo repetitivo
        do{
            System.out.println("Ingrese el código del producto");
            codigoProducto = entrada.nextLine(); 
            System.out.println("Ingrese el número de unidad del producto");
            unidadesProducto = entrada.nextInt();
            System.out.println("Ingrese el precio del producto");
            precioProducto = entrada.nextDouble();
            // con los datos ingresados procedemos a crear los objetos de tipo
            // ProductoLacteo
            ProductoLacteo producto = new ProductoLacteo();
            // asignamos valores al objeto a través de los métodos establecer
            producto.establecerCodigo(codigoProducto);
            producto.establecerNumeroUnidad(unidadesProducto);
            producto.establecerPrecio(precioProducto);
            
            // se presenta en pantalla los datos del producto, se hace
            // uso de los métodos obtener
            System.out.printf("Los datos que usted ha ingresado son:\n"
                    + "Código: %s\n"
                    + "Unidades: %d\n"
                    + "Precio: %.2f\n", 
                    producto.obtenerCodigo(), 
                    producto.obtenerNumeroUnidad(),
                    producto.obtenerPrecio());
            
            System.out.println("Si desea seguir ingresando más productos, "
                    + "ingrese la letra S");
            entrada.nextLine(); // explicación: ref: https://bit.ly/2DXczEk
            bandera = entrada.nextLine();
            // comparo lo que el usuario a ingresado para determinar si 
            // continuo en el ciclo repetitivo o termina y salg el mismo
            
        }while(bandera.equals("S")); // si el valor que ingresa el usuario
                                     // es igual a "S", seguimos en ciclo
                                     // si no se cumple la codición salimos 
                                     // del ciclo repetitivo
        
        System.out.println("Fin del ciclo  do-while");
    }
    
}
