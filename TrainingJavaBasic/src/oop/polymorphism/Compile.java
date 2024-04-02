package oop.polymorphism;

public class Compile {
    //Polymorphism in Compile
    static class Animal {
        void run(){
            System.out.println("Running");
        }
        //overload
        void run(int n){
            System.out.println("The animal is running with the speed " + n + " km/h");
        }
    }

    static class overloadingCalculation{
        void sum(int a, float b) {
            System.out.println(a + b);
        }

        void sum(int a, int b, int c) {
            System.out.println(a + b + c);
        }
    }

    public static void main(String[] args) {
//        Animal animal = new Animal(); //Upcasting
//        animal.run();
//        animal.run(50);
//        animal.run(60);

        overloadingCalculation overloadingCalculation = new overloadingCalculation();
        overloadingCalculation.sum(1, 2.1F);
        overloadingCalculation.sum(2,3, 4);
    }
}
