package load;

import save.GameProgress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class MainLoad {

    public static void openZip(String filePath, String dirPath) throws IOException {
        ZipInputStream zin = new ZipInputStream(new FileInputStream(filePath));
        ZipEntry entry;
        String name;
        while ((entry = zin.getNextEntry()) != null) {
            name = entry.getName();
            FileOutputStream fout = new FileOutputStream(dirPath + "\\" + name);
            for (int c = zin.read(); c != -1; c = zin.read()) {
                fout.write(c);
            }
            fout.flush();
            zin.closeEntry();
            fout.close();
        }
        zin.close();
    }

    public static GameProgress openProgress(String game) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(game);
        ObjectInputStream ois = new ObjectInputStream(fis);
        GameProgress gameProgress = (GameProgress) ois.readObject();
        System.out.println(gameProgress);
        return gameProgress;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\savegames\\output.zip";
        String dirPath = "D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\savegames";
        openZip(path, dirPath);
        String game = "D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\savegames\\ex1.dat";
        openProgress(game);

    }

}
