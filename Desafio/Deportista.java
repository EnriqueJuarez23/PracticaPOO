public class Deportista {
    String tipoDeporte;
    String nombre;
    int medallas;

    Deportista(){
        
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "Deportista [tipoDeporte=" + tipoDeporte + ", nombre=" + nombre + ", medallas=" + medallas + "]";
    }


}
