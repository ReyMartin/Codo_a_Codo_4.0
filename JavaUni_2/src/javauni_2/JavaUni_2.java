/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javauni_2;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class JavaUni_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese su hobbie");
        String hobbie = entrada.nextLine();
        
        System.out.println("Ingrese su editor de codigo preferido");
        String editor = entrada.nextLine();
        
        System.out.println("Ingrese su sistema operativo que utiliza");
        String sistema = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su hobbie es: " + hobbie);
        System.out.println("Su editor es: " + editor);
        System.out.println("Su sistema operativo es: " + sistema);
        
    }
            
    
}
