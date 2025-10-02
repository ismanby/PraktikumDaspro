import java.util.Scanner;

public class ifCetakKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();    

        // IF-ELSE
        if (uktLunas) {
            System.out.println("-- Versi IF-ELSE --");
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        // Ternary Operator
        System.out.println("\n-- Versi Ternary Operator --");
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);

        sc.close();
    }
}