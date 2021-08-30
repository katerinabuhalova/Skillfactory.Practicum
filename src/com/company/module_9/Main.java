package com.company.module_9;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\KatyPaty\\Desktop\\sources\\module-9\\out.txt");
        char[] numberLetter = {'1', 'h', '1', 'k', '1', 'l', '1', 'd'};
        for (int i = 0; i < numberLetter.length; i++) {
            fileOutputStream.write(numberLetter[i]);
        }
        fileOutputStream.close();

        FileInputStream file = new FileInputStream("C:\\Users\\KatyPaty\\Desktop\\sources\\module-9\\out.txt");
        int i = file.read();
        while (i != -1) {
            System.out.print((char) i);
            i = file.read();
        }
        file.close();
        System.out.println();

        Writer writer = new FileWriter("C:\\Users\\KatyPaty\\Desktop\\sources\\module-9\\out.txt");
        for (int j = 0; j < numberLetter.length; j++) {
            if (numberLetter[j] == '1') {
                writer.write(numberLetter[j]);
            } else {
                writer.write('_');
            }
        }
        writer.close();

        Reader file1 = new FileReader("C:\\Users\\KatyPaty\\Desktop\\sources\\module-9\\out.txt");
        int i1 = file1.read();
        while (i1 != -1) {
            System.out.print((char) i1);
            i1 = file1.read();
        }
        file1.close();
        System.out.println();

    }
}