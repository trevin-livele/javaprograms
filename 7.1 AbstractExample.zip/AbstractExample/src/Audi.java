public class Audi extends Car{


    @Override
    void applyBrakes() {
        System.out.println("Applying brakes to Audi");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating Audi");
    }
}
