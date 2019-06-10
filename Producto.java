/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotienda;

/**
 *
 * @author Admin
 */
public class Producto {
    private String nombre;
    private int precio, stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "El producto se llama "+nombre+" vale "+precio+" euros y quedan "
                +stock+" unidades"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
