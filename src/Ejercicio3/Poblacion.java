package Ejercicio3;

import java.util.Objects;

public class Poblacion {
    private String nombre;
    private int numHabitantes;

    private double costeLuzMedio;
    private int numHabitantesAreaMetropolitana;

    private int numHabitantesAreaRural;

    private Festividad festividad;


    //Constructores
//vacio
    public Poblacion() {
    }
//con todos los atributos

    public Poblacion(String nombre, int numHabitantes, double costeLuzMedio, int numHabitantesAreaMetropolitana, int numHabitantesAreaRural, Festividad festividad) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
        this.costeLuzMedio = costeLuzMedio;
        this.numHabitantesAreaMetropolitana = numHabitantesAreaMetropolitana;
        this.numHabitantesAreaRural = numHabitantesAreaRural;
        this.festividad = festividad;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getCosteLuzMedio() {
        return costeLuzMedio;
    }

    public void setCosteLuzMedio(double costeLuzMedio) {
        this.costeLuzMedio = costeLuzMedio;
    }

    public int getNumHabitantesAreaMetropolitana() {
        return numHabitantesAreaMetropolitana;
    }

    public void setNumHabitantesAreaMetropolitana(int numHabitantesAreaMetropolitana) {
        this.numHabitantesAreaMetropolitana = numHabitantesAreaMetropolitana;
    }

    public int getNumHabitantesAreaRural() {
        return numHabitantesAreaRural;
    }

    public void setNumHabitantesAreaRural(int numHabitantesAreaRural) {
        this.numHabitantesAreaRural = numHabitantesAreaRural;
    }

    public Festividad getFestividad() {
        return festividad;
    }

    public void setFestividad(Festividad festividad) {
        this.festividad = festividad;
    }

    //Equals & HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poblacion poblacion = (Poblacion) o;
        return numHabitantes == poblacion.numHabitantes && Double.compare(poblacion.costeLuzMedio, costeLuzMedio) == 0 && numHabitantesAreaMetropolitana == poblacion.numHabitantesAreaMetropolitana && numHabitantesAreaRural == poblacion.numHabitantesAreaRural && Objects.equals(nombre, poblacion.nombre) && Objects.equals(festividad, poblacion.festividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numHabitantes, costeLuzMedio, numHabitantesAreaMetropolitana, numHabitantesAreaRural, festividad);
    }

    //toString

    @Override
    public String toString() {
        return "Poblacion{" +
                "nombre='" + nombre + '\'' +
                ", numHabitantes=" + numHabitantes +
                ", costeLuzMedio=" + costeLuzMedio +
                ", numHabitantesAreaMetropolitana=" + numHabitantesAreaMetropolitana +
                ", numHabitantesAreaRural=" + numHabitantesAreaRural +
                ", festividad=" + festividad +
                '}';
    }
}


