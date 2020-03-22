package exercise5;

import java.util.Scanner;

public class HalfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] strings = line.split("");
        String newLine = "";
        for (int i = 0; i < strings.length / 2; i++) {
            newLine += strings[i];
        }
        System.out.println(newLine);
    }
}
