package oop.statickey;

public class StaticKey {
    static int count = 0;
    int cnt = 0;

    StaticKey(){
        count++;
        System.out.println("count = " + count);
        cnt++;
        System.out.println("cnt = " + cnt);
    }

    public static void main(String[] args) {
        StaticKey staticKey1 = new StaticKey();
        StaticKey staticKey2 = new StaticKey();
        StaticKey staticKey3 = new StaticKey();
    }
}
