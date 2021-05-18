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

        System.out.println("Has elegido la opcion  Ventas! ");
        System.out.println(" Dime el nombre del producto ");
        String product = entrada.next();

        do {
            for (int n = 0; n < mostrarcodigo.length; n++) {
                if (mostrarnombre[n].equalsIgnoreCase(product)) {

                    nombrefinal += mostrarnombre[n];
                    codigofinal += mostrarcodigo[n];
                    preciofinal += mostrarprecio[n];

                }
            }
        }

        while (product.equalsIgnoreCase("finalizado"));

        System.out.println(nombrefinal);
        System.out.println(codigofinal);
        System.out.println(preciofinal);
    }
}

