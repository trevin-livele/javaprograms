public class MethodsParameters {
    public static void main(String[] args) {

        /*

        modifier return-type method-name(<parameter list>){
            //statements;
        }

        */

        String name1 = "John";
        int count = 5;
        displayName(name1, count);
        displayName("Steve", 10);

    }

    public static void displayName(String name, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(i + " : " + name);
        }
    }

}
