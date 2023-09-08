package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) throws IOException {
        /* String firstName = "Bryce";
        String lastName = "Bardwell";
        String name = firstName + " " + lastName;

        System.out.println(name); */

        /* int num1 = 2;
        int num2 = 4;

        float result = num1 / (float) num2;

        System.out.println(result);

        int num3 = 8;

        System.out.println(num3++); //increments THEN prints
        System.out.println(num3);
        System.out.println(++num3); //prints THEN increments */

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        /* System.out.println("Enter your name below... \n");
        String name = bufferedReader.readLine();
        System.out.println("Hello, " + name + "!"); */

        System.out.println("Enter your numbers below... ");
        float num1 = Integer.parseInt(bufferedReader.readLine());
        float num2 = Integer.parseInt(bufferedReader.readLine());

        float sum = num1 + num2;
        System.out.println("The sum of your numbers is " + sum + "!");
    }


}

