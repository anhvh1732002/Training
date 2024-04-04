package memory;

public class MemoryManagement {
    //5 Memory Areas
    //Method Area
    //Heap Area
    //Stack Area
    //PC Registers
    //Native Method Stack
    public static void processString(String str) {
        // Changing the String
        str = str + " World";
        System.out.println("Inside method - str: " + str);
    }
    public static void main(String[] args) {
        //Heap use runtimes to save Objects
        //Stack will save methods, local variables and reference variable

        // Init a local variable on the stack and localVar only exists within the scope of main method
        int localVar = 10;

        //Heap Space created a new object with value: "Heap memory"
        String heapMemory = new String("Heap memory");

        //Method processString is call and the reference of heapMemory object is passed
        // => a copy of this reference is created on the stack
        // this copy is not the original one => does not change
        processString(heapMemory);

        System.out.println("After method call - strObject: " + heapMemory); // heapMemory does not change
    }
}
