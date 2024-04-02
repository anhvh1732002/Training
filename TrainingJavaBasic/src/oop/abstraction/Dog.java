package oop.abstraction;

public class Dog extends Animal{
    private final int speed;
    @Override
    void sound(){
        System.out.println("Gâu Gâu");
    }
    @Override
    void run(){
        System.out.println("Dog is running with the speed " + speed + " km/h");
    }
    Dog(int speed){
        this.speed = speed;
    }


    public static void main(String[] args) {
        Dog dog = new Dog(60);
        dog.run();
        dog.sound();
    }
}
