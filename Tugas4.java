/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean cek = true;
        int min = 999, max = -999, i = 0;
        int[] arr = new int[100];
        while(cek){
            System.out.print("Masukkan Nilai : ");
            arr[i] = sc.nextInt();
            if(arr[i] != -1){
                if(arr[i] > max)
                    max = arr[i];
                if(arr[i] < min)
                    min = arr[i];
                i++;
            }
            else
                cek = false;
        }
        System.out.println(" ");
        System.out.println("Nilai Maximal : " + max);
        System.out.println("Nilai Minimal : " + min);
    }
}
