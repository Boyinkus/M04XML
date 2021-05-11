import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

/*
Este archivo hara el stock y vendes.
@author Fidel
*/

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tienda de Jordi y Fidel");
        System.out.println(" ");

        // Vamos a darles las opciones!

        System.out.println("Apreta 1 para entrar al Programa!");
        int n1 = entrada.nextInt();

        switch (n1) {
            case 1:
                opcionesprincipales();
                break;
        }


    }

    public static void opcionesprincipales() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al programa de Fidel Y Jordi ");
        System.out.println("Eliges alguna de las opciones!");
        System.out.println("Opcion 1: Stock");
        System.out.println("Opcion 2: Vender");
        System.out.println("Opcion 3: Salir");

        System.out.println("Dime el numero!");
        int v1 = entrada.nextInt();

        switch (v1) {
            case 1:
                opcion1stock();
                break;
            case 2:
                ticket.ventaprincipal();
                break;
            case 3:
                break;

        }
    }


    public static void opcion1stock() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has elegido la opcion Stock ");
        System.out.println("Eliges alguna de las opciones!");
        System.out.println("Opcion 1: Añadir Producto");
        System.out.println("Opcion 2: Consultar Stock");
        System.out.println("Opcion 3: Salir");

        System.out.println("Dime el numero!");
        int v1 = entrada.nextInt();

        switch (v1) {
            case 1:
                opcion1añadirproducto();
                break;
            //case 2:
              //  opcion2consultarstock(vectornombre, vectorcodigo, vectorprecio);
                //break;
            case 3:
                opcionesprincipales();
                break;

        }
    }


    public static void opcion1añadirproducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has elegido la opcion añadir producto! ");
        System.out.println("Cuantos productos deseas añadir? ");
        int cantidad = entrada.nextInt();
        String[] vectornombre = new String[cantidad];
        int[] vectorcodigo = new int[cantidad];
        double[] vectorprecio = new double[cantidad];


        for (int n = 0; n < cantidad; n++) {

            System.out.println("Añade el nombre del producto");
            String producto = entrada.next();
            vectornombre[n] = producto;
            System.out.println("Dime el codigo del producto");
            int codigo = entrada.nextInt();
            vectorcodigo[n] = codigo;
            System.out.println("Dime el precio del prodcuto");
            double precio = entrada.nextDouble();
            vectorprecio[n] = precio;

            System.out.println("El producto guardado queda asi! :");
            System.out.println("Producto: " + producto + " Codigo: " + codigo + " Precio: " + precio);
            System.out.println("**********");

        }

        System.out.println("Que deseas hacer? ");
        System.out.println("Opcion 1: Volver a Stock!");
        System.out.println("Opcion 2: Volver a Opciones Principales!");
        System.out.println("Opcion 3: Consultar el Stock");
        System.out.println("Dime la Opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                opcion1stock();
                break;
            case 2:
                opcionesprincipales();
                break;
            case 3:
                opcion2consultarstock(vectornombre, vectorcodigo, vectorprecio);
                break;
        }
    }

    public static void opcion2consultarstock(String [] vectornombre, int [ ] vectorcodigo, double [ ] vectorprecio) {
        Scanner entrada = new Scanner(System.in);

        String [ ] mostrarnombre = vectornombre ;
        int [ ] mostrarcodigo = vectorcodigo ;
        double [ ] mostrarprecio = vectorprecio ;

        for (int n =0 ; n<mostrarnombre.length ; n++) {
            System.out.println("Nombre del producto: " + mostrarnombre[n]);
            System.out.println("Codigo del producto: " + mostrarcodigo[n]);
            System.out.println("Precio del producto: " + mostrarprecio[n] + "€");
            System.out.println(" ");
        }

        System.out.println("Que opcion quieres hacer? ");
        System.out.println("Opcion 1: Volver a Menu Principal");
        int i = entrada.nextInt() ;

        switch (i) {
            case 1: opcionesprincipales();
            break;
        }

    }
}
