

package com.mycompany.tablahash;

/**
 *
 * @author elses
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=2;
        int boton;
        while(n==2){
            intro();
            boton=input.nextInt();
            input.nextLine();
            switch(boton){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.err.println("Gracias por usarnos");
                    n=3;
                         
                    break;
                default: 
                    System.out.println("opcion incorrecta");
            }
        
        
        }
        
       
    }
    public static void intro(){

        System.out.println("##############################################################");
        System.out.println("1:Ingresar");
        System.out.println("2:Modificar");
        System.out.println("3:Eliminar");
        System.out.println("4:Mostrar llave y posicion");
        System.out.println("5:Cerrar");
        System.out.println("##############################################################");
}
}


