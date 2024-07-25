/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg1;

import java.util.Scanner;
/**
 *
 * @author jmpin
 */
public class Movie extends RentItem {
    
    public String estado;
    Scanner lea;
    
    public Movie(int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        
        estado = "ESTRENO";
        
        lea = new Scanner(System.in);
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
        String nuevo;
        if (opcion == 1) {
            super.ejecutarOpcion(opcion);
        } else if(opcion == 2) {
            System.out.print("Ingresar nuevo estado: ");
            nuevo = lea.next();
            setEstado(nuevo);
        } else if (opcion == 3) {
            super.ejecutarOpcion(opcion);
        }
    }
}
