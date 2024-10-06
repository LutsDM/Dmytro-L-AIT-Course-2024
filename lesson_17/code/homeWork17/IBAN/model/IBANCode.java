package homeWork17.IBAN.model;
//Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину (в Германии - 22 символа). Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:
//
//lengthCode(String code), который возвращает количество символов в счете
//controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//isValid(String code), который проверяет штрих-код на правильное количество символов

public class IBANCode {
    private String iban;

    public IBANCode(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int lengthCode(){
        return iban.length();
    }

    public int controlCode(){
        if (iban.length() < 2) {
            System.out.println("IBAN is too short to calculate control code.");
            return -1;
        }
        return iban.charAt(0) + iban.charAt(1);
    }
    public boolean isValid() {
        return iban.length() == 22;
    }

    public void displayIbanInfo() {
        System.out.println("IBAN Code: " + iban);
        System.out.println("Length: " + lengthCode());
        System.out.println("Control Code (ASCII sum of first 2 characters): " + controlCode());
        System.out.println("Is valid IBAN length (22 characters for Germany)? " + isValid());
    }

}



