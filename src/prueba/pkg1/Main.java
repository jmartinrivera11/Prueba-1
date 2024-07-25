/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pkg1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jmpin
 */
public class Main {
    
    static ArrayList<Object> list;
    static Scanner lea;
    
    public Main() {
        list = new ArrayList<>();
        lea = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        
        lea.useDelimiter("\n");
        
        System.out.print("Ingresar tipo: ");
        String tipo = lea.next();
        
        if(tipo.equals("MOVIE")) {
            
            System.out.print("Ingresar codigo: ");
            int codigo = lea.nextInt();
            System.out.print("Ingresar nombre: ");
            String nombre = lea.next();
            System.out.print("Ingresar codigo: ");
            double precio = lea.nextDouble();
            
            Movie movie = new Movie(codigo, nombre, precio);
            list.add(movie);
            
        } else if(tipo.equals("PS3")) {
            
            System.out.print("Ingresar codigo: ");
            int codigo = lea.nextInt();
            System.out.print("Ingresar nombre: ");
            String nombre = lea.next();
            System.out.print("Ingresar codigo: ");
            double precio = lea.nextDouble();
            
            PS3Game game= new PS3Game(codigo, nombre, precio);
            list.add(game);
            
        } else {
            System.out.println("Tipo Incorrecto");
        }
    }
}
