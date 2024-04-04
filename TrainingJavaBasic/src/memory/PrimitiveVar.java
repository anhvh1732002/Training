package memory;

public class PrimitiveVar {
    static void autoPlus(int n){
        n += 1;
    }

    public static void main(String[] args) {
        //The value of a variable will be saved in an address in Heap
        int n = 5;
        //n is a Primitive variable
        //Pass the value and don't pass the address
        autoPlus(n);
        System.out.println(n); // The value of n is 5
    }
}
