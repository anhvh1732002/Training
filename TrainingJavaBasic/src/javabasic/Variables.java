package javabasic;

public class Variables {
    public static String staticVariable = "This is a static variable";  //Static variable
    private String instanceVariable; //Instance variable
    String localVariable = "This is a local variable"; //Local variable

    public void setInstanceVariable(String str){
        this.instanceVariable = str;
    }

    public void showInstanceVariable(){
        System.out.println(instanceVariable);
    }

    public void showLocalVariable(){
        System.out.println("Instance variable: " + localVariable);
    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.setInstanceVariable("This is a instance variable");
        variables.showInstanceVariable();

        System.out.println("Static variable: " + staticVariable);
        System.out.println("Static variable: " + Variables.staticVariable);

        System.out.print("Local variable: " );
        variables.showLocalVariable();
    }
}
