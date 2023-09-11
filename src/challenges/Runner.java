package challenges;

public class Runner {
    public static void main(String[] args) {
        stringRepresentation(100);
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

    //bad 
    private static StringBuilder stringRepresentation(int number) {
        String numberAsString = Integer.toString(number);
        StringBuilder output = new StringBuilder();

        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] singles = {"", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine"};

        if (number >= 1000) {
            output.append(singles[Character.getNumericValue(numberAsString.charAt(0))]);
            output.append(" thousand ");
            output.append(singles[Character.getNumericValue(numberAsString.charAt(1))]);

            if (Character.getNumericValue(numberAsString.charAt(1)) != 0) {
                output.append(" hundred ");
            }

            output.append(tens[Character.getNumericValue(numberAsString.charAt(2))]);
            output.append(singles[Character.getNumericValue(numberAsString.charAt(3))]);
        }

        else if (number >= 100) {
            output.append(singles[Character.getNumericValue(numberAsString.charAt(0))]);
            output.append(" hundred ");
            output.append(tens[Character.getNumericValue(numberAsString.charAt(1))]);
            output.append(singles[Character.getNumericValue(numberAsString.charAt(2))]);
        }

        else if (number >= 10) {
            output.append(teens[Character.getNumericValue(numberAsString.charAt(1))]);
        }

        else if (number >= 0) {
            output.append(singles[Character.getNumericValue(numberAsString.charAt(0))]);
        }

        System.out.println(output);
        return output;
    }


    private static String getStrHelper(int num) {
        switch(num) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }
}
