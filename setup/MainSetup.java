package setup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainSetup {
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {
        File src = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\src");
        log.append(src.mkdir()).append("\r\n");
        File res = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\res");
        log.append(res.mkdir()).append("\r\n");
        File saveGames = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\savegames");
        log.append(saveGames.mkdir()).append("\r\n");
        File temp = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\temp");
        log.append(temp.mkdir()).append("\r\n");

        File mainDir = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\src\\main");
        log.append(mainDir.mkdir()).append("\r\n");
        File test = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\src\\test");
        log.append(test.mkdir()).append("\r\n");
        File mainJava = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\src\\main\\MainSetup.java");
        try {
            log.append(mainJava.createNewFile()).append("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File utilsJava = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\src\\main\\Utils.java");
        try {
            log.append(utilsJava.createNewFile()).append("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\res\\drawables");
        log.append(drawables.mkdir()).append("\r\n");
        File vectors = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\res\\vectors");
        log.append(vectors.mkdir()).append("\r\n");
        File icons = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\res\\icons");
        log.append(icons.mkdir()).append("\r\n");

        File tempTxt = new File("D:\\JavaProjects\\FilesNetology\\src\\setup\\Games\\temp\\temp.txt");
        try {
            log.append(tempTxt.createNewFile()).append("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter toTemp = new FileWriter(tempTxt, false);
            toTemp.write(String.valueOf(log));
            toTemp.flush();
            toTemp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
