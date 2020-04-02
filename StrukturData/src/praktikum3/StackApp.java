/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

public class StackApp {

    public static void main(String[] args) {
        Stack theStack = new Stack(20);
        System.out.println(">> push someitems");
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        System.out.println("\n>> pop itemsin the stack");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value + " ");
        }
        System.out.println("");
        theStack.display();
    }
}
