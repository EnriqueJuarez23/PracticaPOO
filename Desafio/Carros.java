class Carros {

    int modelo;
    String marca;
    String color;

    Carros(){
    
    }


    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Carros [modelo=" + modelo + ", marca=" + marca + ", color=" + color + "]";
    }




}