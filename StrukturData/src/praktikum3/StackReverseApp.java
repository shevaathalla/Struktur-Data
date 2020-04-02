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
public class StackReverseApp {

    public static void main(String[] args) {
        StackReverse theStack = new StackReverse(20);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata   : ");
        String input = sc.nextLine();
        
        char ch[] = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            theStack.push(ch[i]);
        }
        int n=0;
        
        while(!theStack.isEmpty()){
        ch[n++] = theStack.pop();
        }
        System.out.println("Jika dibalik  :"+String.copyValueOf(ch));
    }
}
