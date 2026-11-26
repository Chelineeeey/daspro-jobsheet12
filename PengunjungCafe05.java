public class PengunjungCafe05 {
    static void daftarPengunjung(int nomorMeja, String...namaPengunjung){
        System.out.println("Meja nomor " + nomorMeja + " - Daftar nama pengunjung:");
        for (String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
    }

public static void main(String[] args) {
    daftarPengunjung(2, "Ali", "Budi", "Citra");
}
}
