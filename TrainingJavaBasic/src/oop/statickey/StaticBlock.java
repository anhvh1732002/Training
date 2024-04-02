package oop.statickey;

public class StaticBlock {
    static {
        System.out.println("Load this statement before start the main method");
    }

    public static void main(String[] args) {
        System.out.println("Call main method");
    }
}
