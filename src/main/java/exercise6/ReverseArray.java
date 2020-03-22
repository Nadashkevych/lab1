package exercise6;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[length];
        for (int i = length; i > 0; i--) {
            newArray[length - i]
                    = array[i - 1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
