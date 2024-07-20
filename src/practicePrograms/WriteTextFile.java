package practicePrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

    public static void main(String[] args) throws IOException {
        // Writing into a text file using FileWriter and BufferedWriter class methods

        FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\Files\\textWrite.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Jai Shree Ganesh");
        bw.newLine(); // Add a newline character
        bw.write("This is my code for writing into a text file");
        bw.newLine(); // Add a newline character

        System.out.println("File writing task is completed");
        bw.close(); // Close BufferedWriter, which will also close FileWriter
    }
}
