package homework_39.exchangeRate;


import java.util.Scanner;

import static homework_39.exchangeRate.СurrencyNow.displayCurrencies;
import static homework_39.exchangeRate.СurrencyNow.hasDuplicateCurrencies;

public class CurrencyAppl {

    public static void main(String[] args) {

        // проверяем есть ли дубликаты в enume
        if (hasDuplicateCurrencies()) {
            System.out.println("There are duplicate currencies.");
        } else {
            System.out.println("No duplicate currencies found.");
        }

        displayCurrencies();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input required currency code (e.g., USD, GBR, JPY, CHF, SEK):");
        String currencyCode = scanner.nextLine();

        // Поиск валюты по коду
        СurrencyNow selectedCurrency = null;
        for (СurrencyNow currency : СurrencyNow.values()) {
            if (currency.name().equals(currencyCode)) {
                selectedCurrency = currency;

            }
        }


        System.out.println("Enter the amount in " + currencyCode + ":");
        double amount = scanner.nextDouble();

        if (selectedCurrency != null) {
            double resultInEuro = amount / selectedCurrency.getRate(); // Переводим в евро
            System.out.printf("You will get: " + resultInEuro);
        } else {
            System.out.println("Invalid currency code. Please try again.");
        }

    }
}