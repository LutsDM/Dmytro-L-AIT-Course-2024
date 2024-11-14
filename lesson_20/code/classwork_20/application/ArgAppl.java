package classwork_20.application;

public class ArgAppl {
    public static void main(String[] args) {

        // метод main получает аргументы
        // String[] args - это массив данных типа String, args - это ИМЯ массива

        String str1 = args[0];
        int n1 = Integer.parseInt(str1);

        String str2 = args[1];
        int n2 = Integer.parseInt(str2);

        System.out.println(str1 + " * " + str2 + " = " + n1 * n2);


    }

}
