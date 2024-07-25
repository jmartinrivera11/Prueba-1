/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg1;

/**
 *
 * @author jmpin
 */
public class RentItem {
    
    int codigo, copias;
    String nombre;
    double precio;
    
    public RentItem(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        copias = 0;
    }
    
    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nNombre: " + nombre 
                + "\nPrecio: Lps." + precio;
    }
    
    public double pagoRenta(int días) {
        return 0;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCopias() {
        return copias;
    }
    
    public String subMenu() {
        return "1) Imprimir";
    }
    
    public void ejecutarOpcion(int opcion) {
        if (opcion == 1)
            System.out.println(toString() + "\nCopias: " + copias);
        System.out.println("Opcion No Valida");
    }
}
