package oop.abstraction;

public class Cat extends Animal implements CatBehavior {
    private final int speed;
    @Override
    void sound() {
        System.out.println("Meo Meo");
    }

    @Override
    void run() {
        System.out.println("Cat is running with the speed " + speed + " km/h");
    }

    @Override
    public void catchMouse() {
        System.out.println("Cat can catch Mouse");
    }

    void numberOfFang(){
        System.out.println(fang);
    }
    Cat(int speed){
       this.speed = speed;
    }
    public static void main(String[] args) {
        Cat cat = new Cat(50);
        cat.run();
        cat.sound();
        cat.catchMouse();
        cat.numberOfFang();
    }
}
