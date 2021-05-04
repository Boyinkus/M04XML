import java.util.Scanner;

/*
Este Archivo contendrá el ticket
@Author Jordi
 */

public class ticket {





    public static void ventaprincipal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Si quieres volver al apartado principal presiona 1:");
        System.out.println("Si quiere continuar con la elección ventas presione 2:");
        int n2=sc.nextInt();


        switch (n2) {
            case 1: Main.opcionesprincipales();
                break;
            case 2: Ventas();
        }

    }
public static void Ventas () {
    System.out.println("has elegido la opción Ventas:");
    System.out.println("Que producto quieres?");



}
}
