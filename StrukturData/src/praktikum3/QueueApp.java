/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

public class QueueApp {

    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);
        theQueue.display();
        theQueue.remove();
        theQueue.display();
        theQueue.insert(60);
        theQueue.display();
        theQueue.insert(70);
        theQueue.display();
        
//        while (!theQueue.isEmpty()) {
//            long n = theQueue.remove();
//            System.out.print(n);
//            System.out.print(" ");
//        }
        System.out.println("");
    }
}
