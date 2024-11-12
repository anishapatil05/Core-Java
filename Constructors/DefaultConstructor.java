package constructor;

/* Constructor : 1. Default Constructor(O parameterized constructor ) 
 *               2. Parameterized Constructor   */
class Car {

    public String carcompany;

    public Car() {
        System.out.println("Car Constructor is called");
        carcompany = "Maruti Suziki";
    }
}

public class DefaultConstructor {

    public DefaultConstructor() {
        System.out.println("Default Constructor is called");
    }

    public static void main(String[] args) {
        // calling DefaultConstructor();
        DefaultConstructor obj = new DefaultConstructor();

        // calling Car Constructor
        Car car = new Car();
        System.out.println("Company name: " + car.carcompany);

    }

}
