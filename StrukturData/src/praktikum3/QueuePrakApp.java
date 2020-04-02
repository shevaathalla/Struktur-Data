/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.util.Scanner;

/**
 *
 * @author HP ProBook
 */
public class QueuePrakApp {

    public static void main(String[] args) {
        QueuePrak theQueue = new QueuePrak(5);
        System.out.println("Beberapa mulai mengantri :");
        theQueue.insert("Sheva");
        theQueue.insert("Rudi");
        theQueue.insert("Andre");
        theQueue.insert("Bejo");
        theQueue.insert("Pace");
        theQueue.insert("Pintu");
        theQueue.insert("Meja");
        System.out.println(">> isi Antrian");
        theQueue.display();
        System.out.println(">> satu per satu keluar");
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        
        System.out.println("Jumlah orang yang ada di antrian "+theQueue.size()+" person");
        
    }

}
