package homeWork08;
// Напечатайте на экране шахматную доску размером 8х8.
// 0 - белая клеточка, 1 - черная. Левая верхняя клеточка должна быть 0, левая нижняя - 1.
public class Chessboard {
    public static void main(String[] args) {
    int horizontal = 8;
    int vertical = 8;
    int countV = 0;
    int countH = 0;
    int _1stSquare = 0;

    while (countV < vertical) {

        countH = 0; // сброс счетчика

        while (countH < horizontal){

            if (_1stSquare % 2 == 0){
                System.out.print(0 + " "); //печатаем белую
                _1stSquare = 1; // меняем следующую клетку на черную
            } else {
                System.out.print(1 + " ");//печатаем черную
                _1stSquare = 0;// меняем следующую клетку на черную
            }

            countH++;
        }
        System.out.println(); // вставляем строку после завершения горизонтали
        _1stSquare = 1 - _1stSquare; // меняем начальную клетку для следующей строки

        countV++;
    }
    }
}
