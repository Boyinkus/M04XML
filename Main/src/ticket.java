import java.util.Scanner;
import java.util.Arrays;

/*
Este Archivo contendrá el ticket
@Author Jordi
 */

public class ticket {
    public static void Ventas(Scanner entrada, String[] mostrarnombre, int[] mostrarcodigo, double[] mostrarprecio) {
        //Guardamos los vectores

        String[] nombre = mostrarnombre;
        int[] codigo = mostrarcodigo;
        double[] precio = mostrarprecio;

        String nombrefinal = " ";
        int codigofinal = 0;
        double preciofinal = 0;
        int contador = 0;


        System.out.println("Has elegido la opcion  Ventas! ");
        System.out.println("Dime el total de productos que compraras: ");
        int cantidad = entrada.nextInt();


        for (int n = 0; n < cantidad; n++) {
            System.out.println("Dime los productos! ");
            String p1 = entrada.next();

        }


        //while (cantidad>=contador);

        System.out.println(nombrefinal);
        System.out.println(codigofinal);
        System.out.println(preciofinal);
    }
}

