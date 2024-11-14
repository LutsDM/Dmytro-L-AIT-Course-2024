package classwork_25.regex_appl;

public class RegexAppl {
    public static void main(String[] args) {

        String text = " Yava";
        String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";

        boolean checker = text.matches(pattern);
        System.out.println(checker);


        System.out.println("_____________________");

        //domain
        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);
    }




}
