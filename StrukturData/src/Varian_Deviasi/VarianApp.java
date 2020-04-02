/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varian_Deviasi;

/**
 *
 * @author HP ProBook
 */
public class VarianApp {

    public static void main(String[] args) {
        Hitung hit = new Hitung();
        double[] arr = {172, 167, 180, 170, 169, 160, 175, 165, 173, 170};
        double n = arr.length;

        for (int i = 0; i < n; i++) {
            hit.Sigma1(arr[i]);
            hit.Sigma2(arr[i]);
        }
        System.out.println("n = "+n);
        System.out.println("Sigma 1 (" + hit.getSigma2()+")");
        System.out.println("Sigma 2 (" + hit.kuadrat(hit.getSigma1())+")");
        double x = n * (hit.getSigma2()) - hit.kuadrat(hit.getSigma1());
        double y = n*(n-1);
        double z = x/y;
        System.out.println("Hasil Varian    = "+z);
        System.out.println("Hasil Deviasi   = "+Math.sqrt(z));
    }
}
