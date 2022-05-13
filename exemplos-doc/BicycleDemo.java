class Bicycle{
    //create variable "field"
    int cadence = 0;
    int gear = 0;
    int speed = 0;

    //methods
    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speeUp(int increment){
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    //output method
    void printStates(){
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
    
}

public class BicycleDemo {
    public static void main(String[] args){
        //create two differents Bicycles Objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speeUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speeUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speeUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
