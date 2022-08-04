package com.mycompany.proyectolibros;

import java.util.ArrayList;

public class Metodos
{
    ArrayList<Libro> lista_libro=new ArrayList<>();
    
    public void  agregar_libro(Libro libro)
    {     
      lista_libro.add(libro);
    }
    
    public void mostrar_libro()
    {
        int cont= 1;
        if(lista_libro.isEmpty())
        {
            System.out.println("La lista esta vacia");
        }else
        {
            for(int i=0;i<lista_libro.size();i++)
            {
                System.out.println(cont+"-. "+lista_libro.get(i));
                cont= cont+1;
            }
        }    
    }
    
    public void libro_mas_paginas()
    {
        if(lista_libro.get(0).getNum_pagina()==lista_libro.get(1).getNum_pagina())
        {  
            System.out.println("Los dos libos tienen la misma cantidad de paginas");
        }else
            if(lista_libro.get(0).getNum_pagina()>lista_libro.get(1).getNum_pagina())
            {
                System.out.println("**** El libro ganador es el N° 1 con un total de "+lista_libro.get(0).getNum_pagina()+" ****");            
            }else{
                 System.out.println("**** El libro ganador es el N° 2 con un total de "+lista_libro.get(1).getNum_pagina()+" ****");            
            }
        
        lista_libro.clear(); 
    }
    
     public boolean validad_letras(String nombre)
    {
        boolean respuesta=(nombre.matches("[a-zA-Z]*"));
        if(respuesta==true)
        {
            System.out.println("Parametros correctos");
        }else
        {
            System.out.println("Parametros INVALIDOS");
        }
        return respuesta;
    } 
     
     
     public boolean validar_numero(String num2)
    {
        boolean respuesta=(num2.matches("[1-9]*"));
        if(respuesta==true)
        {
            System.out.println("Parametros correctos");
        }else
        {
            System.out.println("Parametros INVALIDOS");
        }
        return respuesta;
    } 
}
