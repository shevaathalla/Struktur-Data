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
public class HanoiTower {
    static int urutan = 1;
    public static void main(String[] args) {
        tower(4, 'A', 'C', 'B');
    }

    public static void tower(int disk, char first, char last, char mid) {
        
        if (disk == 1) {
            System.out.println((urutan++)+". Pindahkan disk " + disk + " dari tower " + first + " ke tower " + last);
            return;
        }
        tower(disk - 1, first, mid, last);
        System.out.println((urutan++)+". Pindahkan disk " + disk + " dari tower " + first + " ke tower " + last);
        tower(disk - 1, mid,last, first);
    }
}
