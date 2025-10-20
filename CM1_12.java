package PraktikumDaspro;
import java.util.Scanner;

public class CM1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : "); // Input Nama Mahasiswa
        String nama = sc.nextLine();
        System.out.print("NIM  : "); // Input NIM Mahasiswa
        String nim = sc.nextLine();

        // Input Mata Kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : "); // Input Nilai UTS Matkul 1
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : "); // Input Nilai UAS Matkul 1
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : "); // Input Nilai Tugas Matkul 1
        double tugas1 = sc.nextDouble();

        // Input Mata Kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : "); // Input Nilai UTS Matkul 2
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : "); // Input Nilai UAS Matkul 2
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : "); // Input Nilai Tugas Matkul 2
        double tugas2 = sc.nextDouble();

        // Input Mata Kuliah 3
        System.out.println("\n--- Mata Kuliah 3: Basis Data ---");
        System.out.print("Nilai UTS   : "); // Input Nilai UTS Matkul 3
        double uts3 = sc.nextDouble();
        System.out.print("Nilai UAS   : "); // Input Nilai UAS Matkul 3
        double uas3 = sc.nextDouble();
        System.out.print("Nilai Tugas : "); // Input Nilai Tugas Matkul 3
        double tugas3 = sc.nextDouble();

        // Hitung Nilai Akhir
        double nilaiAkhir1 = (0.30 * uts1) + (0.40 * uas1) + (0.30 * tugas1); // Rumus Nilai Akhir Matkul 1
        double nilaiAkhir2 = (0.30 * uts2) + (0.40 * uas2) + (0.30 * tugas2); // Rumus Nilai Akhir Matkul 2
        double nilaiAkhir3 = (0.30 * uts3) + (0.40 * uas3) + (0.30 * tugas3); // Rumus Nilai Akhir Matkul 3
        double rataRata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3; // Rumus Rata-rata Ketiga  Matkul

        // Kategori Nilai Huruf Matkul 1
        String nilaiHuruf1;
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) { // Kategori Nilai Huruf A apabila nilai akhir adalah 81 sampai 100
            nilaiHuruf1 = "A"; 
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) { // Kategori Nilai Huruf B+ apabila nilai akhir adalah 74 sampai 80
            nilaiHuruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) { // Kategori Nilai Huruf B apabila nilai akhir adalah 66 sampai 73
            nilaiHuruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) { // Kategori Nilai Huruf C+ apabila nilai akhir adalah 61 sampai 65
            nilaiHuruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) { // Kategori Nilai Huruf C apabila nilai akhir adalah 51 sampai 60
            nilaiHuruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) { // Kategori Nilai Huruf D apabila nilai akhir adalah 40 sampai 50
            nilaiHuruf1 = "D";
        } else if (nilaiAkhir1 >= 0 && nilaiAkhir1 <= 39) { // Kategori Nilai Huruf E apabila nilai akhir adalah 0 sampai 39
            nilaiHuruf1 = "E";
        } else {
            nilaiHuruf1 = "Invalid"; // Kategori Nilai Di luar 0-100
        }
        
        // Kategori Nilai Huruf Matkul 2
        String nilaiHuruf2;
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) { // Kategori Nilai Huruf A apabila nilai akhir adalah 81 sampai 100
            nilaiHuruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) { // Kategori Nilai Huruf B+ apabila nilai akhir adalah 74 sampai 80
            nilaiHuruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) { // Kategori Nilai Huruf B apabila nilai akhir adalah 66 sampai 73
            nilaiHuruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) { // Kategori Nilai Huruf C+ apabila nilai akhir adalah 61 sampai 65
            nilaiHuruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) { // Kategori Nilai Huruf C apabila nilai akhir adalah 51 sampai 60
            nilaiHuruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) { // Kategori Nilai Huruf D apabila nilai akhir adalah 40 sampai 50
            nilaiHuruf2 = "D";
        } else if (nilaiAkhir2 >= 0 && nilaiAkhir2 <= 39) { // Kategori Nilai Huruf E apabila nilai akhir adalah 0 sampai 39
            nilaiHuruf2 = "E";
        } else {
            nilaiHuruf2 = "Invalid"; // Kategori Nilai Di luar 0-100
        }

        // Kategori Nilai Huruf Matkul 3
        String nilaiHuruf3;
        if (nilaiAkhir3 > 80 && nilaiAkhir3 <= 100) { // Kategori Nilai Huruf A apabila nilai akhir adalah 81 sampai 100
            nilaiHuruf3 = "A";
        } else if (nilaiAkhir3 > 73 && nilaiAkhir3 <= 80) { // Kategori Nilai Huruf B+ apabila nilai akhir adalah 74 sampai 80
            nilaiHuruf3 = "B+";
        } else if (nilaiAkhir3 > 65 && nilaiAkhir3 <= 73) { // Kategori Nilai Huruf B apabila nilai akhir adalah 66 sampai 73
            nilaiHuruf3 = "B";
        } else if (nilaiAkhir3 > 60 && nilaiAkhir3 <= 65) { // Kategori Nilai Huruf C+ apabila nilai akhir adalah 61 sampai 65
            nilaiHuruf3 = "C+";
        } else if (nilaiAkhir3 > 50 && nilaiAkhir3 <= 60) { // Kategori Nilai Huruf C apabila nilai akhir adalah 51 sampai 60
            nilaiHuruf3 = "C";
        } else if (nilaiAkhir3 > 39 && nilaiAkhir3 <= 50) { // Kategori Nilai Huruf D apabila nilai akhir adalah 40 sampai 50
            nilaiHuruf3 = "D";
        } else if (nilaiAkhir3 >= 0 && nilaiAkhir3 <= 39) { // Kategori Nilai Huruf E apabila nilai akhir adalah 0 sampai 39
            nilaiHuruf3 = "E";
        } else {
            nilaiHuruf3 = "Invalid"; // Kategori Nilai Di luar 0-100
        }

        // Status Kelulusan Matkul 1, 2 dan 3
        String status1, status2, status3;
        status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status Kelulusan Matkul 1 = LULUS bila Nilai Akhir >= 60
        status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status Kelulusan Matkul 2 = LULUS bila Nilai Akhir >= 60
        status3 = (nilaiAkhir3 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status Kelulusan Matkul 3 = LULUS bila Nilai Akhir >= 60

        // Output Hasil Penilaian Akademik
        System.out.println("\n======================= HASIL PENILAIAN AKADEMIK =======================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMata Kuliah \t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------");
        // Output Hasil Penilaian Matkul 1, 2 dan 3
        // Ini Menggunakan Format dan /t yaitu untuk Tab agar Tabel Rapi
        System.out.printf("Algoritma Pemrograman\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, status1); 
        System.out.printf("Struktur Data\t\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, status2);
        System.out.printf("Basis Data\t\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts3, uas3, tugas3, nilaiAkhir3, nilaiHuruf3, status3);

        // Output Rata-rata dan Status Semester
        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rataRata); // Output Rata-rata Nilai Akhir
        // Status Semester = LULUS bila ketiga Matkul LULUS dan Rata-rata >= 70
        if (status1 == "LULUS" && status2 == "LULUS" && status3 == "LULUS") {
            if (rataRata >= 70) {
                System.out.println("Status Semester: LULUS");
            } else {
                System.out.println("Status Semester: TIDAK LULUS (Rata-rata < 70)");
            }
        } else {
            System.out.println("Status Semester: TIDAK LULUS (Ada Matkul yang TIDAK LULUS)");
        }
        // Untuk membedakan output yang rata-rata dan salah satu matkul tidak lulus, kalimat di outputnya dibedakan agar lebih jelas

        sc.close();
    }
}