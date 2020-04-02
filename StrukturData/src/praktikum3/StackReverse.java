/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author HP ProBook
 */
public class StackReverse {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackReverse(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void display() {
        for (int i = 0; i < stackArray.length; i++) {
            System.out.print(stackArray[i]);
        }
    }

    public void push(char item) {
        stackArray[++top] = item;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
