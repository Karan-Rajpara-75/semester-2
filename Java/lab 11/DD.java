interface Car {
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}
class Swift implements Car {
    private String carModel;
    public Swift(String carModel) {
        this.carModel = carModel;
    }
    @Override
    public void moveForward() {
        System.out.println(carModel + " is moving forward smoothly!");
    }   
    @Override
    public void moveBackward() {
        System.out.println(carModel + " is moving backward carefully!");
    }
    @Override
    public void moveLeft() {
        System.out.println(carModel + " is turning left!");
    }
    @Override
    public void moveRight() {
        System.out.println(carModel + " is turning right!");
    }   
    @Override
    public void applyBreak() {
        System.out.println(carModel + " brake applied - stopping smoothly!");
    }
}
class Thar implements Car {
    private String carModel;
    public Thar(String carModel) {
        this.carModel = carModel;
    }
    @Override
    public void moveForward() {
        System.out.println(carModel + " is moving forward with power!");
    }
    @Override
    public void moveBackward() {
        System.out.println(carModel + " is reversing with strength!");
    }
    @Override
    public void moveLeft() {
        System.out.println(carModel + " is turning left with rugged stability!");
    }
    @Override
    public void moveRight() {
        System.out.println(carModel + " is turning right with rugged stability!");
    }
    @Override
    public void applyBreak() {
        System.out.println(carModel + " brake applied - stopping with power!");
    }
}
public class DD {
    public static void main(String[] args) {
        Car swift = new Swift("Swift 2024");
        swift.moveForward();
        swift.moveLeft();
        swift.moveRight();
        swift.moveBackward();
        swift.applyBreak();
        Car thar = new Thar("Thar SUV");
        thar.moveForward();
        thar.moveLeft();
        thar.moveRight();
        thar.moveBackward();
        thar.applyBreak();
    }
}
