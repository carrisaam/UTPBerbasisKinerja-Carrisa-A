/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubfood;

/**
 *
 * @author user
 */
public class Merchant {
    private  String namaMerchant;
    private  String namaProduk;
    private  double hargaMakanan;
    
    Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        setNamaMerchant(namaMerchant);
        setNamaProduk(namaProduk);
        setHargaMakanan(hargaMakanan);
    }
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
    
    public String getNamaMerchant(){
        return namaMerchant;
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public double getHargaMakanan(){
        return hargaMakanan;
    }
}
