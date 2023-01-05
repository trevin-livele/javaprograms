import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntialize {
    public static void main(String[] args) {

        /*
        ============== Initializing arrays =======================
        Initializing using assignment using subscript or index
        Initializing in one statement during creation
        Initializing using Arrays.fill
        Initializing using for loop
        Initializing by taking user input
        */

        int a[] = new int[5];

        Arrays.fill(a, 5);

        for (int i = 0; i < a.length; i++)
            System.out.println("Value of a[" + i + "] : " + a[i]);

        System.out.println();

        // Initializing using for loop

        int b[] = new int[5];
        for (int i = 0; i < b.length; i++)
            b[i] = i + 1;


        for (int i = 0; i < b.length; i++)
            System.out.println("Value of b[" + i + "] : " + b[i]);


        // Initializing by taking user input

        int c[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 5 integers");
        for (int i = 0; i < c.length; i++)
            c[i] = sc.nextInt();


        for (int i = 0; i < c.length; i++)
            System.out.println("Value of c[" + i + "] : " + c[i]);


    }
}