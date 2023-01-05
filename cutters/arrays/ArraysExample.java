public class ArraysExample {
    public static void main(String[] args) {

        /*
        Creating array is a 3 step process
        1. Declare array
        2. Allocate memory
        3. Initialize array

        1. Declare array

        data-type array-name[];
        data-type[] array-name;

         */

        int a[];
        int[] b;

        /*
        2. allocate memory

        array-name = new data-type[size];
         */

        a = new int[5];


        /*
        3. initialize values

        array-name[index] = value;

        */

        a[0] = 10;
        a[1] = 20;
        a[2] = 50;
        a[3] = 40;
        a[4] = 80;

        for (int i = 0; i < a.length; i++)
            System.out.println("Value of a[" + i + "] : " + a[i] );


        //Combining declaration and memory allocation
        int c[] = new int[5];

        //Declaration + memory allocation + initialization
        int d[] = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < d.length; i++)
            System.out.println("Value of d[" + i + "] : " + d[i] );
    }
}
