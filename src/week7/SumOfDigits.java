package week7;

import java.io.*;

/**
 * Created by jennie on 12-2-2016.
 */
public class SumOfDigits {

    public static void main(String[] args) throws IOException{

        String filename = "Opdracht1.txt";
        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        line = reader.readLine();
        int sum = 0;

        while(line != null){
            int x = Integer.parseInt(line);
            while(x>0) {
                sum += x % 10;
                x = x / 10;
            }

            System.out.println(sum);
            sum = 0;
            line = reader.readLine();

        }








    }
}
