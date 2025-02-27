import java.util.Scanner; //libreria scanner

class MainLibro {//abrimos main libro
    public static void main(String[] args) {//metodo principal
    Scanner sc = new Scanner(System.in);// creamos un objeto scanner
    Libro [] libros = new Libro[3];// arreglo para 3 libros
        
        for(int i=0; i < 3; i++){ //un  for para pedir datos de los 3 libros
        
            libros[i]= new Libro();// creamos un objetolibro

        System.out.println("Ingresa los datos del libro");
        System.out.println("Titulo: ");
        libros[i].setTitulo(sc.nextLine());//llee los datos ingresados y lo almacenamos en el arreglo 3 veces
        
        System.out.println("Ingresa el autor");
        System.out.println("Autor: ");
        libros[i].setAutor(sc.nextLine());// lee los datos ingresados y lo almacenamos en el arreglo 3 veces

        System.out.println("Ingresa el año en el que se publico");
        System.out.println("Año de publicacion: ");
        libros[i].setAñoPublicacion(sc.nextInt());// lee los datos ingresados y lo almacenamos en el arreglo 3 veces
        sc.nextLine();
        
        }
    System.out.println("\nDatos de los libros ingresados: ");
        for(int i=0; i < 3; i++){ //imprime los arreglos de los libros y muestra cada libro con sus respectivos datos
            System.out.println("Libro " + (i + 1) + ":");
            System.out.println("Título: " + libros[i].getTitulo());
            System.out.println("Autor: " + libros[i].getAutor());
            System.out.println("Año de publicación: " + libros[i].getAñoPublicacion());
            System.out.println();
        }
    sc.close();    // cerramos scanner
    }// cerramos metodo principal
    
}// cerramos clase



















































//yo aquí fui el escogido para levantarte
//te amare y cuidare y te protegere
//es que hasta mi vida... ¡te doy.!!
//¡y ahora entrégate.!!
//si lloro o tiemblo es por ti amor
// es que dios me mando para ti
//adorarte para todo la vida
