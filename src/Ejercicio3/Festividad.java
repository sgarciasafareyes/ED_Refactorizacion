package Ejercicio3;

import java.util.Objects;

public class Festividad {

    private String mes;
    private String nombre;

    //Constructores
    //Vacio
    public Festividad() {
    }

    //Con todos los atributos

    public Festividad(String mes, String nombre) {
        this.mes = mes;
        this.nombre = nombre;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //HashCode y Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Festividad that = (Festividad) o;
        return Objects.equals(mes, that.mes) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes, nombre);
    }

    //ToString

    @Override
    public String toString() {
        return "Festividad{" +
                "mes='" + mes + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
