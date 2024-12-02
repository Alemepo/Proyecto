// Trapezio.java
package figuras;

import java.util.Scanner;

public class Trapecio {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in); 
            System.out.print("Ingrese las bases del trapecio: ");
            double base1 = scanner.nextDouble();
            double base2 = scanner.nextDouble();
            System.out.print("Ingrese la altura del trapecio: ");
            double height = scanner.nextDouble();
            double area = (base1+base2) * height / 2;
            System.out.println("El área del trapezio es: " + area);
            scanner.close();
        }
    }
