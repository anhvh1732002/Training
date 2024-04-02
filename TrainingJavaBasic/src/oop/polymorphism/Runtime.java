package oop.polymorphism;

public class Runtime {
    //Polymorphism in runtime
    static class Animal {
        void run(){
            System.out.println("Running");
        }
        void eat(){
            System.out.println("The animal is eating");
        }
        //Overload
        void run(int n){
            System.out.println("The animal is running with the speed " + n + " km/h");
        }
    }

    static class Cat extends Animal {
        @Override
        void run(){
            System.out.println("The cat is running");
        }
        void eat(){
            System.out.println("The cat is eating");
        }
    }

    static class BabyCat extends Cat {
        @Override
        void run(){
            System.out.println("Baby cat cannot run");
        }
    }

    static class Dog extends Animal {
        @Override
        void run(){
            System.out.println("The dog is running");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Cat(); //Upcasting
        animal.run();
        animal.run(50);
        animal.run(60);
        Animal animal1 = new Dog();
        animal1.run();
        //extend multiple classes
        Animal animal2 = new BabyCat();
        animal2.run();
        animal2.eat();
    }

}
