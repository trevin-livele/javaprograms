public class AbstractExampleMain {
    public static void main(String[] args) {


        Car car1 = new Ferrari();
        CarRepair carRepair = new CarRepair();
        carRepair.repairCar(car1);

        car1 = new Audi();
        carRepair.repairCar(car1);

        car1 = new Tesla();
        carRepair.repairCar(car1);
    }
}
