import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte jamKerja;
        double bonus, pajak, total, upah, gaji;
        System.out.print("Jam kerja anda: ");
        jamKerja = sc.nextByte();
        System.out.print("Upah/jam anda: Rp ");
        upah = sc.nextInt();
        gaji = jamKerja * upah;
        bonus = 0.1 * gaji;
        pajak = 0.05 * (gaji + bonus);
        total = gaji + bonus - pajak;
        System.out.print("Gaji bulanan anda: Rp " + total);
        sc.close();
    }
}