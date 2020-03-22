package exercise2;

import java.util.Scanner;

public class SequenceSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sequenceFound = false;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (array[i + 1] == 2) {
                    if (array[i + 2] == 3) {
                        sequenceFound = true;
                    }
                }
            }
        }
        System.out.println(sequenceFound);
    }
}
