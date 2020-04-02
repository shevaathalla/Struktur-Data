/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

class QueuePrak {

    private int maxSize;
    private String[] queArray;
    private int front = 0;
    private int rear = -1;
    private int nItems = 0;

    public QueuePrak(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
    }

    public void insert(String value) {
        if (nItems < maxSize) {
            queArray[++rear] = value;
            nItems++;
            System.out.println(value + " Masuk Antrian ");
        } else if (nItems >= maxSize - 1) {
            System.out.println(value + ",Maaf antrian sudah penuh");
        }

    }

    public String remove() {
        String temp = queArray[front];
//        queArray[front]="kosong";
        front++;
        nItems--;
        return temp;
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }

    public void display() {
        int temp = this.front;
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[front++] + " ");
            if (front == maxSize) {
                front = 0;
            }
        }

        System.out.println("");
        System.out.println("");
        front = temp;
    }
}
