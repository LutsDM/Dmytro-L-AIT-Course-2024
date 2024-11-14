package classWork_19.compare_string;
//равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {

        int x = 5; // стек
        int y = 5; // стек

        boolean checker = (x == y);
        System.out.println(checker); // true

        String str1 = "Europe"; // str1 - стек =>(ссылка) Europe - heap
        String str2 = "Europe"; // str1 - стек =>(ссылка) Europe - heap

        System.out.println("-----------------------------------------");

        checker = (str1 == str2);
        System.out.println(checker);

        System.out.println("-----------------------------------------");

        String str3 = new String("Europe");
        checker = (str1 == str3);
        System.out.println(checker); // равенства не происходит так как таким образом мы создаем новую ссылку и
        // сравнения просиходит в том числе и ссылки

        System.out.println("------------------------------------------");
        checker = str1.equals(str3);
        System.out.println(checker);

    }
}
