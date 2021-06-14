public class OverloadingMain {

    public OverloadingMain(){
        System.out.println("Constructor with no parameters called");
    }

    public OverloadingMain(int a){
        System.out.println("Constructor with one integer parameter called");
    }

    public OverloadingMain(int a, int b){
        System.out.println("Constructor with 2 integer parameters called");
    }

    public OverloadingMain(int a, String a1){
        System.out.println("Constructor with 1 integer and 1 String called");
    }

    public static void main(String[] args) {

        new OverloadingMain();
        new OverloadingMain(3);
        new OverloadingMain(1,3);
        new OverloadingMain(1,"Name");

    }
}
