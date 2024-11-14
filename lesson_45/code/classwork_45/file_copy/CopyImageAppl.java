package classwork_45.file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//пишем утилиту для копирования файла
//имена файлов передаются в аргументах командной строки
public class CopyImageAppl {
    public static void main(String[] args) {

        //String[] args - он отвечает за получение аргумента
        //проверяем, что аргумент именно 2
        if (args.length !=2) {
            System.out.println("Wrong numbers of arguments.");
        }

        //print file names
        System.out.println("Source file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);


            //читать из файла пока != -1, пишем во 1-й фаил
            int a = fin.read(); //read 1st byte
            while (a != -1){
                fout.write(a); //пишем в файл
                a = fin.read();//читаем в фаил
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
