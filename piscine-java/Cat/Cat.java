import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


import java.io.FileReader;

public class Cat {
    public static void cat(String[] args) throws IOException {
        //for (String file : args){
        //     String content = readFile(file);
        //     System.out.print(content);
        // }
            if (args.length == 0){
                System.out.print("");
                return;
            }
            System.out.write(Files.readAllBytes(Paths.get(args[0])));

    }
}