package homework_45.poem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class poem {
    public static void main(String[] args) {

        if (args.length !=2) {
            System.out.println("Wrong numbers of arguments.");
        }

           try (FileOutputStream poem1 = new FileOutputStream("lesson_45\\code\\homework_45\\compareFiles\\poem1.txt")) {

            String text = "Муха села на варенье вот и все стихотворенье!!!";
            poem1.write(text.getBytes());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try (
                FileInputStream fin = new FileInputStream(args[0]);
                FileOutputStream fout = new FileOutputStream(args[1])
        ) {
            //читать из файла пока != -1, пишем во 1-й фаил
            int a = fin.read(); //read 1st byte
            while (a != -1) {
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
