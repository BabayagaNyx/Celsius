import java.util.Scanner;

public class CelsiusToF {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println("La temperatura de " + celsius + " grados celcius, es equivalente a " +
                    fahrenheit + " Grados fahrenheit.");
        }

}
