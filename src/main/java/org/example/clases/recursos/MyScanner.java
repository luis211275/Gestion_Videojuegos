package org.example.clases.recursos;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
    private static Scanner sc;

    public MyScanner() {
        sc = new Scanner(System.in);
    }

    public int pedirNumero(String mns) {
        int n = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(mns);
                n = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return n;
    }

    public double pedirDecimal(String mns) {
        double num = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.printf(mns);
                num = sc.nextDouble();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return num;
    }

    public String pedirSoloTexto(String texto) {
        String input;
        boolean valido;
        do {
            System.out.println(texto);
            input = sc.nextLine().trim();
            valido = input.matches("[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ ]+");
            if (!valido) {
                System.out.println("ERROR: solo se permiten letras (sin números ni símbolos). Inténtalo de nuevo.");
            }
        } while (!valido);
        return input;
    }

    public char pedirLetra(String texto) {
        String input;
        boolean valido;
        do {
            System.out.println(texto);
            input = sc.nextLine().trim();
            valido = input.matches("[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ ]");
            if (!valido) {
                System.out.println("ERROR: solo se permite introducir una letra. Inténtalo de nuevo.");
            }
        } while (!valido);

        return input.charAt(0);
    }

    public String pideTexto(String mensaje) {
        String texto;
        do {
            System.out.println(mensaje);
            texto = sc.nextLine();
            if (texto.isEmpty()) {
                System.out.println("Error: el campo no puede estar vacio.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    public String pideContraseña (String mensaje) {
        String texto;
        boolean Mayus;
        boolean Special;
        boolean valido = false;
        do {
            System.out.println("Introduce la contraseña");
            texto = sc.nextLine();
            Mayus = texto.matches ("[A-Z] + ");
            Special = texto.matches("[@#~%&$?¿!¡] + ");
            if (texto.isEmpty()) {
                System.out.println("Error: La contraseña no puede estar vacia.");
            } if (!Special || !Mayus) {
                System.out.println("Error: Debes introducir un numero especial y una mayuscula");
            }
        }while (valido);
        return texto;
    }

    public void cerrar() {
        sc.close();
    }

}
