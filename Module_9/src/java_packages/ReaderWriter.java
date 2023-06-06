package java_packages;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReaderWriter {


    public static void main(String[] args)  {
        String filePath = "Module_9/src/java_packages/";
        Path path = Paths.get("Module_9","src","java_packages");
        File file = new File(filePath+"mario");
        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}