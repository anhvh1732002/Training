package oop;

import oop.modifier.ProtectedClass;
import oop.modifier.Subject;

public class TestModifier extends ProtectedClass {
    public static void main(String[] args) {
//        //Cannot access method display because it has default access modifier
//        Subject subject = new Subject(2024, "Math");
//        subject.display();
        //Access modifier: protected
        TestModifier testModifier = new TestModifier();
        testModifier.msg();
    }
}
