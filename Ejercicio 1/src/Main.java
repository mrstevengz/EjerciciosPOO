import models.Estudiante;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();


        //Alumno 1

        double [] notas1 = {99.5, 98.5, 100};
        estudiante1.setNotas(notas1);
        estudiante1.setNombre("Steven Sequeira");
        estudiante1.setEdad(18);

        

        System.out.println(estudiante1);
        estudiante1.calcularPromedio();

        //Alumno 2

        double [] notas2 = {91, 85.5, 93};
        estudiante2.setNotas(notas2);
        estudiante2.setNombre("Juan Perez");
        estudiante2.setEdad(25);

        System.out.println(estudiante2);
        estudiante2.calcularPromedio();
    }
}
