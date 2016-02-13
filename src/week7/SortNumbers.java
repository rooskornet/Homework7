package week7;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jennie on 12-2-2016.
 */
public class SortNumbers {

    public static void main(String[] args) throws IOException {

        String filename = "Opdracht3.txt";
        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Output2.txt"));
        ArrayList list = new ArrayList();

        line = reader.readLine();

        while(line != null){
            String[] numbers = line.split("\\s");


            for(String a : numbers){
                list.add(Double.parseDouble(a));
            }

            sortList(list);

            for(Object o : list ){

                writer.write(o.toString() + " ");
            }
            writer.write("\n");
            line = reader.readLine();
            list.clear();


        }
        writer.flush();
        writer.close();
        reader.close();


    }

    public static void sortList(ArrayList list) {
        for (int i = 0; i < list.size() - 1; i++) {

            for (int a = i + 1; a < list.size(); a++) {

                if (compare(list.get(i), list.get(a))) {
                    Object temporary = list.get(a);
                    list.set(a, list.get(i));
                    list.set(i, temporary);                }
            }
        }
    }

    public static boolean compare(Object a, Object b){
        double first = (double) a;
        double second = (double) b;

        if(first > second){
            return true;
        }
        else return false;


    }

}
