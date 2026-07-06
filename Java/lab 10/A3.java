abstract class Vehicle{

    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{

    void startEngine(){
        System.out.println("Car engine started");
    }

    void stopEngine(){
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle{

    void startEngine(){
        System.out.println("Motorcycle engine started");
    }

    void stopEngine(){
        System.out.println("Motorcycle engine stopped");
    }
}

public class A3{

    public static void main(String[] args){

        Vehicle v1 = new Car();
        v1.startEngine();
        v1.stopEngine();

        Vehicle v2 = new Motorcycle();
        v2.startEngine();
        v2.stopEngine();
    }
}