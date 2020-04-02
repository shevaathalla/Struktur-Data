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
public class MergeSortApp {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(10);
        arrays.insert(22);
        arrays.insert(11);
        arrays.insert(33);
        arrays.insert(55);
        arrays.insert(44);
        arrays.insert(77);
        arrays.insert(66);
        arrays.insert(88);
        arrays.insert(99);
        arrays.insert(100);
        arrays.display();
        arrays.mergeSort();
        arrays.display();
    }
    
}
