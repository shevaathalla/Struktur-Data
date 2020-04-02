/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata;

import java.util.Arrays;

class HighArray {

    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < nElemen - 1; i++) {
            if (arr[i] > value) {
                break;
            }

        }
        for (int j = nElemen - 2; j >= i; j--) {
            arr[j + 1] = arr[j];
        }
        arr[i] = value;
        nElemen++;
//        arr[nElemen] = value;
//        nElemen++;

    }

    public boolean find(int key) {
        int start, end, med;
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            med = (start + end) / 2;
            if (arr[med] == key) {
                return true;
            } else if (arr[med] < key) {
                start = med + 1;
            } else {
                end = med - 1;
            }
        }
        return false;
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }

        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElemen + 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.print("Swap  : ");
                    swap(i, i + 1);
                    for (int j = 0; j < nElemen; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }

    public void SelectionSort() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            System.out.print("Swap  : ");
            swap(awal, min);
            for (int j = 0; j < nElemen; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }

    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            int temp = arr[curIn];

            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) {
                arr[i] = arr[i - 1];
                System.out.print("Tampil    :");
                for (int j = 0; j < nElemen; j++) {
                    System.out.print(arr[j]+" ");
                }
                i--;
                System.out.println("");
            }
            arr[i] = temp;
               System.out.print("Swap    :");
                for (int j = 0; j < nElemen; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println("");
        }

    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    public void coba(){
        insert(nElemen);
        display();
    }

}

public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 11;
        HighArray arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(15);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
        arr.display();
        arr.InsertionSort();
        System.out.println("Setelah di Sort :");
        arr.display();
        int key = 25;
        if (arr.find(key)) {
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
//        arr.display();
    }
}
