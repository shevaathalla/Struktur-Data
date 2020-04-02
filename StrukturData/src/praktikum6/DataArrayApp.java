










/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author HP ProBook
 */
public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650280, "Arina", "Malang");
        
        System.out.println("Data Mahasiswa Sebelum Diurutkan");
        arr.displayArray(); 
        
        System.out.println("Merge Sort By NIM");
        arr.mergeSort();
        arr.displayArray();
        
        System.out.println("Shell Sort By Name");
        arr.ShellSort();
        arr.displayArray();
        
        System.out.println("Quick Sort By Nim");       
        arr.QuickSort();
        arr.displayArray();


        
//        long searchKey = 16650200;
//        Mahasiswa mhs = arr.find(searchKey);
//        if (mhs != null) {
//            System.out.print("\nKetemu");
//            mhs.displayMhs();
//        }else{
//            System.out.println("Gk ketemu");
//        }
//        
//        searchKey = 16650240;
//        System.out.println("Hapus : "+searchKey);
//        arr.delete(searchKey);
//        arr.displayArray();
    }
}
