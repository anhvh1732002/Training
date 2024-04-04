package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadCSV {
    public static void main(String[] args) throws IOException {

        //Use stream API to read a large csv file
        String filePath = "src/file/output.csv";
        long start = System.currentTimeMillis();
            Files.lines(Paths.get(filePath)).forEach(System.out::println);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        //Read file line by line
        long start1 = System.currentTimeMillis();
        File file = new File(filePath);
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] columns = line.split(",");
            for (String column : columns) {
                System.out.println(column);
            }
        }
        bufferedReader.close();
        reader.close();
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
