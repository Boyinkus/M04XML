import java.util.Scanner;
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
                opcionesprincipales(n1);
                break;
        }


    }

    public static void opcionesprincipales(int n1) {
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
                opcion1stock(n1);
                break;
            //case 2:
              //  opcion2Vender(n1) ;
            case 3:
                break;

        }
    }


    public static void opcion1stock (int n1) {
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
                opcion1añadirproducto(n1);
                break;
            case 2:
                opcion2consultarstock(n1);
            case 3:
                opcionesprincipales(n1);

        }
    }


    public static void opcion1añadirproducto(int n1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has elegido la opcion Consulta ");
        System.out.println("Añade el nombre del producto");
        String producto = entrada.nextLine();
        System.out.println("Dime el codigo del producto");
        int codigo = entrada.nextInt();
        System.out.println("Dime el precio del prodcuto");
        double precio = entrada.nextInt();

        System.out.println("El producto guardado queda asi! :");
        System.out.println("Producto: " + producto + " Codigo: " + codigo + " Precio: " + precio);
        System.out.println("**********");

        System.out.println("Que deseas hacer? ");
        System.out.println("Opcion 1: Volver a Stock!");
        System.out.println("Opcion 2: Volver a Opciones Principales!");
        System.out.println("Dime la Opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1: opcion1stock(n1);
            break;
            case 2: opcionesprincipales(n1);
        }
    }

    public static void opcion2consultarstock (int n1) {

    }

}
