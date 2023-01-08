package mainPkg;

import arithmatics.QuadEquation;

public class MainClass {
    public static void main(String[] args) {
        QuadEquation quadEquationSolver =new QuadEquation();

        Double [] Roots = quadEquationSolver.apply(1,1,2);
        if (Roots ==null)
        {
            System.out.println("Roots are not real.");
        }
        else
        {
            for (int i = 0; i < Roots.length; i++) {
                System.out.println("Root "+i+"= "+ Roots[i]);
            }
        }
    }
}
