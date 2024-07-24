public class Sky extends Environment<Flyable>{


    public Sky(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void checkTraffic() {

//        for (Flyable flyable : traffic) {
//            flyable.fly();
//        }

        traffic.forEach(Flyable::fly);

    }

    @Override
    public void checkMaxSpeedExceeded(int input) {

    }
}
