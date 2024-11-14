package classwork_05;

public class ConditionsEx02 {
    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        int res = 0;

        if (a == b){
           res = (a + b)*5;
        }
        else {
            res = (a - b)*5;
        }

        System.out.println(res);
    }// end of main
}// end of class
