// Definimos la clase Animal
public class Animal {
    // Atributos de la clase Animal
    private int edad;       // Edad del animal en años
    private double peso;    // Peso del animal en kilogramos
    private String comida;  // Tipo de comida que consume
    private String tipoAnimal; // Tipo de animal (Ej: León, Elefante, Gato)

    // Constructor de la clase para inicializar los atributos
    public Animal(int edad, double peso, String comida, String tipoAnimal) {
        this.edad = edad;
        this.peso = peso;
        this.comida = comida;
        this.tipoAnimal = tipoAnimal;
    }

    // Métodos Getter y Setter para cada atributo

    // Obtiene la edad del animal
    public int getEdad() {
        return edad;
    }

    // Modifica la edad del animal
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Obtiene el peso del animal
    public double getPeso() {
        return peso;
    }

    // Modifica el peso del animal
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Obtiene el tipo de comida que come el animal
    public String getComida() {
        return comida;
    }

    // Modifica el tipo de comida que come el animal
    public void setComida(String comida) {
        this.comida = comida;
    }

    // Obtiene el tipo de animal
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    // Modifica el tipo de animal
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    // Método toString para representar el objeto como un String legible
    @Override
    public String toString() {
        return "Animal { " +"Tipo: '" + tipoAnimal + '\'' + ", Edad: " + edad + " años" +  ", Peso: " + peso + " kg" +     
            ", Comida: '" + comida + '\'' + " }";
    }
}