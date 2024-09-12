import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short jmlGuna;
        int tarif;
        System.out.print("Jumlah penggunaan listrik(kWh): ");
        jmlGuna = sc.nextShort();
        tarif = 1500 * jmlGuna;
        short pengecekan = 500;
        System.out.println("Tarif listrik anda adalah: Rp " + tarif);
        System.out.println("Penggunaan listrik anda > 500 kWh: " + (jmlGuna > pengecekan));
        sc.close();
    }
}