import java.util.Scanner;

public class tugas3B_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;

        System.out.print("Masukkan jenis pengguna: ");
        pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }   
}
