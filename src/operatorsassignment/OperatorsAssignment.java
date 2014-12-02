/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsassignment;

/**
 *
 * @author sofyashipova
 */
public class OperatorsAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        incrementAndModulus();
        compoundAssignmentTest();
        toggleValueTest();
    }

    private static void incrementAndModulus() {

        int i = 10;
        int n = i++ % 5;
        System.out.println("n = " + n); //m = 0
        System.out.println("i = " + i); //i = 10

        i = 10;
        int m = ++i % 5;
        System.out.println("m = " + m); //m = 1
        System.out.println("i = " + i); //i = 10

        //Yeah :3
        //However, I can see that first one is 0 because remainder of 10/5 is 0, and nothing is added to 0.
        //The second one is 1, though, as increment is added before calculation, and remainder of 11/5 is rounded to 1.
    }

    public static void compoundAssignmentTest() {

        int result = 1 + 2; // result is now 3

        System.out.println(result);

        result -= 1; // result is now 2

        System.out.println(result);

        result *= 2; // result is now 4

        System.out.println(result);

        result /= 2; // result is now 2

        System.out.println(result);

        result += 8; // result is now 10

        System.out.println(result);

        result %= 7; // result is now 3

        System.out.println(result);

    }

    public static boolean toggleValue(boolean value) {
        return !value;

    }

    public static void toggleValueTest() {
        boolean bValue = false;
        System.out.println(bValue);

        bValue = toggleValue(bValue);
        System.out.println(bValue);

        bValue = toggleValue(bValue);
        System.out.println(bValue);

    }
}
