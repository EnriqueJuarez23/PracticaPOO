class Auto{
    String color;
    int año;
    String marca;
    int precio;

    Auto(){
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Auto [color=" + color + ", año=" + año + ", marca=" + marca + ", precio=" + precio + "]";
    }
    
}