package challenges;

public class Runner {
    public static void main(String[] args) {
        float answer = maths(20, 0, '/');
        System.out.println(answer);
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
}
