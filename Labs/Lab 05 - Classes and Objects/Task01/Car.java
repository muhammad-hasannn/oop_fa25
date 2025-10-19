/*
Write a class named Car that has the following data members:
    •	yearModel – an int field that hold the car’s year model.
    •	make – a String field that holds the make of the car.
    •	speed – an int field that holds the car’s current speed.

The class also should have the following constructor and other methods:
    •	constructor – that accepts the car’s year model and make as arguments. These values should be assigned to the object’s yearModel and make fields. The constructor also should assign 0 to the speed field.
    •	Accessors. Appropriate accessor methods should get the values stored in an object’s yearModel, make and speed fields.
    •	accelerate. The accelerate method should add 5 to the speed field each time it is called.
    •	brake. The brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Then call the brake method five times. After each call to the brake method, get the current speed of the car and display it.
*/



package Task01;

public class Car {
    private int yearModel;
    private  String make;
    private int speed;

    // constructor
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    // getters
    public int getYearModel() {
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }

    // methods to accelerate & brake
    public void accelerate(){
        speed += 5;
    }
    public void brake(){
        speed -= 5;
    }

    public static void main(String[] args) {
        Car c = new Car(2022, "Honda");

        // accelerating and displaying speed five times
        for(int i = 0; i < 5; i++){
            c.accelerate();
            System.out.println(c.getSpeed());
        }

        System.out.println();

        // braking 4 times and displaying speed
        for(int i = 0; i < 4; i++){
            c.brake();
            System.out.println(c.getSpeed());
        }
    }
}