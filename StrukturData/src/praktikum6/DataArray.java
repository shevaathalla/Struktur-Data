/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

import praktikum2.*;

/**
 *
 * @author HP ProBook
 */
public class DataArray {

    private Mahasiswa[] mhs;
    private int nElemen, max, itungan = 1;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
        this.max = max;
    }

    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }

    private void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan;
        while (true) {
            while (indexKiri < batasKanan && mhs[++indexKiri].getNim() < pivot.getNim()) ;
            while (indexKanan > batasKiri && mhs[--indexKanan].getNim() > pivot.getNim()) ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        swap(indexKiri, batasKanan);
        return indexKiri;
    }

    public void ShellSort() {
        int in, out;
        Mahasiswa temp;
        int h = 0;
        h = 3 * h + 1;
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;
                while (in > h - 1 && mhs[in - h].getNama().compareTo(temp.getNama())>0) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    public void mergeSort() {
        Mahasiswa [] workSpace = new Mahasiswa[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    }

    public void recMergeSort(Mahasiswa []workSpace,int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound)/ 2;
            recMergeSort(workSpace, lowerBound,mid);
            recMergeSort(workSpace, mid + 1,upperBound);
            merge(workSpace, lowerBound,mid + 1, upperBound);
        }
    }

    public void merge(Mahasiswa []workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;
        while (lowIndex <= mid
                && highIndex <= upperBound) {
            if (mhs[lowIndex].getNim() < mhs[highIndex].getNim()) {
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }
        while (lowIndex <= mid) {
            workSpace[j++] = mhs[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = mhs[highIndex++];
        }
        for (j = 0; j < nItem; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
//                    System.out.print("Swap  : ");
                    swap(i, i + 1);
//                    for (int j = 0; j < nElemen; j++) {
//                        System.out.print(mhs[j] + " ");
//                    }
//                    System.out.println("");
                }
            }
        }
    }

    public void SelectionSort() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (mhs[i].getNim() < mhs[min].getNim()) {
                    min = i;
                }
            }
            swap(awal, min);
        }
    }

    public void SelectionSortbyName() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (mhs[i].getNama().compareTo(mhs[min].getNama()) < 0) {
                    min = i;
                }
            }
            swap(awal, min);
        }
    }

    public void InsertionSortbyName() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa temp = mhs[curIn];
            i = curIn;
            while (i > 0 && mhs[i - 1].getNama().compareTo(temp.getNama()) > 0) {
                mhs[i] = mhs[i - 1];
                i--;
            }
            mhs[i] = temp;
        }

    }

    public void swap(int one, int two) {
        Mahasiswa temp;
        temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return null;
        } else {
            return mhs[i];
        }
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (nElemen == i) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                mhs[j] = mhs[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
        System.out.println("------------------------");
    }

}
