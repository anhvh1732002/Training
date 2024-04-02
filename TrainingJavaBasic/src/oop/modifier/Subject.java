package oop.modifier;

public class Subject {
    int code;
    String sbjName;

    public Subject(int code, String sbjName) {
        this.code = code;
        this.sbjName = sbjName;
    }

    void display(){
        System.out.println("The code of " + sbjName + " is " + code);
    }

}
