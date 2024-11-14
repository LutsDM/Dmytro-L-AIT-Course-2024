package classWork06;
//**Задание 1.**
//  Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
//  Определите в какую четверть попадает точка с этими координатами.
public class CoordinateXY {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;
        if(x >= 0 & y >= 0){
            System.out.println("Координата в четверти 1");
        }
        if(x <= 0 & y >= 0){
            System.out.println("Координата в четверти 2");
        }
        if (x >= 0 & y <= 0){
            System.out.println("Координата в четверти 4");
        }
        if (x <= 0 & y <= 0) {
            System.out.println("Координата в четверти 3");
        }

    }//end of main
}//end of class
