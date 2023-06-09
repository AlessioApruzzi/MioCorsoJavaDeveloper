package righe;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {


        String filePath = "Module_9/src/righe/righe1.txt";

        File newFile = new File(filePath);
        try {
            newFile.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Path path = Paths.get(filePath);
        String line2write = "Ciaooo";

        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            bw.write(line2write);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }


        String line2write1 = "Ciaoohjadlfjadfo";
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            bw.write(line2write1);
            bw.newLine();
            bw.write(line2write1);
            bw.newLine();


        } catch (IOException e) {
            e.printStackTrace();
        }


        try (Scanner sc = new Scanner(new File(filePath))) {

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            //come si salta la prima riga (es ho intestazione dei dati che non voglio stampare)


            while ((line = br.readLine()) != null)
                System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}