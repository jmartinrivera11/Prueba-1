/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg1;

/**
 *
 * @author jmpin
 */
public class Movie extends RentItem {
    
    public String estado;
    
    public Movie(int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        
        estado = "ESTRENO";
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }
    
    @Override
    public String toString() {
        return super.toString() + " -Movie";
    }
    
    @Override
    public double pagoRenta(int dias) {
        
        if(estado.equals("ESTRENO") && dias > 2) {
            precio += ((dias - 2) * 50);
        } else if(!estado.equals("ESTRENO") && dias > 5) {
            precio += ((dias - 5) * 30);
        }
        
        return precio;
    }
    
    @Override
    public String subMenu() {
        return super.subMenu() + "\n2) Cambiar Estado";
    }
    
    @Override
    public void ejecutarOpcion(int opcion) {
        if (opcion == 2)
            System.out.println("");
    }
}
