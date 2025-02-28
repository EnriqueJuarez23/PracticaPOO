public class Frutas {
    int id;
    String nombreFruta;
    String sabor;

    Frutas() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Frutas [id=" + id + ", nombreFruta=" + nombreFruta + ", sabor=" + sabor + "]";
    }

}