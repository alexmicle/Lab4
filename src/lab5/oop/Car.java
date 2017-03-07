package lab5.oop;

/**
 * Created by alexm on 3/7/2017.
 */
public class Car extends Vehicle{

    private String name;

    @Override
    public void moves(){
        System.out.println("Car moves!");
        stops();
    }

    public void stops(){
        System.out.println("Car stops!");
    }

    public static void main(String[] args) {
        Car dacia = new Car();

        dacia.moves();
    }

}
