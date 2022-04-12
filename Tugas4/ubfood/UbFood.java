/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ubfood;
import java.util.*;

public class UbFood{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama    : Carrisa Aleyda M");
        System.out.println("NIM     : 215150601111012");
        System.out.println("----------------------------------------");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        DataMerchant.tampilData();
        System.out.println();
       
        
//        menampilkan merchant
        int stat = 0;
        while(stat == 0){
            System.out.println("Mau mencari merchant ? (Y/N)");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("N")){
                stat = 1;
            }else{
                System.out.print("Cari merchant   : ");
                String nama = sc.nextLine();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.tampilMerchant(DataMerchant.cariMerchant(nama));
                }
            }
        }
     
//         tambah data merchant
        int con = 0;
        while(con == 0){
            System.out.println("Mau tambah merchant baru ? (Y/N)");
            String jawab = sc.nextLine();
            if(jawab.equalsIgnoreCase("Y")){
                System.out.println("==Tambah Merchant Baru==");
                System.out.print("Nama Merchant   : ");
                String a = sc.nextLine();
                System.out.print("Nama Produk     : ");
                String b = sc.nextLine();
                System.out.print("Harga           : ");
                int c = sc.nextInt(); sc.nextLine();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(a,b,c));
                System.out.println();
                DataMerchant.tampilData();
            }else{
                con = 1;
            }
        }
        
//  update merchant
        int cond = 0;
        while(cond == 0){
            System.out.println("Mau update merchant ? (Y/N)");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("N")){
                cond = 1;
            }else{
                System.out.print("Cari merchant   : ");
                String nama = sc.nextLine();
                if(DataMerchant.cariMerchant(nama) == null){
                    System.out.println("Merchant tidak diketahui");
                }else{
                    DataMerchant.updateMerchant(DataMerchant.cariMerchant(nama));
                }
            }
        }
    }
}
