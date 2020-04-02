/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author HP ProBook
 */
public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);
        arr.insert(16650200, "Sheva", "Malang");
        arr.insert(16650210, "Aku", "Surabaya");
        arr.insert(16650250, "Kamu", "Madiun");
        arr.insert(16650240, "Dia", "Bali");
        arr.insert(16650230, "Mereka", "Jakarta");
        arr.insert(16650220, "Beta", "Papua");
        arr.insert(16650270, "Ako", "Pinoy");
        arr.insert(16650260, "Sayang", "Hatiku");
        arr.insert(16650280, "Gatau", "Gatau");
        arr.ShellSort();
        
        
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
