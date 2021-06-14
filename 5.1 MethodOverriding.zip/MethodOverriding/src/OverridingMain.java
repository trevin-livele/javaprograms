class A {

    // Overridden method
    void display() {
        System.out.println("Display of class A");
    }
}


class OverridingMain extends A {

    // Overriding method
    @Override
    void display() {
        System.out.println("Display of class OverridingMain");
    }

    public static void main(String[] args) {
        OverridingMain overridingMain = new OverridingMain();
        overridingMain.display();
    }
}
