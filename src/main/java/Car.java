public class Car extends Vehicle implements Driveable {

    @Override
    public void move() {
        drive();
    }

    @Override
    public void getSpeed() {

    }

    @Override
    public void drive() {
        Driveable.super.drive();
    }
}
