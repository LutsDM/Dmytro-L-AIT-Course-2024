package homeWork17.Cube;

import homeWork17.Cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(6);
        cube1.sumOfTheLengths();
        cube1.sumOfTheAreas();
        cube1.volumeOfACube();
        cube1.displayPSVCube();

        System.out.println("____________________________________");

        Cube cube2 = new Cube(4.25);
        cube2.sumOfTheLengths();
        cube2.sumOfTheAreas();
        cube2.volumeOfACube();
        cube2.displayPSVCube();


    }
}
