class Restaurante {                          
String nombre, direccion, rfc;
int telefono;
Restaurante (){}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getRfc() {
    return rfc;
}
public void setRfc(String rfc) {
    this.rfc = rfc;
}
public int getTelefono() {
    return telefono;
}
public void setTelefono(int telefono) {
    this.telefono = telefono;
}
@Override
public String toString() {
    return "Restaurante [nombre=" + nombre + ", direccion=" + direccion + ", rfc=" + rfc + ", telefono=" + telefono
            + "]";
}

}