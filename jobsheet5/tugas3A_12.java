import java.util.Scanner;

public class tugas3A_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kartu_mhs, regis_online;

        System.out.print("Apakah anda membawa Kartu Mahasiswa? (true/false) : ");
        kartu_mhs = sc.nextBoolean();

        System.out.print("Apakah anda sudah melakukan registrasi online? (true/false) : ");
        regis_online = sc.nextBoolean();

        if (kartu_mhs == true || regis_online == true) {
            System.out.println("Anda diizinkan masuk perpustakaan");
        } else {
            System.out.println("Anda tidak diizinkan masuk perpustakaan");
        }

        sc.close();
    }
}
