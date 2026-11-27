import java.util.Scanner;

public class HitungBalok05 {

    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t){
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    
    static int selisih(int a, int b){
        return a - b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang:");
        p = input.nextInt();
        System.out.println("Masukkan lebar:");
        l = input.nextInt();
        System.out.println("Masukkan tinggi:");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah: " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah: " + vol);

       
        System.out.println("\n=== URUTAN ARGUMEN ===");
        System.out.println("hitungVolume(t, p, l) = " + hitungVolume(t, p, l));
        System.out.println("hitungVolume(p, l, t) = " + hitungVolume(p, l, t));
        System.out.println("selisih(10, 3) = " + selisih(10, 3));
        System.out.println("selisih(3, 10) = " + selisih(3, 10));

        input.close();
    }
}