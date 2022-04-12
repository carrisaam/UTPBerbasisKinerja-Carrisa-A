package Erigo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        Baju object = new Baju();
        object.halo();

        System.out.print("Baju yang akan anda beli bertipe : ");
        object.jenis = hi.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        object.jumlah = hi.nextInt();

        object.disp();

    }
}

class Baju {
    String jenis;
    int harga;
    int jumlah;

    final int baju_a = 100000;
    final int baju_b = 125000;
    final int baju_c = 175000;

    void halo() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + baju_a);
        System.out.println("Baju B dengan harga " + baju_b);
        System.out.println("Baju C dengan harga " + baju_c);
    }

    void harga_a() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = baju_a;
        }
    }

    void harga_b() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = baju_b;
        }
    }

    void harga_c() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = baju_c;
        }
    }

    void disp() {
        if (jenis.equalsIgnoreCase("a"))
            harga_a();
        else if (jenis.equalsIgnoreCase("b"))
            harga_b();
        else if (jenis.equalsIgnoreCase("c"))
            harga_c();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
} 