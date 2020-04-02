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
class SquareApp {
    

    public static void main(String[] args) {
        System.out.println(exp(2, 4));
    }

    private static int exp(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }
        return base *exp(base,exponent-1);
    }
}
