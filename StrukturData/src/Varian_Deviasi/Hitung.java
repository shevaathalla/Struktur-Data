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
public class Hitung {

    double sigma1, sigma2;

    public void Sigma1(double n) {
        this.sigma1 += n;
    }

    public double kuadrat(double a) {
        double kuadrat;
        kuadrat = a * a;
        return kuadrat;
    }

    public void Sigma2(double n) {
        double x = n * n;
        this.sigma2 += x;
    }

    public double getSigma1() {
        return sigma1;
    }

    public double getSigma2() {
        return sigma2;
    }
}
