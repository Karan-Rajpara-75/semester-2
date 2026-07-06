class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String color = "Black";

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        super.eat();
        System.out.println("Dog is eating bread");
    }
}

public class A3{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
        d.eat();
    }
}