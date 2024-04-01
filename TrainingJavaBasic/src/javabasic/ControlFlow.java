package javabasic;

public class ControlFlow {
    public static void testIfElse(int k){
        if(k <= 0){
            System.out.println(k + " là số âm");
        } else if (k % 2 == 0) {
            System.out.println(k + " là số chẵn");
        } else {
            System.out.println(k + " là số lẻ");
        }
    }

    public static void testSwitchCase(int k){
        switch (k){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Không nằm trong {1, 2, 3}");
        }
    }

    public static void main(String[] args) {
        ControlFlow.testIfElse(2024);
        ControlFlow.testSwitchCase(2024);
    }
}
