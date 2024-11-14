package homeWork08;
//Задача 1. Чему равно значение выражения x-- + --x при x = 5?
// Проверьте свое предположение с помощью кода.

public class PrefixPostfix {
    public static void main(String[] args) {
        int x = 5;

        int postfix = x--;
        int prefix = --x;

        int res = postfix + prefix ;
        System.out.println(res);
    }
}
