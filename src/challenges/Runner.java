package challenges;

import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        String ans = stringRepresentation(8810);
        System.out.println(ans);
    }

    private static void printStr(String str) {
        System.out.println(str);
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

    private static int addDigits(int number) {
        String numberAsString = Integer.toString(number);

        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Character.getNumericValue(numberAsString.charAt(0));
        }

        return sum;
    }

    //better
    private static String stringRepresentation(int number) {
        String[] digits = {"", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number == 0) {
            return digits[0];
        } else if (number < 20) {
            return digits[number];
        } else if (number < 100) {
            return tens[number / 10] + " " + digits[number % 10];
        } else if (number < 1000) {
            if (Objects.equals(stringRepresentation((number % 100)), "")) {
                return digits[number / 100] + " Hundred " + stringRepresentation(number % 100);
            } else {
                return digits[number / 100] + " Hundred and " + stringRepresentation(number % 100);
            }
        } else if (number < 10000) {
            return digits[number / 1000] + " Thousand " + stringRepresentation(number % 1000);
        }

        return "";
    }
}
