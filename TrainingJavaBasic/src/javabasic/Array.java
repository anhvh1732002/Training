package javabasic;

public class Array {
    public static void main(String[] args) {
        //init and get the specific element
        String[] singleDA = {"one" , "two", "three" , "four"};
        System.out.println("Phần tử đầu tiên là '" + singleDA[0] + "' và phần tử cuối cùng là '" + singleDA[singleDA.length-1] + "'");
        //change the value of an element
        singleDA[2] = "change";
        System.out.println(singleDA[2]);
        //get all element : use for or foreach
        for (String s : singleDA) {
            System.out.println(s);
        }
        //copy array
        String[] copyFrom = {"abc", "copy", "from", "here"};
        String[] copyTo = new String[copyFrom.length];
        System.arraycopy(copyFrom, 1, copyTo, 0, 3);
        for (String s : copyTo) {
            System.out.println(s);
        }

          //init multi dimensional arrays
        int[][] a = { { 1, 3, 4 }, { 3, 4, 5 } };
        int[][] b = { { 1, 3, 4 }, { 3, 4, 5 } };
        int[][] res = new int[2][3];
         //matrix addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
