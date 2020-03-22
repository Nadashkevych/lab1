package exercise3;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean rightTriangle = false;
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
                || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
            rightTriangle = true;
        }
        System.out.println(rightTriangle);
    }
}
