package file;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        //Read and write files by using Byte Stream (Read byte by byte - 8-bit)
//        try (FileInputStream fileInputStream = new FileInputStream("src/file/ListName.txt"); FileOutputStream fileOutputStream = new FileOutputStream("src/file/Output.txt")) {
//            int n;
//            while ((n = fileInputStream.read()) != -1) {
//                fileOutputStream.write(n);
//            }
//            fileInputStream.close();
//            fileOutputStream.close();
//            System.out.println("Success!");
//        }


        //Read and write files by using Character Stream(input and output for Unicode 16-bit)
//        try (FileReader fileReader = new FileReader("src/file/ListName.txt"); FileWriter fileWriter = new FileWriter("src/file/Output.txt")) {
//            int n;
//            while ((n = fileReader.read()) != -1) {
//                fileWriter.write(n);
//            }
//            fileReader.close();
//            fileWriter.close();
//            System.out.println("Success!");
//        }

        //Read and write files by using buffered stream
        //Use Wrapper for byte stream
        try {
            FileInputStream fileInputStream = new FileInputStream("src/file/ListNae.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("src/file/Output.txt");
            int n;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            while ((n = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(n);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            System.out.println("Success!");
        } catch (Exception e){
            System.out.println("Lỗi: " + e);  //Handle and customize exception
        }

        //Use Wrapper for character stream
//        try (FileReader fileReader = new FileReader("src/file/ListName.txt"); FileWriter fileWriter = new FileWriter("src/file/Output.txt")) {
//            int n;
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            while ((n = bufferedReader.read()) != -1) {
//                bufferedWriter.write(n);
//            }
//            bufferedReader.close();
//            bufferedWriter.close();
//            System.out.println("Success!");
//        }

        //Read file with Scanning
//        Scanner sc = new Scanner(new File("src/file/ListName.txt"));
//        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
//        }
    }
}
