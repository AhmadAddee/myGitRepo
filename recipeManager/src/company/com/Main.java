package company.com;


import java.io.*;


public class Main {
    public static void main(String[] args) {

        BufferedReader reader;
        BufferedWriter writer = null;
        String fileName = "myFile";

        try {

            writer = new BufferedWriter(new FileWriter(fileName+".txt", true));
            reader = new BufferedReader(new FileReader("myFile.txt"));


            writer.write(" 1!!!\n");
            writer.write(" 2!!!\n");
            writer.write(" 3!!!\n");
            writer.close();

            reader.lines().forEach(System.out::println);
            reader.close();

        } catch (IOException e) {
        }


//        Person p = new Person();
//        p.printBanner();
//        p.sessionLoop();
    }
}
