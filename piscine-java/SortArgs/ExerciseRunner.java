import java.io.*;
import java.util.*;


public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println("test one");
         SortArgs.sort(new String[]{"4", "2", "1", "3"});
        // String[] result = SortArgs.sort(new String[]{"4", "2", "1", "3"});
        // System.out.println(Arrays.toString(result));
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        var defaultOut = System.out;


        System.setOut(printStream);
        SortArgs.sort(new String[]{"4", "2", "1", "3"});



        System.setOut(defaultOut);

        String output = outputStream.toString();

        System.out.println("Output ==>  " + output);
        
        System.out.println(output.equals("1 2 3 4\n"));
    }
}
