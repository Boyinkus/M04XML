import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tienda de Jordi y Fidel");
        System.out.println("Selecciona alguna de las opciones! ");

        // Vamos a darles las opciones!

        System.out.println("Apreta 1 para entrar al Programa!");
        int n1 = entrada.nextInt() ;

        switch (n1) {
            case 1: OpcionesPrincipales(n1);
                break;
        }


        }

    public static void OpcionesPrincipales (int n1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al programa de Fidel Y Jordi ");
        System.out.println("Eliges alguna de las opciones!");
        System.out.println("Opcion 1: Añadir Producto");
        System.out.println("Opcion 2: Consultar Stock");
        System.out.println("Opcion 3: Salir");

        System.out.println("Dime el numero!");
        int v1 = entrada.nextInt();

        switch (v1) {
            case 1: opcion1test(n1);
                break ;

        }
    }


    public static void opcion1test (int n1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has elegido la opcion Stock ");
        System.out.println("Eliges alguna de las opciones!");
        System.out.println("Opcion 1: Añadir Producto");
        System.out.println("Opcion 2: Consultar Stock");
        System.out.println("Opcion 3: Salir");

        System.out.println("Dime el numero!");
        int v1 = entrada.nextInt();

        switch (v1) {
            case 1: opcion2(n1);
            break ;
            case 3: OpcionesPrincipales(n1);

        }
    }



    public static void opcion2(int n1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has elegido la opcion Consulta ");
        System.out.println("Añade el nombre del producto");
        String producto = entrada.next() ;
        System.out.println("Dime el codigo del producto");
        int codigo = entrada.nextInt();
        System.out.println("Dime el precio del prodcuto");
        int precio = entrada.nextInt();
    }

}
