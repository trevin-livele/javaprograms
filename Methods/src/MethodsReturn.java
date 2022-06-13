public class MethodsReturn {
    public static void main(String[] args) {
        int a = maxValue(10, 20);
        System.out.println("Maximum is : " + a);

        System.out.println("Maximum is : " + maxValue(30, 40));

        int n1 = 100, n2 = 200;
        System.out.println("Maximum is : " + maxValue(n1, n2));

    }

    public static int maxValue(int number1, int number2) {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }
}
