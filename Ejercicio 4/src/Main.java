import models.Contacto;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();
        int opt;

        do {
            System.out.println("-----Menu del sistema-----");
            System.out.println("1. Añadir contacto al sistema");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Buscar contacto por dominio de correo");
            System.out.println("5. Salir");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el correo del contacto: ");
                    String correo = sc.nextLine();

                    System.out.println("Ingrese el numero telefonico del contacto: ");
                    String telefono = sc.nextLine();

                    Contacto contacto = new Contacto(nombre, correo, telefono);
                    contactos.add(contacto);

                    break;

                case 2:
                    for (Contacto c : contactos) {
                        System.out.println(c);
                    } break;

                case 3:
                    System.out.println("Ingrese el nombre del contacto que desea buscar: ");
                    nombre = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (Contacto c : contactos) {
                        if (c.getNombre().toLowerCase().equals(nombre)) {
                            System.out.println(c);
                            found = true;
                        } if (!found) {
                            System.out.println("Contacto no encontrado. Intente de nuevo");
                        }
                    } break;

                case 4:
                    System.out.println("Ingrese el dominio que desea buscar (ej. '@gmail.com', '@hotmail.com'): ");
                    String dominio = sc.nextLine().toLowerCase();
                    found = false;
                    for (Contacto c : contactos) {
                        if (c.getCorreo().toLowerCase().contains(dominio)) {
                            System.out.println(c);
                            found = true;
                        } if (!found) {
                            System.out.println("Contacto no encontrado. Intente de nuevo");
                        }
                    }
            }


        } while(opt != 5);
    }
}
