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
public class Fibbonaci {

    public static int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
            System.out.println("ditambah "+i);
        }
        return result;
    }

    public static int triangleRecur(int n) {
        if (n == 1) {
            System.out.println("ditambah "+n);
            return 1;
        }
        System.out.println("ditambah "+n);
        return n + triangleRecur(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Menggunakan rekursi " + triangleRecur(n));
        System.out.println("Menggunakan rekursi " + triangleIter(n));
    }
}
