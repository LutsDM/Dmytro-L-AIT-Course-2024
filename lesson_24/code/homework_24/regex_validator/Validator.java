package homework_24.regex_validator;

//a) Credit card number (8-16 digits)
//b) Date (Format: DD.MM.YYYY)
//c) Date (Format: YYYY-MM-DD)
//d) Phone Number (Format: +99(99)9999-9999)
//e) Number less and equals 255 (positive)
public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str){
        return str.matches("^\\d{8,16}$");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
        return str.matches ("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){
        return str.matches ("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$");
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str){
        return str.matches ("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        return str.matches ("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }

}
