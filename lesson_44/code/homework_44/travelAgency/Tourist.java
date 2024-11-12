package homework_44.travelAgency;

import java.util.ArrayList;
import java.util.List;

public class Tourist {
    private String name;
    private List<String> countries;  // Список стран


    public Tourist(String name, String... countries) { //синтаксис varargs
        this.name = name;
        this.countries = List.of(countries);  // Преобразуем массив в список
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Tourist{name='" + name + "', countries=" + countries + "}";
    }

    //В Java, varargs (сокращение от "variable arguments") — это механизм,
    // который позволяет передавать методу переменное количество аргументов одного типа.
    // С помощью varargs можно не ограничивать количество аргументов при вызове метода.
    // Это особенно полезно, когда вы не знаете заранее, сколько аргументов будет передано.

}
