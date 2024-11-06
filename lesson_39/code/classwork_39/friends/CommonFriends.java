package classwork_39.friends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static java.util.Arrays.asList;

//- Поиск общих друзей у двух пользователей соц.сети.
//  В социальной сети у каждого пользователя есть список друзей. Напишите программу, которая определяет общих друзей для двух заданных пользователей.
//  Пример:
//  Список друзей пользователя A: ["Иван", "Мария", "Анна", "Петр"]
//  Список друзей пользователя B: ["Анна", "Елена", "Петр", "Дмитрий"]
//  Выход: ["Анна", "Петр"]
public class CommonFriends {
    public static void main(String[] args) {

        List<String> friendsA = Arrays.asList("Иван", "Мария", "Анна", "Петр");
        List<String> friendsB = Arrays.asList("Анна", "Елена", "Петр", "Дмитрий"); //

        System.out.println("Common friends: " + findCommonFriends(friendsA, friendsB));

    }

    private static List<String> findCommonFriends(List<String> friendsA, List<String> friendsB) {
        HashSet<String> setA = new HashSet<>(friendsA);
        HashSet<String> setB = new HashSet<>(friendsA);

        List<String> commonFriends = new ArrayList<>();

        // обойдем setA и по ходу будем сравнивать элементы со списком friends
        for (String f : friendsB) {
            if (setA.contains(f)){
                commonFriends.add(f);
            }
        }

        // а если их нет
        if(commonFriends.isEmpty()){
            System.out.println("Common friends is empty!");
            return null;
        }

        return commonFriends;

    }
}
