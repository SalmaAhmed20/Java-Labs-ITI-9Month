package pkgone;

import java.util.Scanner;
import java.util.function.Function;

public class TempMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Temperature : ");
        float x = scanner.nextFloat();

        float out = new Function<Float, Float>() {
            public Float apply(Float c) {
                return (float) ((c * 1.8) + 32);
            }
        }.apply(x);
        System.out.println("\nTemp is =" + x + "°C " + out + "°F");
    }
}
