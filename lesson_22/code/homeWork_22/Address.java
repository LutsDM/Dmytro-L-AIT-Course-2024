package homeWork_22;

//Задача 3.(*) Создать класс Address, проверить:
//
//город с большой буквы
//индекс содержит 5 цифр
//предложите еще тесты
public class Address {

    String street;
    String houseNumber;
    int index;
    String city;
    String country;

    public Address(String street, String houseNumber, int index, String city, String country) {
        setStreet(street);
        setHouseNumber(houseNumber);
        setIndex(index);
        setCity(city);
        setCountry(country);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (isStreetValid(street)) {
            this.street = street;
        } else {
            System.out.println(street + " Street is NOT valid.");
        }

    }

    //Валидация для улицы
    private boolean isStreetValid(String street) {
        if (street.length() < 3 || street.length() > 20) {
            return false;
        }
        if (!Character.isUpperCase(street.charAt(0)) && !Character.isDigit(street.charAt(0))) {
            return false; //Возвращает если начинается не с заглавной буквы или числа.
        }
        for (int i = 0; i < street.length(); i++) {
            char c = street.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '.' || Character.isSpaceChar(c))) {
                return false;  // Возвращаем false, если символ не буква, не цифра, не дефис и не точка
            }
        }
        return true;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        if (isHouseNumberValid(houseNumber)) {
            this.houseNumber = houseNumber;
        } else {
            System.out.println(houseNumber + " House Number is NOT valid.");
        }

    }

    //Валидация для номера дома
    private boolean isHouseNumberValid(String houseNumber) {
        if (houseNumber.length() > 4) {
            return false;
        }
        for (int i = 0; i < houseNumber.length(); i++) {
            char c = houseNumber.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '.' || c == '/')) {
                return false;
            }
        }
        return true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if (isIndexValid(index)) {
            this.index = index;
        } else {
            System.out.println(index + " Index is NOT valid.");
        }
    }

    //Валидация для индекса
    private boolean isIndexValid(int index) {
        if (!(index >= 10000 && index <= 99999)) {
            return false;
        } else {
            return true;
        }
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        if (isCityValid(city)) {
            this.city = city;
        } else {
            System.out.println(city + " City is NOT valid.");
        }
    }

    //Валидация на город
    private boolean isCityValid(String city) {
        if (city.length() < 2 || city.length() > 20) {
            return false;
        }
        if (!Character.isUpperCase(city.charAt(0))) {
            return false;
        }
        for (int i = 0; i < city.length(); i++) {
            char c = city.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isSpaceChar(c))) {
                return false;
            }
        }
        return true;

    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (isCountryValid(country)) {
            this.country = country;
        } else {
            System.out.println(country + " Country is NOT valid.");
        }

    }

    //Валидация на страну
    private boolean isCountryValid(String country) {
        if (country.length() < 3 || country.length() > 32) {
            return false;
        }
        if (!(Character.isUpperCase(country.charAt(0)))) {
            return false;
        }
        for (int i = 0; i < country.length(); i++) {
            char c = country.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isSpaceChar(c))) {
                return false;
            }
        }
        return true;
    }
}


