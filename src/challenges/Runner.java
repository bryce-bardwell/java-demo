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

        System.out.println(sum);
        return sum;
    }
}
