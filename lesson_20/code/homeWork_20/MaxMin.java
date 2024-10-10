package homeWork_20;
//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class MaxMin {
    public static void main(String[] args) {

        //// Массив типов данных, которые мы проверяем
        String[] type = {"byte", "short", "char", "int", "long", "float", "double" };


        for (int i = 0; i < type.length; i++) {  //Внешний цикл проходит по каждому элементу массива type.
            boolean found = false; // Переменная для отслеживания, найден ли элемент в массиве args

            for (int j = 0; j < args.length; j++) {   // Внутренний цикл проверяет, есть ли текущий элемент type[i] в массиве args
                if (type[i].equals(args[j])) { // Если элемент найден
                    found = true; // Устанавливаем флаг, что элемент найден
                    break; // Прерываем внутренний цикл, т.к. больше искать не нужно
                }
            }
            if (!found) { // Если элемент не найден
                switch (type[i]) {
                    case "byte":
                        System.out.println("Минимальное значение byte: " + Byte.MIN_VALUE);
                        System.out.println("Максимальное значение byte: " + Byte.MAX_VALUE);
                        break;
                    case "short":
                        System.out.println("Минимальное значение short: " + Short.MIN_VALUE);
                        System.out.println("Максимальное значение short: " + Short.MAX_VALUE);
                        break;
                    case "char":
                        System.out.println("Минимальное значение char: " + (int) Character.MIN_VALUE);
                        System.out.println("Максимальное значение char: " + (int) Character.MAX_VALUE);
                        break;
                    case "int":
                        System.out.println("Минимальное значение int: " + Integer.MIN_VALUE);
                        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
                        break;
                    case "long":
                        System.out.println("Минимальное значение long: " + Long.MIN_VALUE);
                        System.out.println("Максимальное значение long: " + Long.MAX_VALUE);
                        break;
                    case "float":
                        System.out.println("Минимальное значение float: " + Float.MIN_VALUE);
                        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);
                        break;
                    case "double":
                        System.out.println("Минимальное значение double: " + Double.MIN_VALUE);
                        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);
                        break;

                }
            }
        }
        // Дополнительная проверка на элементы массива args, которые не соответствуют типам в type
        for (int j = 0; j < args.length; j++) {
            boolean valid = false;  // Флаг для проверки соответствия типам из type

            // Проверка, есть ли элемент args[j] в массиве type
            for (int i = 0; i < type.length; i++) {
                if (args[j].equals(type[i])) {
                    valid = true;  // Если найден, устанавливаем флаг в true
                    break;  // Прерываем цикл, если нашли соответствие
                }
            }

            // Если элемент args[j] не найден в массиве type, выводим сообщение об ошибке
            if (!valid) {
                System.out.println("Аргумент " + args[j] + " неверный тип");
            }
        }
    }
}