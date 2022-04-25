package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static void main(String[] args) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\LENOVO\\Lab4\\gusInfoGraphic.xml")));
            System.out.println("Zawartosc pliku gusInfoGraphic.xml");
            System.out.print(contents);
        } catch (IOException e) {
            System.out.println("Blad wczytywania pliku gusInfoGraphic.xml =>" + e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}
