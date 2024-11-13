package homework_45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {

        if (args.length !=2) {
            System.out.println("Wrong numbers of arguments.");
        }

        boolean areFilesIdentical = compareFiles(args[0],args[1]);

        System.out.println("The files are equal: " + areFilesIdentical);

    }

    private static boolean compareFiles(String file1, String file2) {
        try (
                FileInputStream fis1 = new FileInputStream(file1);
                FileInputStream fis2 = new FileInputStream(file2)
        ) {
            int byte1;
            int byte2;

            // Читаем и сравниваем каждый байт файлов, пока они не закончились
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) { //пока в обоих файлах нечего будет
                // читать
                if (byte1 != byte2) {
                    return false;  // Файлы не совпадают
                }
            }

            // Проверяем, что оба файла достигли конца
            return fis1.read() == -1 && fis2.read() == -1;

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        } catch (IOException e) {
            throw new RuntimeException("IO exception occurred", e);
        }
    }
}
