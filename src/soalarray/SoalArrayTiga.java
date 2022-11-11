/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalarray;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SoalArrayTiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Masukkan nama: ");
        String pilihan = scan.nextLine();
        
        String [][] nama = {{"adi", "budi", "andi", "farel"}, {"bagas", "radit", "toha", "haku"}};
        int [][] nisn = {{1234, 2345, 3456, 4567}, {5678, 6789, 7891, 8910}};
        String [][] kelas = {{"XR1", "XR2", "XR3", "XR4"}, {"XR5", "XR6", "XR7", "XR8"}};
        
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 4; y++) {
                if (nama[x][y]. equalsIgnoreCase(pilihan)){
                    System.out.println("==========");
                    System.out.println("Nama: "+nama [x][y]);
                    System.out.println("NISN: "+nisn [x][y]);
                    System.out.println("NISN: "+kelas [x][y]);
                break;
                }
            }
            
        }
    }
 }

