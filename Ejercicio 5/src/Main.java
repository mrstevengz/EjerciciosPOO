import models.AnalizadorTexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        texto = sc.nextLine();
        AnalizadorTexto at = new AnalizadorTexto(texto);

        int op;
        do {

            System.out.println("1. Contar palabras de la cadena");
            System.out.println("2. Contar ocurrencias de una palabra");
            System.out.println("3. Reemplazar una palabra por otra");
            System.out.println("4. Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Su cadena contiene " + at.countWords(texto) + " palabras");
                    break;


                case 3:
                    System.out.println("Ingrese la palabra que desea reemplazar en la cadena: ");
                    String palabra = sc.nextLine();
                    System.out.println("Ingrese una palabra para reemplazarla: ");
                    String palabra2 = sc.nextLine();

                    if (at.getTexto().trim().toLowerCase().contains(palabra.toLowerCase())) {
                        String nuevoTexto = at.getTexto().replace(palabra, palabra2);
                        at.setTexto(nuevoTexto);
                    }
                    System.out.println("Su nueva cadena de texto es: " + at.getTexto());
                    break;
            }

        } while (op != 4);







    }
}
