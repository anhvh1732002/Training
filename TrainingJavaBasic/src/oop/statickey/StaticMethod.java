package oop.statickey;

public class StaticMethod {
    int pos;
    int value;
    static String type = "Undefined";

    static void change(){
        //change static attribute
        type = "Static";
    }

    StaticMethod(int p, int v){
        pos = p;
        value = v;
    }

    void display(){
        System.out.println("pos: " + pos);
        System.out.println("value: " + value);
        System.out.println("type: " + type);
    }

    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod staticMethod1 = new StaticMethod(1, 2);
        StaticMethod staticMethod2 = new StaticMethod(2, 3);
        StaticMethod staticMethod3 = new StaticMethod(3, 5);

        staticMethod1.display();
        staticMethod2.display();
        staticMethod3.display();
    }
}
