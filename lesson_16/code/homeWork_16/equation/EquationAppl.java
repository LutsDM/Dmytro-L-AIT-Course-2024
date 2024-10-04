package homeWork_16.equation;

import homeWork_16.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(2, -10, 4);
        equation1.displayQuadraticEquation();
        System.out.println("Delta: " + equation1.delta());
        System.out.println("Number of Roots: " + equation1.quantityRoots());
        System.out.println("-----------------------------------");

        QuadraticEquation equation2 = new QuadraticEquation(1, 2, 1);
        equation2.displayQuadraticEquation();
        System.out.println("Delta: " + equation2.delta());
        System.out.println("Number of Roots: " + equation2.quantityRoots());
        System.out.println("-----------------------------------");

        QuadraticEquation equation3 = new QuadraticEquation(-45, -81, 0);
        equation3.displayQuadraticEquation();
        System.out.println("Delta: " + equation3.delta());
        System.out.println("Number of Roots: " + equation3.quantityRoots());
        System.out.println("-----------------------------------");

    }
}
