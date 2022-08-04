package com.mycompany.proyectolibros;

public class Libro
{
    private String editorial;
    private String titulo;
    private String autor;
    private int num_pagina;

    public Libro() {
    }

    public Libro(String editorial, String titulo, String autor, int num_pagina) {
        this.editorial = editorial;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pagina = num_pagina;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pagina() {
        return num_pagina;
    }

    public void setNum_pagina(int num_pagina) {
        this.num_pagina = num_pagina;
    }

    @Override
    public String toString() {
        return "El libro de la Editorial " + editorial + ", fue creado por el autor "+ autor + " y tiene un total de "+num_pagina+" paginas.";
    }
     
}
