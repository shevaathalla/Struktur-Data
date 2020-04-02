package strukturdata;

import javax.swing.JOptionPane;

public class binary {

    public static void main(String[] args) {
        int[] a = new int[5];
        int input, cari;
        int searchV = 0, index;
        System.out.println(
                "Bilangan:");

        for (int i = 0; i < a.length; i++) {
            input = Integer.parseInt(JOptionPane.showInputDialog(
                    "Masukkan Angka ke -" + (i + 1) + " :"));
            a[i] = input;
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Angka yg Dicari: ");
        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yg Dicari       :"));
        System.out.print(" " + cari);
        System.out.println("");
        searchV = cari;
        index = binarySearch(a, searchV);
        if (index != -1) {
            System.out.println("Angka " + cari + " DITEMUKAN di index: " + index
            );
        } else {
            System.out.println("Angka " + cari
                    + " TIDAK DITEMUKAN");
        }
    }

    static int binarySearch(int[] search, int find) {
        int start, end, midPt;
        start = 0;
        end = search.length - 1;
        while (start <= end) {
            midPt = (start + end) / 2;
            if (search[midPt] == find) {
                return midPt;
            } else if (search[midPt] < find) {
                start = midPt + 1;
            } else {
                end = midPt - 1;
            }
        }
        return -1;
    }
}
