import com.sun.jdi.PathSearchingVirtualMachine;

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

        // Ya tenemos nuestra ""BBDD"" con el nombre, codigo, y precio.

        String nombrefinal = "";
        int codigofinal = 0;
        double preciofinal = 0;
        int contador = 0;

        // En este apartado hemos inicializado funciones auxiliares para poder llevar a cabo las ventas.

        System.out.println("Dime cuantos productos compraras");
        int cantidad = entrada.nextInt();

        // En ese apartado intentaremos tener los arrays para guardar los valores en el ticket!

        String[] nombreticket = new String[cantidad];
        int[] codigoticket = new int[cantidad];
        double[] precioticket = new double[cantidad];

        System.out.println("Has elegido la opcion  Ventas! ");

        do {
            System.out.println(" Dime el nombre del producto ");
            String product = entrada.next();

            contador++;

            for (int n = 0; n < mostrarcodigo.length; n++) {
                if (mostrarnombre[n].equalsIgnoreCase(product)) {

                    //nombrefinal += mostrarnombre[n];
                    nombreticket[contador-1] += mostrarnombre[n];

                    //codigofinal += mostrarcodigo[n];
                    codigoticket[contador-1] += mostrarcodigo[n];

                    //preciofinal += mostrarprecio[n];
                    precioticket[contador-1] += mostrarprecio[n];

                }
            }
        }
        while (contador <= cantidad);

        //System.out.println(nombrefinal);
        //System.out.println(codigofinal);
        //System.out.println(preciofinal);

        System.out.println("Venta done! Presiona 1 para generara el ticket!");
        int v1 = entrada.nextInt();

        switch (v1) {
            case 1:
                mostrarticket(entrada, nombreticket, codigoticket, precioticket);
        }

    }

    public static void mostrarticket(Scanner entrada, String[] nombreticket, int[] codigoticket, double[] precioticket) {

        String[] ticketnombre = nombreticket;
        int[] ticketcodigo = codigoticket;
        double[] ticketprecio = precioticket;

        double preciototal = 0 ;

        System.out.println("********** GENERANDO TICKET **********");

        for (int n = 0; n < ticketcodigo.length ; n++) {

            System.out.println("Nombre del producto " + (n+1) + ": " + (ticketnombre[n]));
            System.out.println("Codigo del producto: " + codigoticket[n]);
            System.out.println("Precio del producto: " + precioticket[n] + "€");
            preciototal += ticketprecio[n] ;
            System.out.println(" ");
        }

        System.out.println("*******************************************");
        System.out.println("Precio total a pagar: " + preciototal + "€");


    }


}

