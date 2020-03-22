package exercise4;

import java.util.Scanner;

public class PatternTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String verse = "*";
        String pattern = null;
        for (int i = 1; i <= number; i++) {
            pattern = verse;
            System.out.println(pattern);
            verse += "*";
        }
    }
}
