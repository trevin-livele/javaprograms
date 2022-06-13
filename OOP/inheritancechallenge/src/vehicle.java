public class vehicle {
    private String name;
    private String size;

    private int CurrentVelocity;
    private int CurrentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.CurrentDirection = 0;
        this.CurrentVelocity = 0;
    }

    public void steer (int direction){
        this.CurrentDirection += direction;
        System.out.println("vehicle.steer(): Steering at " + CurrentDirection + "Degrees.");
    }

    public void move(int direction , int velocity){
        CurrentDirection = direction;
        CurrentVelocity = velocity;
        System.out.println("Vehicle.move() : Moving at " + CurrentVelocity + "in direction " + CurrentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    public void stop() {
        this.CurrentVelocity = 0;
    }


}
