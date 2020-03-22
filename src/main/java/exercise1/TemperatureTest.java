package exercise1;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature1 = input.nextDouble();
        double temperature2 = input.nextDouble();
        boolean ifLower = false;
        if (temperature1 < 100 || temperature2 < 100) {
            ifLower = true;
        }
        System.out.println(ifLower);
    }
}
