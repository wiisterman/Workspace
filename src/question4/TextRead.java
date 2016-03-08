package question4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TextRead  
{
    private static ArrayList<String> timesArray = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            File file = new File("DJIA.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split("\t");
                String[] times = tokens;
                for (String time : times)
                    timesArray.add(time);
            }
            System.out.println(timesArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}