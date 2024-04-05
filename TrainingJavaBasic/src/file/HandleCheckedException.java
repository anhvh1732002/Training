package file;

public class HandleCheckedException extends Exception{
    HandleCheckedException(String s){
        super(s);
    }

    static void checkPositiveNumber(int s) throws HandleCheckedException{
        if(s < 0){
            throw new HandleCheckedException(s + " is not a positive number");
        } else {
            System.out.println(s + " is a positive number");
        }
    }

    public static void main(String[] args) {
        int n = -1;
        try {
            checkPositiveNumber(n);
        } catch (HandleCheckedException e){
            System.out.println("Error: " + e);
        }
    }
}
