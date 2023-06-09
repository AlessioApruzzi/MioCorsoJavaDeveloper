package file_explorer_ricorsivo;

import lombok.Getter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@Getter
public class Cartella {

    private Path path;
    File directoryRoot;

    Cartella() {

        path = Paths.get("Module_9", "src", "file_explorer_ricorsivo","test_folder");
        directoryRoot = new File(path.toUri());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        return toString(directoryRoot,1,str);
    }

    private String toString(File fileDir, int index, StringBuilder str) {


        File[] files = fileDir.listFiles();

        assert files != null;
        for (File file : files) {

            for (int i = 0; i < index; i++) {
                str.append("|-- ");
            }
            str.append(file.getName()).append("\n");

            if (file.isDirectory()) {
                toString(file, index+1, str);
            }
        }
        return str.toString();
    }


    public File findFile(String fileName) {
        File file = null;
        return findFile(directoryRoot,file,fileName);
    }

    private File findFile(File fileDir,File fil,String fileName) {
        File[] files = fileDir.listFiles();

        assert files != null;
        for (File file : files) {
            if (file.isDirectory()){
                fil=findFile(file,fil,fileName);
            } else if (file.getName().equals(fileName)){
                return file;
            }
        }
        return fil;
    }

    public void findFileInSubfolder() {

    }

    public void findFileInFolderWithSameExtension() {

    }

    public void findFileInFolderWithSameExtensions() {

    }

    public static void main(String[] args) {
        Cartella cartella = new Cartella();
        System.out.println(cartella.toString());

     /*   Path path = Paths.get("Module_9", "src", "file_explorer_ricorsivo","test_folder");
        File directoryRoot = new File(path.toUri());
        File[] files = directoryRoot.listFiles();
        System.out.println(Arrays.toString(directoryRoot.listFiles()));

      */
        System.out.println(cartella.findFile("file2.txt").getName());

    }

}
