public class ArraysJava {
    public static void main(String[] args) {
        int a[] = new int[]{5, 4, 3, 2, 1};

        //Assigning one array to another array

        int b[] = a;

        for (int i = 0; i < b.length; i++)
            System.out.println("Value of b[" + i + "] : " + b[i]);


        //Assigning value from array to variable
        System.out.println();

        int z = b[0];
        System.out.println("Value of z : " + z);
    }
}
