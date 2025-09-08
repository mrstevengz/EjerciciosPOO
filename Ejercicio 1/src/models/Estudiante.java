package models;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private int edad;
    private double [] notas;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        } double promedio = suma / notas.length;

        System.out.println("El promedio del estudiante es: " + promedio);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estudiante{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", notas=").append(Arrays.toString(notas));
        sb.append('}');
        return sb.toString();
    }
}

