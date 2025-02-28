public class Zapatos {
    String talla;
    String marca;
    Zapatos(){
        
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Zapatos [talla=" + talla + ", marca=" + marca + "]";
    }
    

}
