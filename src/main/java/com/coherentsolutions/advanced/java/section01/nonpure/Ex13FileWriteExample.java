package com.coherentsolutions.advanced.java.section01.nonpure;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Ex13FileWriteExample demonstrates a non-pure function that interacts with external systems.
 * The function writes data to a file, which is considered a side effect.
 */
public class Ex13FileWriteExample {

    /**
     * Writes the given data to a file, causing side effects such as modifying the file system.
     *
     * @param filename The name of the file to be written to.
     * @param data     The data to write into the file.
     * @throws IOException If an I/O error occurs while writing the file.
     */
    public static void writeFile(String filename, String data) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(data); // Side effect: Writing to a file
        writer.close(); // Another side effect
    }

    public static void main(String[] args) throws IOException {
        writeFile("output.txt", "This is a side effect!"); // Writing to a file
        System.out.println("File written successfully!");  // Side effect: Console output
    }
}
