package righe2;

import lombok.Getter;
import righe.Righe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
@Getter
public class Righe2 {

    private TreeMap<String, List<String>> righe2 ;

    Righe2(){

        righe2= new TreeMap<>();

    }



    public void readFileSaveToMap(String filePath){
        try (Scanner sc = new Scanner(new File(filePath))){
            while (sc.hasNextLine()){

                String line = sc.nextLine();

                String key = line.substring(0,line.indexOf(":"));
                System.out.println(key);
                List<String> entry = new ArrayList<>();
                for (String s : line.substring(line.indexOf(":")).split(",")) {
                    entry.add(s);
                }

                System.out.println(entry.toString());
                righe2.put(key,entry);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeInverseToFile(String filePath){

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath))){

            for (Map.Entry<String, List<String>> integerStringEntry : righe2.descendingMap().entrySet()) {
                bw.write(integerStringEntry.getKey()+" "+integerStringEntry.getValue());
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void newFile(String filePath){
        File newFile = new File(filePath);

        try {
            newFile.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        Righe2 righe2 = new Righe2();
        String filePath = "Module_9/src/righe2/righe2.txt";

        righe2.readFileSaveToMap(filePath);

    }

}


