package org.example;

import java.io.*;
import java.util.*;

public class Main {
    private final static String INPUT_FILENAME = "input.txt";
    private final static String OUTPUT_FILENAME = "output.txt";
    public static void main(String[] args) {
//        Utils.sum();
//        Utils.sumFromConsole();
        System.out.println(calculateAccurence());
    }

    private static Long calculateAccurence(){
        Scanner in = new Scanner(System.in);
        String jLine = in.nextLine();
        String sLine = in.nextLine();
        if(!jLine.isEmpty() && !sLine.isEmpty()) {
            String[] j = jLine.split("");
            String[] s = sLine.split("");
            return Arrays.stream(j)
                    .distinct()
                    .map(j1 -> Arrays.stream(s)
                            .filter(s1 -> Objects.equals(s1, j1))
                            .count())
                    .mapToLong(Long::longValue)
                    .sum();
        }else{
            return 0L;
        }

    }


    public class Utils{
        public static void sum(){
            List<String> result = readFile(INPUT_FILENAME);
            if(!result.isEmpty()) {
                String[] firstLineValues = result.get(0).split(" ");
                if(firstLineValues.length >= 2) {
                    int first = Integer.parseInt(firstLineValues[0]);
                    int second = Integer.parseInt(firstLineValues[1]);
                    writeToFile(first + second, OUTPUT_FILENAME);
                }
            }
        }
        public static void sumFromConsole(){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            if(!s.isEmpty()){
                String[] values = s.split(" ");
                if(values.length >= 2){
                    int first = Integer.parseInt(values[0]);
                    int second = Integer.parseInt(values[1]);
                    System.out.println(first + second);
                }
            }
        }

        private static List<String> readFile(String fileName){
            List<String> result = new ArrayList<>();
            try {
                File myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    result.add(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred." + e.getLocalizedMessage());

            }
            return result;
        }

        private static void writeToFile(int value, String fileName) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(fileName));
                writer.write(String.valueOf(value));
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred." + e.getLocalizedMessage());
            }

        }

    }


    class First{


        public void secondMethod(){

        }
    }

}