package com.mycompany.proyectolibros;

import java.util.Scanner;

public class ProyectoLibros {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        Metodos metodo= new Metodos();
        int op;      
        
        do{
            System.out.println("*** Menu Principal ***");
            System.out.println("----------------------");
            System.out.println("1.- Agregar libro");
            System.out.println("2.- Mostrar libro");
            System.out.println("3.- Salir");
            
            do{
                System.out.print("ingrese una opcion valida: ");
                op=scan.nextInt();                   
            }while(op<0 || op>4);
            
                switch (op)
                    {
                        case 1:   
                            String editorial,titulo,autor;
                            int num_pagina;
                            for(int i=1;i<3; i++)
                            {
                                System.out.println("*** Ingrese "+i+" Libro ***");
                                do{
                                    System.out.print("Ingrese editorial: ");editorial=scan.next();
                                }while(metodo.validad_letras(editorial)==false);
                                
                                do{
                                    System.out.print("Ingrese titulo: ");titulo=scan.next();
                                }while(metodo.validad_letras(titulo)==false);    
                                
                                do{
                                    System.out.print("Ingrese autor: ");autor=scan.next();
                                }while(metodo.validad_letras(autor)==false); 
                                
                                System.out.print("Ingrese cantidad de paginas: ");num_pagina=scan.nextInt();                            
                                System.out.println("");
                                Libro libro= new Libro(editorial, titulo, autor, num_pagina);
                                metodo.agregar_libro(libro); 
                                
                            } 
                                metodo.mostrar_libro();
                                metodo.libro_mas_paginas();
                        break;                     

                        case 2:
                            metodo.mostrar_libro();                                                          
                        break;                     
                                                
                        case 3:
                            System.exit(0);    
                    }                   
        }while(op<=4); 
    }
    
}
