class Libro{ //Creamos la clase llamada libro
    //creamos 3 atributos
    String titulo;
    String autor;
    int añoPublicacion;
    //constructor vacio
    Libro(){

    }

    public String getTitulo() {//metodo get para titulo
        return titulo;// retorna titulo
    }

    public void setTitulo(String titulo) {//metodo set de titulo
        this.titulo = titulo;// asigna valor a titulo
    }

    public String getAutor() {//metodo get de autor
        return autor;// retorna autor
    }

    public void setAutor(String autor) {//metodo set de autor
        this.autor = autor;// le asigna valor a autor
    }

    public int getAñoPublicacion() {//metodo get para año de publicacion
        return añoPublicacion;// retorna año de publicacion
    }

    public void setAñoPublicacion(int añoPublicacion) {// metodo set para año de publicacion
        this.añoPublicacion = añoPublicacion; // le asigna valor a año de publicacion
    }
 //cerramos clase
}
    