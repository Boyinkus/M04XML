import java.util.Scanner;

/*
Este Archivo contendrá el ticket
@Author Jordi
 */

public class ticket {


    public static void ventaprincipal(Scanner entrada) {
        System.out.println("Si quieres volver al apartado principal presiona 1:");
        System.out.println("Si quieres entrar a la  elección ventas presione 2:");
        int n2 = entrada.nextInt();


        switch (n2) {
            case 1:
                Main.opcionesprincipales(entrada);
                break;
            case 2:
                Ventas(entrada);
        }

    }

    public static void Ventas(Scanner entrada) {
        System.out.println("Has elegido la opcion  Ventas! ");
        System.out.println("Dime la cantidad del producto que deseas añadir: ");
        int cantidad = entrada.nextInt();
        int[] vectorcodigo = new int[cantidad];


        for (int n = 0; n < cantidad; n++) {
            System.out.println("Dime el producto numero: " + n );
            int codigo = entrada.nextInt();
            vectorcodigo[n] = codigo;
            System.out.println("Si quieres volver al apartado principal presiona 1:");
            System.out.println("Si quiere continuar con la elección ventas presione 2:");
            int n2 = entrada.nextInt();


            // switch (n2) {
            //   case 1: Main.opcionesprincipales(entrada);
            //     break;
            //case 2:ventaprincipal(entrada);
            //}
        }
    }
}

