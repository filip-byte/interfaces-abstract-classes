public class Road extends Environment <Vehicle> {


    public Road(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void checkTraffic() {

        traffic.forEach(Vehicle::move);

    }

    @Override
    public void checkMaxSpeedExceeded(int input) {

    }


}
