package week7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jennie on 12-2-2016.
 */
public class SumOfAllDigits {

    public static void main(String[] args) throws IOException {

        String filename = "Opdracht2.txt";
        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        line = reader.readLine();
        int sum = 0;

        while (line != null) {
            int x = Integer.parseInt(line);
            sum += x;
            line = reader.readLine();

        }

        System.out.println(sum);


    }
}
