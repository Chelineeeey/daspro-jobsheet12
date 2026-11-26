package Jobsheet12;

import java.util.Scanner;

public class Kafe05{
    public static void menu(String namaPelanggan, boolean isMember, int jamKunjung){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <=16){
                System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

    }

    public static int hitungTotalHarga05(int pilihanMenu, int banyakItem){
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember){
        int persen = 0;

        if (kodePromo.equals("DISKON50")){
            persen = 50;
        } else if (kodePromo.equals("DISKON30")){
            persen = 30;
        } else {
            System.out.println("Kode promo invalid");
        } 

        if (isMember){
            persen += 0;
        }

        return total * persen / 100;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama = "Andi";
        boolean isMember = true;
        int jamKunjung = 15;
        menu(nama, isMember, jamKunjung);

        int totalHarga = 0;
        while (true){
            System.out.print("\nMasukkan nomor menu (0 = selesai): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0){
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6){
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga05(pilihanMenu, banyakItem);
        }

        System.out.println("\nTotal harga untuk pesanan Anda: Rp" + totalHarga);

        sc.nextLine();
        System.out.print("\nMasukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine().trim();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalBayar = totalHarga - diskon;

        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        System.out.println("Total harga     : Rp" + totalHarga);
        System.out.println("Besar diskon    : Rp" + diskon);
        System.out.println("Total dibayar   : Rp" + totalBayar);

        sc.close();
    }
}