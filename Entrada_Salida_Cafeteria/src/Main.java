/* Programa en Java un simulador de cafetería.
Debe pedir los siguientes datos al usuario:
1. Cantidad de cafés que va a pedir.
2. Cantidad de tostadas que va a pedir.
3. Cantidad de zumo que va a pedir.
El usuario debe introducir la cantidad de productos que quiere y el programa debe calcular la cuenta a pagar introduciendo el valor de cada uno.
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number_prodcuts = new Scanner(System.in);
        int n_coffe = 0, n_toast = 0, n_juice = 0;
        Scanner value_prodcuts = new Scanner(System.in);
        double price_coffe = 0, price_toast = 0, price_juice = 0;
        double bill;

        System.out.println("¿Cuantos cafés va a tomar?");
        n_coffe = number_prodcuts.nextInt();
        System.out.println("¿Cual es el precio del café?");
        price_coffe = value_prodcuts.nextDouble();

        System.out.println("¿Cuantas tostadas va a tomar?");
        n_toast = number_prodcuts.nextInt();
        System.out.println("¿Cual es el precio de la tostada?");
        price_toast = value_prodcuts.nextDouble();

        System.out.println("¿Cuantos zumos va a tomar?");
        n_juice = number_prodcuts.nextInt();
        System.out.println("¿Cual es el precio del zumo?");
        price_juice = value_prodcuts.nextDouble();

        bill = (n_coffe * price_coffe) + (n_toast * price_toast) + (n_juice * price_juice);

        System.out.println("Total cuenta a pagar es de = " + bill + " €");

    }
}
