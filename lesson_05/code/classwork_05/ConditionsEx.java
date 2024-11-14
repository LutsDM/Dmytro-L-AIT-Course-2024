package classwork_05;
/*Проверка положительное или отрицательное число.
Проверка четное или нечетное целое число.
Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".
*/
public class ConditionsEx {
    public static void main(String[] args) {

        // не полный условный оператор
        int x = -66;

        if(x > 0){
            System.out.println("x = " + x + " is positive number");
        }
        if(x < 0){
            System.out.println("x = " + x + " is negativ number");
        }

        //полный условный оператор
        x = 258;

        if (x > 0){
            System.out.println("x = " + x + " is positive number");
        }
        else {
            System.out.println("x = " + x + " is negativ number");
        }

        //четное или не четное
        x = 211;

        if(x%2 == 0){
            System.out.println("a = " + x + " is even");
        }
        else {
            System.out.println("a = " + x + " is odd");
        }

        //проверка совершеннолетия
        x = 18;

        if (x < 18) {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }
        else
            System.out.println("Вам разрешено действовать самостоятельно");

        //
    }// end of main
}// end of class
