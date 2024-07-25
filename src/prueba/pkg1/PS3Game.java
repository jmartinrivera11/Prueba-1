/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg1;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author jmpin
 */
public class PS3Game extends Movie {
    
    Calendar fechaPubli;
    Scanner lea;
    
    public PS3Game(int codigo, String nombre, double precio) {
        super(codigo, nombre, 30);
        
        fechaPubli = Calendar.getInstance();
        lea = new Scanner(System.in);
    }
    
    @Override
    public String toString() {
        return super.toString() + "– PS3 Game";
    }
    
    public void setFechaPublicacion(int year, int mes, int dia) {
        fechaPubli.set(year, mes, dia);
    }
    
    @Override
    public double pagoRenta(int dias) {
        return precio;
    }
    
    @Override
    public String subMenu() {
        return super.subMenu() + "\n2) Actualizar Fecha de Publicacion";
    }
    
    @Override
    public void ejecutarOpcion(int opcion) {
        
        int año, mes, dia;
        
        if (opcion == 1) {
            super.ejecutarOpcion(opcion);
        } else if(opcion == 2) {
            System.out.print("Ingresar año: ");
            año = lea.nextInt();
            System.out.print("Ingresar mes: ");
            mes = lea.nextInt();
            System.out.print("Ingresar dia: ");
            dia = lea.nextInt();
            setFechaPublicacion(año, mes, dia);
        } else if(opcion == 3) {
            super.ejecutarOpcion(opcion);
        }
    }
}
