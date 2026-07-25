package OOPs;

public class Car {
    float fuel;
    String color;
    public Car driving(){
        System.out.println("Driving Car");
        fuel--;
        return this;
    }
    public void fillFuel(float fuel){
        System.out.println("Filling fuel");
        this.fuel += fuel;
    }
}
class TestCar{
    public static void main(String[] args){
        Car car = new Car();
        car.color = "red";
        car.fuel = 100;
        car.driving();
        car.fillFuel(5);
        System.out.println(car.fuel);
        car.driving().fillFuel(12);
        System.out.println(car.fuel);
        System.out.println((car.driving()));
        System.out.println(car.fuel);

    }
}
