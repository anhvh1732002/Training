package file;

public class HandleUncheckedException extends RuntimeException{
    HandleUncheckedException(String s){
        super(s);
    }

    static void checkPositiveNumber(int s) throws HandleUncheckedException{
        if(s < 0){
            throw new HandleUncheckedException(s + " is not a positive number");
        } else {
            System.out.println(s + " is a positive number");
        }
    }

    public static void main(String[] args) {
        int n = -1;
        checkPositiveNumber(n);
    }
}
