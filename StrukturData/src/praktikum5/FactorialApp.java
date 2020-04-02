/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author HP ProBook
 */
public class FactorialApp {

    public static int triangleIter(int n) {
        int result = n;
        for (int i = n - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        }
        return n * triangleRecur(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + triangleIter(n));
        System.out.println(n + "! = " + triangleRecur(n));
    }
}
