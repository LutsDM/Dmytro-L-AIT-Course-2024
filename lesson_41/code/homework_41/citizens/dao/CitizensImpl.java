package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements homework_41.citizens.dao.Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }
    //Таким образом конструктор создает три списка содержащие одинаковые объекты с полными данными, но порядок этих
    // объектов отличаются в зависимости от критерия сортировки (idList - по id, lastNameList - по фамилии, ageList -
    // по возрасту.


    // Метод добавления нового Person в списки. Сложность метода логарифмическая O(log n). Возвращает true/false
    @Override
    public boolean add(Person person) {
        // проверка того, чтобы в качестве нового Person не передается пустое значение (null)
        if (person == null) {
            return false;
        }
        // проверка того, что в нашей БД в списке отсортированном по id еще нет добавляемого Person. Во избежания
        // дублирования во всех списках.
        int index = Collections.binarySearch(idList, person); // при помощи метода бинарного поиска интерфейса
        //Collections происходит поиск индекса добавляемого Person.  Сложность бинарного поиска
        // логарифмическая.
        if (index >= 0) { // если index >= 0? , значит бинарный поиск нашел id добавляемый person и выдал
            // его индекс/позицию. Следовательно, добавляемый Person уже есть и добавлять его нельзя.
            return false;
        }
        index = -index - 1; // если выхода из метода не произошло, то переназначаем index таким образом, чтобы он
        // указывал место/позицию(индекс) куда нужно разместить добавляемый Person в списке отсортированном по id
        idList.add(index, person); // добавляем нового Person на определенное выше место/позицию в список
        // отсортированный по id
        // Схожим образом определяется место/позиция нового Person в списках отсортированных по
        // фамилии и возрасту
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true; // Возвращаем true, если добавление прошло успешно
    }

    // Метод удаления Person из списков по id используя внутренний метод find. Сложность метода продиктована методом
    // find и является логарифмической. Возвращает true/false
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // Метод поиска Person по id. Логарифмическая сложность. Возвращает найденный Person или null если искомого не
    // обнаруженною. Логорифмическая сложность
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // Метод возвращает список Person, возраст которых находится в заданном диапазоне [minAge, maxAge] включительно.
    // Логарифмическая сложность поиска O(log n) за счет бинарного поиска
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // Метод возвращает список Person, с одинаковыми фамилиями.
    // Логарифмическая сложность поиска O(log n) за счет бинарного поиска
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // Метод возвращает все Person, отсортированные по id. Так как список уже отсортирован, то сложности как таковой нет
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // Метод возвращает все Person, отсортированные по фамилии. Так как список уже отсортирован, то сложности как
    // таковой нет
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // Метод возвращает все Person, отсортированные по возрасту. Так как список уже отсортирован, то сложности как
    // таковой нет
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // Метод возвращает общее количество Person
    @Override
    public int size() {
        return idList.size();
    }
}
