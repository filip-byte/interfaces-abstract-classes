import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected final int maxSpeed;

    public Environment(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }


    public void checkVehicles() {
        for (T t : traffic) {
            if (t instanceof Vehicle) {
                ((Vehicle) t).move();
            }

        }
    }

    public abstract void checkMaxSpeedExceeded(int input);


}