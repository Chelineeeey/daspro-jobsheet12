import java.util.Scanner;

public class BankSampah05 {
    static final double HARGA_PER_KG = 3000;

    static double[] inputSetoran(int n, Scanner sc){
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran){
        System.out.println("\n=== DATA SETORAN ===");
        for (int i = 0; i < setoran.length; i++){
            System.out.println("Nasabah ke-" + (i + 1) + setoran[i] + " kg");

        }
    }

    static double totalSetoran(double[] setoran){
        double total = 0;
        for (double s : setoran){
            total += s;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg){
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran){
        int idx = 0;
        for (int i = 0; i < setoran.length; i++){
            if (setoran[i] > setoran [idx]){
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nasabah (N): ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Jumlah nasabah harus lebih dari 0");
            sc.close();
            return;
        }

        double[] setoran = inputSetoran(n, sc);
        tampilSetoran(setoran);

        System.out.println("\n=== SALDO TIAP NASABAH (Rp" + (long) HARGA_PER_KG + "/kg) ===");
        for (int i = 0; i < setoran.length; i++){
            double saldo = hitungSaldo(setoran[i], HARGA_PER_KG);
            System.out.printf("Nasabah ke-%d : Rp%,.0f%n", (i + 1), saldo);
        }

        System.out.println("\nTotal setoran seluruh nasabah : " + totalSetoran(setoran) + " kg");

        int idx = nasabahTerbanyak(setoran);
        System.out.println("Nasabah dengan setoran terbanyak : nasabah ke-" + (idx + 1) + " (" + setoran[idx] + " 3kg)");

        sc.close();
    }
}
