import java.util.Scanner;

public class SwapMain {
    public static void main(String[] args) {
        //Swap two variables using third variable

        int a, b, temp;

        System.out.println("Enter 2 values to swap");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        //use temp variable to swap values

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first variable : " + a);
        System.out.println("Value of second variable : " + b);


    }

}
