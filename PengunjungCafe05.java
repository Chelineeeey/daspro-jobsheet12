public class PengunjungCafe05 {
    static void daftarPengunjung(int nomorMeja, String...namaPengunjung){
        System.out.println("Meja nomor " + nomorMeja + " - Daftar nama pengunjung:");
        for (String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
    }

static int hitungTotalBelanja(int...harga){
    int total = 0;
    for (int h : harga){
        total += h;
    }
    return total;
}
public static void main(String[] args){
    daftarPengunjung(2, "Ali", "Budi", "Citra");
    System.out.println("Total 1 argumen : " + hitungTotalBelanja(15000));
    System.out.println("Total 3 argumen : " + hitungTotalBelanja(15000, 20000, 22000));
    System.out.println("Total 5 argumen : " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));

}
}
