package hw2;

import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Please enter r: ");
        double r = circle.nextDouble();

        Scanner length = new Scanner(System.in);
        System.out.println("Please enter a: ");
        double a = length.nextDouble();

        Scanner width = new Scanner(System.in);
        System.out.println("Please enter b: ");
        double b = width.nextDouble();

        if (r >= a || r >= b) {
            System.out.println("Квадратное отверстие можно закрыть круглой картонкой!");
        }
        else {
            System.out.println("Квадратное отверстие нельзя закрыть круглой картонкой!");
        }
    }

}
