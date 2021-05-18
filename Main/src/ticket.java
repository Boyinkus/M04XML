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

        System.out.println("Dime cuantos productos compraras");
        int cantidad = entrada.nextInt();

        System.out.println("Has elegido la opcion  Ventas! ");

        do {
            System.out.println(" Dime el nombre del producto ");
            String product = entrada.next();

            contador++;

            for (int n = 0; n < mostrarcodigo.length; n++) {
                if (mostrarnombre[n].equalsIgnoreCase(product)) {

                    nombrefinal += mostrarnombre[n];
                    codigofinal += mostrarcodigo[n];
                    preciofinal += mostrarprecio[n];

                }
            }
        }


        while (contador <= cantidad);

        System.out.println(nombrefinal);
        System.out.println(codigofinal);
        System.out.println(preciofinal);
    }
}

