import java.util.Scanner;

/*
Este Archivo contendrá el ticket
@Author Jordi
 */

public class ticket {





    public static void ventaprincipal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Si quieres volver al apartado principal presiona 1:");
        System.out.println("Si quiere entrar a la  elección ventas presione 2:");
        int n2=sc.nextInt();


        switch (n2) {
            case 1: Main.opcionesprincipales();
                break;
            case 2: Ventas();
        }

    }
public static void Ventas() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Has elegido la opcion  vendes! ");
    System.out.println("Dime la cantidad del producto que deseas añadir: ");
    int cantidad = entrada.nextInt();
    int[] vectorcodigo = new int[cantidad];



    for (int n = 0; n < cantidad; n++) {
        System.out.println("Dime el codigo del producto:");
        int codigo = entrada.nextInt();
        vectorcodigo[n] = codigo;
        System.out.println("Si quieres volver al apartado principal presiona 1:");
        System.out.println("Si quiere continuar con la elección ventas presione 2:");
        int n2=entrada.nextInt();


        switch (n2) {
            case 1: Main.opcionesprincipales();
                break;
            case 2:ventaprincipal();
        }
    }

    }
}

