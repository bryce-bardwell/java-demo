package conditionals;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        months();
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + ">" + num2);
        } else if (num2 > num1) {
            System.out.println(num1 + "<" + num2);
        } else {
            System.out.println(num1 + "=" + num2);
        }

        System.out.println("Enter a third number: ");
        int num3 = scanner.nextInt();

        if (num3 % 2 == 0) {
            System.out.println(num3 + " is even");
        } else {
            System.out.println(num3 + " is odd");
        }

        System.out.println("Enter either red, amber or green");
        String colour = scanner.next();

        switch (colour) {
            case("green"):
                System.out.println("Go!");
                break;
            case("amber"):
                System.out.println("Get ready!");
                break;
            case("red"):
                System.out.println("Stop!");
                break;
            default:
                System.out.println("Invalid colour.");
                break;
        }
         */

    }
    public static void months() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while(choice < 0 || choice > 12) {
            System.out.println("Please enter a month from 1 to 12...");
            choice = scanner.nextInt();
        }

        boolean winter = (choice == 12 || choice <= 2);
        boolean spring = (choice > 2 && choice <= 5);
        boolean summer = (choice > 5 && choice <= 8);
        boolean autumn = (choice > 8 && choice <= 11);

        if (winter) {
            System.out.println("Winter");
        } else if (spring) {
            System.out.println("Spring");
        } else if (summer) {
            System.out.println("Summer");
        } else if (autumn) {
            System.out.println("Autumn");
        }
    }

    private static float maths(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    return 0.0F;
                }
                return a / (float) b;
            default:
                return 0.0F;
        }
    }

}
