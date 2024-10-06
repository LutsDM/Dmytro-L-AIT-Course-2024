package homeWork17.Cube.model;
//Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double sumOfTheLengths () {
       double p = 12 * a;
       return p;
    }

    public double sumOfTheAreas () {
        double s = 6 * a * a;
        return s;
    }

    public double volumeOfACube () {
        double v = a * a * a;
        return v;
    }

    public void displayPSVCube () {
        double p = sumOfTheLengths();
        double s = sumOfTheAreas();
        double v = volumeOfACube();

        System.out.printf("A cube with side length %.2f has:\n", a);
        System.out.printf("The sum of the edge lengths: %.2f\n", p);
        System.out.printf("The sum of the areas of all faces: %.2f\n", s);
        System.out.printf("The volume of the cube: %.2f\n", v);
    }
}


