package righe;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

@Getter
public class Righe {

    private TreeMap<Integer,String> righe ;

    Righe(){

        righe= new TreeMap<>();

    }



    public void readFileSaveToMap(String filePath){
        try (Scanner sc = new Scanner(new File(filePath))){
            while (sc.hasNextLine()){

                String line = sc.nextLine();

                int index = Integer.parseInt(line.substring(0,line.indexOf(" ")));
                String words = line.substring(line.indexOf(" ")+1);
                righe.put(index,words);

            }
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
    }

    public void writeInverseToFile(String filePath){

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath))){


            for (Map.Entry<Integer, String> integerStringEntry : righe.descendingMap().entrySet()) {
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


        Righe righe = new Righe();
        String filePath = "Module_9/src/righe/righe.txt";
        String filePathInv = "Module_9/src/righe/righeinverse.txt";


        righe.readFileSaveToMap(filePath);

        righe.newFile(filePathInv);
        righe.writeInverseToFile(filePathInv);



       // System.out.println(righe);




    }

}
