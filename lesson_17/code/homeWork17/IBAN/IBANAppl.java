package homeWork17.IBAN;

import homeWork17.IBAN.model.IBANCode;

public class IBANAppl {
    public static void main(String[] args) {
        IBANCode IBAN1 = new IBANCode("DE89370400440532013000");
        IBAN1.displayIbanInfo();

        System.out.println("________________________________________");

        IBANCode IBAN2 = new IBANCode("FR23470400440532013873663");
        IBAN2.displayIbanInfo();

    }

}
