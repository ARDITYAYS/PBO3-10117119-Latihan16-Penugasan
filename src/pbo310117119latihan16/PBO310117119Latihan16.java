/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan16;

/**
 *
 * @author  
 * Nama      : Arditya Yogaputra S
 * Kelas     : IF-3 / PBO-3
 * Nim       : 10117104
 * Deskripsi : Program ini menampilkan hasil Operator Penugasan 
 */
public class PBO310117119Latihan16 {

 
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int c = 0;
       
       System.out.println("Nilai a = "+a);
       System.out.println("Nilai b = "+b);
       System.out.println("Nilai c = "+c+"\n");
       
       c = a + b;
        System.out.println("c = a + b = "+c);
       c += a;
        System.out.println("c = += a = "+c);
       c -= a;
        System.out.println("c = -=a = "+c);
       c *= a;
        System.out.println("c = *=a = "+c);
       a = 10;
       c = 15;
       c /= a;
        System.out.println("c /= a = "+c);
       a = 10;
       c = 15;
       c %= 10;
        System.out.println("c &= a = " + c);
       c <<=2; 
        System.out.println("c <<=2 = "+c);
       c >>=2;
        System.out.println("c >>=2 = "+c);
       c >>= 2;
        System.out.println("c >>= 2 = "+c);
       c &= a;
        System.out.println("c &= 2 =" +c);
       c ^= a;
        System.out.println("c ^= a = "+c);
       c |= a;
        System.out.println("c |= a = "+c);
       
    }
    
}
