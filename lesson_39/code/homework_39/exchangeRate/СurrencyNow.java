package homework_39.exchangeRate;

import java.util.HashSet;
import java.util.Set;

//Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.
public enum СurrencyNow {
    USD("United States Dollar", 1.08), GBR("British Pound Sterling", 0.84), JPY("Japanese Yen", 161.60), CHF(
            "Swiss Franc",11.34), SEK("Swedish" +
            " Krona", 11.34);

    private String name;
    private Double rate;

    СurrencyNow(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Сurrency{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }

    public static boolean hasDuplicateCurrencies() { // проверяем есть ли дубликаты
        Set<String> currencyCodes = new HashSet<>();
        for (СurrencyNow currency : СurrencyNow.values()) {
             if (!currencyCodes.add(currency.name())) {
                System.out.println("Duplicate currency code found: " + currency.name());
                return true; // Дубликат найден
            }
        }
        return false; // Дубликатов нет
    }

    public static void displayCurrencies() {
        System.out.println("List of Currency: ");
        for (СurrencyNow currency : СurrencyNow.values()) {
            System.out.println(currency.name + " : " +currency.rate);
        }
    }

    public double convertToEuro(double amount) {
        return amount * rate;
    }
}
