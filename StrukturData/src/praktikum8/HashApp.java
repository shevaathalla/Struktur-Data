/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

/**
 *
 * @author HP ProBook
 */
public class HashApp {

    public static void main(String[] args) {
        HashTable theHash = new HashTable(10);
        theHash.insert(2);
        theHash.insert(12);
        theHash.insert(22);
        theHash.insert(32);
        theHash.insert(42);
        theHash.insert(52);
        theHash.insert(62);
        theHash.displayTable();

    }

}
