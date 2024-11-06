package homework_40.treeSet;

import java.util.TreeSet;

public class TreeSetMetods {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        System.out.println("TreeSet: " + numbers);

        // Метод ceiling возвращает наименьший элемент, который больше или равен заданному значению (в данном случае,
        // 20). Если в множестве numbers нет точного совпадения с 25, метод вернёт ближайшее большее значение. Если
        // же 20 присутствует в множестве, метод вернёт именно его.
        System.out.println("ceiling(20): " + numbers.ceiling(20)); // Результат: 20

        System.out.println("ceiling(25): " + numbers.ceiling(30)); // Результат: 30 наименьший, который больше 25
        System.out.println("ceiling(0): " + numbers.ceiling(0)); // Результат: 10
        System.out.println("ceiling(60): " + numbers.ceiling(60)); // Результат: null (нет элементов >= 60)

        // Метод floor возвращает наибольший элемент, который меньше или равен заданному значению (в данном случае,
        // 20). Если в множестве numbers нет точного совпадения с 20, метод вернёт ближайшее меньшее значение. Если
        // же 20 присутствует в множестве, метод вернёт именно его.
        System.out.println("floor(20): " + numbers.floor(20)); // Результат: 20

        System.out.println("floor(25): " + numbers.floor(25)); // Результат: 20 наибольший, который меньше 25
        System.out.println("floor(10): " + numbers.floor(10)); // Результат: 10
        System.out.println("floor(5): " + numbers.floor(5));   // Результат: null (нет элементов <= 5)

        // higher(e): находит элемент, который больше указанного (без включения аргумента в диапазон)
        System.out.println("higher(25): " + numbers.higher(25)); // Результат: 30
        System.out.println("higher(20): " + numbers.higher(20)); // Результат: 30 у нас есть 20, но higher его не
        // включает как ceiling
        System.out.println("higher(50): " + numbers.higher(50)); // Результат: null (нет элементов > 50)

        // lower(e): находит элемент, который меньше указанного
        System.out.println("lower(25): " + numbers.lower(25)); // Результат: 20
        System.out.println("lower(10): " + numbers.lower(10)); // Результат: null (нет элементов < 10)

        // first(): возвращает первый (наименьший) элемент
        System.out.println("first(): " + numbers.first()); // Результат: 10

        // last(): возвращает последний (наибольший) элемент
        System.out.println("last(): " + numbers.last()); // Результат: 50

        // pollFirst(): удаляет и возвращает первый элемент
        System.out.println("pollFirst(): " + numbers.pollFirst()); // Результат: 10
        System.out.println("TreeSet после pollFirst(): " + numbers); // Оставшиеся элементы

        // pollLast(): удаляет и возвращает последний элемент
        System.out.println("pollLast(): " + numbers.pollLast()); // Результат: 50
        System.out.println("TreeSet после pollLast(): " + numbers); // Оставшиеся элементы

        // subSet(fromElement, toElement): возвращает подмножество от fromElement (включительно) до toElement (не включительно)
        System.out.println("subSet(20, 40): " + numbers.subSet(20, 40)); // Результат: [20, 30]

        // subSet(fromElement, inclusive, toElement, inclusive): подмножество с указанием границ включительно
        System.out.println("subSet(20, true, 40, true): " + numbers.subSet(20, true, 40, true)); // Результат: [20, 30, 40]
    }
}