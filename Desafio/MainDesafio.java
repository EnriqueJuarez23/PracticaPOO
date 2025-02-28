import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MainDesafio{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Deportista d1 = new Deportista();
        Frutas f1 = new Frutas();
        Ropa r1 = new Ropa();
        Carros c1= new Carros();
        Zapatos z1= new Zapatos();


        ArrayList<Object>lista = new ArrayList<>();

        d1.setMedallas(25);
        d1.setNombre("Lebron");
        d1.setTipoDeporte("Basketball");
        f1.setId(01);
        f1.setNombreFruta("Fresa");
        f1.setSabor("Dulce");
        r1.setMarca("Bershka");
        r1.setTalla(32);
        c1.setColor("rojo");
        c1.setMarca("Ferrari");
        c1.setModelo(2025);
        z1.setMarca("nike");
        z1.setTalla("7");



    
        lista.add(d1);
        lista.add(f1);
        lista.add(r1);
        lista.add(z1);
        lista.add(c1);
        System.out.println(lista);

        
       
        
    }
}