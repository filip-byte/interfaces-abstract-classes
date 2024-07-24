public class Water extends Environment <Swimmable> {


    public Water(int maxSpeed) {
        super(maxSpeed);
    }


    @Override
    public void checkTraffic() {

        traffic.forEach(Swimmable::swim);

    }

    @Override
    public void checkMaxSpeedExceeded(int input) {

    }


}
