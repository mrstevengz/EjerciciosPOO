import models.Libro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos libros desea registrar al sistema?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        int op;

        Libro[] libros = new Libro[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("-----Registre el libro-----");
            System.out.print("Titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Año: ");
            int año = sc.nextInt();
            sc.nextLine();

            libros[i] = new Libro(titulo, autor, año);
        }

        do {
            System.out.println("-----Menu del gestor de libros-----");
            System.out.println("1. Buscar libro por autor");
            System.out.println("2. Buscar libro por palabra clave");
            System.out.println("3. Buscar libros despues del 2010");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion:");
            op =  sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre de autor: ");
                    String autor = sc.nextLine();
                    for (Libro libro : libros) {
                        if (libro.getAutor().equalsIgnoreCase(autor)) {
                            System.out.println(libro);
                        }
                    } break;

                case 2:
                    System.out.println("Ingrese la palabra clave: ");
                    String palabraClave = sc.nextLine().toLowerCase();
                    for (Libro libro : libros) {
                        if (libro.getTitulo().toLowerCase().contains(palabraClave)) {
                            System.out.println(libro);
                        }
                    } break;

                case 3:
                    System.out.println("---Lista de libros publicados luego de 2010---");
                    for (Libro libro : libros) {
                        if (libro.getAño() > 2010) {
                            System.out.println(libro);
                        }
                    } break;
                case 4:
                    System.out.println("Saliendo de programa");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo");
                    break;
            }
    } while (op != 4);
        sc.close();
    }
}
