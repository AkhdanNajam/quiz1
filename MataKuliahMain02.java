import java.util.Scanner;
public class MataKuliahMain02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MataKuliah02 [] arrayOfMataKuliah02 = new MataKuliah02[3];
    String kodeMatkul, namaMatkul;
    int sks;
    for (int i = 0; i < arrayOfMataKuliah02.length; i++) {
        System.out.println("Masukkan Kode Mata Kuliah : ");
        kodeMatkul = sc.nextLine();
        System.out.println("Masukkan Nama Mata Kuliah : ");
        namaMatkul = sc.nextLine();
        System.out.println("Masukkan SKS : ");
        sks = sc.nextInt();
        sc.nextLine();
        
        arrayOfMataKuliah02[i] = new MataKuliah02();
        arrayOfMataKuliah02[i].kodeMatkul = kodeMatkul;
        arrayOfMataKuliah02[i].namaMatkul = namaMatkul;
        arrayOfMataKuliah02[i].sks = sks;
    }
    System.out.println("\nData Mata Kuliah:");
    for (int i = 0; i < arrayOfMataKuliah02.length; i++) {
        arrayOfMataKuliah02[i].tampilkanInfo();
    }
    System.out.println("\nUbah Data Mata Kuliah");
    System.out.print("Pilih index mata kuliah yang ingin diubah (0-2): ");
    int index = sc.nextInt();
    sc.nextLine();
    System.out.print("Masukkan Nama Mata Kuliah Baru: ");
    String namaBaru = sc.nextLine();
    arrayOfMataKuliah02[index].ubahNamaMatkul(namaBaru);
    System.out.print("Masukkan SKS Baru:(HARUS LEBIH DARI 2) ");
    int sksBaru = sc.nextInt();
    arrayOfMataKuliah02[index].ubahSks(sksBaru);
    System.out.println("\nData setelah diubah:");
    for (int i = 0; i < arrayOfMataKuliah02.length; i++) {
        arrayOfMataKuliah02[i].tampilkanInfo();
    }
}
}

