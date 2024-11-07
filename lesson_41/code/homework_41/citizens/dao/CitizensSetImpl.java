package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensSetImpl implements homework_41.citizens.dao.Citizens {

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

    private Set<Person> idSet;
    private Set<Person> lastNameSet;
    private Set<Person> ageSet;

    public CitizensSetImpl() {
        idSet = new HashSet<>();
        lastNameSet = new HashSet<>();
        ageSet = new HashSet<>();
    }

    public CitizensSetImpl(Set<Person> citizens) {
        this();
        citizens.forEach(this::add);
    }

    // Метод добавления нового Person в множества. Сложность метода: O(log n) для поиска, O(n) для добавления в Set.
    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }

        // Поиск в Set idSet с использованием бинарного поиска
        int index = Collections.binarySearch(new ArrayList<>(idSet), person);
        if (index >= 0) {
            return false;
        }
        idSet.add(person);

        // Поиск и добавление в Set ageSet и lastNameSet с использованием аналогичного подхода
        index = Collections.binarySearch(new ArrayList<>(ageSet), person, ageComparator);
        ageSet.add(person);
        index = Collections.binarySearch(new ArrayList<>(lastNameSet), person, lastNameComparator);
        lastNameSet.add(person);
        return true;
    }

    // Метод удаления Person из множеств по id, используя метод find. Сложность метода: O(log n) для поиска, O(1) для удаления.
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idSet.remove(victim);
        ageSet.remove(victim);
        lastNameSet.remove(victim);
        return true;
    }

    // Метод поиска Person по id. Сложность метода: O(log n), так как используется бинарный поиск.
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(new ArrayList<>(idSet), pattern);
        return index < 0 ? null : new ArrayList<>(idSet).get(index);
    }

    // Метод возвращает список Person, возраст которых находится в диапазоне [minAge, maxAge]. Сложность метода: O(log n) для бинарного поиска.
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(new ArrayList<>(ageSet), pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(new ArrayList<>(ageSet), pattern, ageComparator) - 1;
        return new ArrayList<>(ageSet).subList(from, to);
    }

    // Метод возвращает список Person с одинаковыми фамилиями. Сложность метода: O(log n) для бинарного поиска.
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(new ArrayList<>(lastNameSet), pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(new ArrayList<>(lastNameSet), pattern, lastNameComparator) - 1;
        return new ArrayList<>(lastNameSet).subList(from, to);
    }

    // Метод возвращает все Person, отсортированные по id. Сложность метода: O(n), так как элементы уже отсортированы в Set.
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idSet;
    }

    // Метод возвращает все Person, отсортированные по фамилии. Сложность метода: O(n), так как элементы уже отсортированы в Set.
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameSet;
    }

    // Метод возвращает все Person, отсортированные по возрасту. Сложность метода: O(n), так как элементы уже отсортированы в Set.
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageSet;
    }

    // Метод возвращает общее количество Person. Сложность метода: O(1), так как возвращается размер Set.
    @Override
    public int size() {
        return idSet.size();
    }
}
