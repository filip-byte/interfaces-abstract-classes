public interface Driveable extends Movable {

    public default void drive(){

        System.out.println((getClass().getSimpleName() + " is being driven."));

    }

}
