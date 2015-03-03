package edu.eetac.dsa.rgonzalez.ej4_excepcion2;

import java.io.File;
import java.io.IOException;


public class AppIoBinary {
    public static void main(String[] args) throws IOException {
        BinaryIOClass testWrite = new BinaryIOClass(6, 17.5, 'h');
        testWrite.saveToFile("test-io-binary");

        BinaryIOClass testRead = BinaryIOClass.readFromFile("/Users/raulgonzalezsanjuan/Documents/enteros.txt");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        File file = new File("test-io-binary");
        file.delete();
    }
}
