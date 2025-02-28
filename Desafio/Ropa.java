public class Ropa {
    String marca;
    int talla;
    Ropa(){
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    @Override
    public String toString() {
        return "Ropa [marca=" + marca + ", talla=" + talla + "]";
    }
    
}
