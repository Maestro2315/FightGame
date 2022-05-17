package services.fileService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

    public void TextReaderFile() throws FileNotFoundException {

        File txt = new File("C:\\Users\\Maestro\\IdeaProjects\\FightGame\\src\\main\\resources\\Rulki.txt");

        Scanner textSkanner = new Scanner(txt);
        while (textSkanner.hasNextLine()) {
            System.out.println(textSkanner.nextLine());
        }

    }

}
