package challenges;

public class Runner {
    public static void main(String[] args) {
        int ans = addDigits(6666);
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

    private static int stringRepresentation(int number) {
        if (number > 9999) {
            System.out.println("Not allowed!");
            return -1;
        }

        String out = "";
        String numberAsString = Integer.toString(number);

        for (int i = 0; i < numberAsString.length(); i++) {
            char current = numberAsString.charAt(0);

        }

        return 0;
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
