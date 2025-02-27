// Importamos las clases necesarias
import java.util.ArrayList; // Para usar listas dinámicas
import java.util.Scanner;   // Para capturar la entrada del usuario

// Clase principal donde se ejecuta el programa
public class MainAnimal {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un ArrayList para almacenar objetos de tipo Animal
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        // Bucle para pedir datos de 3 animales al usuario
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del animal " + i + ":");

            // Pedimos el tipo de animal
            System.out.print("Tipo de animal: ");
            String tipo = scanner.nextLine();

            // Pedimos la edad del animal
            System.out.print("Edad del animal: ");
            int edad = scanner.nextInt();

            // Pedimos el peso del animal
            System.out.print("Peso del animal (kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiamos el buffer del scanner

            // Pedimos el tipo de comida que consume el animal
            System.out.print("Tipo de comida: ");
            String comida = scanner.nextLine();

            // Creamos un nuevo objeto de tipo Animal con los datos ingresados
            Animal animal = new Animal(edad, peso, comida, tipo);

            // Agregamos el objeto creado al ArrayList
            listaAnimales.add(animal);
        }

        // Mostramos la lista de animales ingresados
        System.out.println("\nLista de animales registrados:");
        for (Animal animal : listaAnimales) {
            System.out.println(animal); // Se llama al método toString() automáticamente
        }

    }
}