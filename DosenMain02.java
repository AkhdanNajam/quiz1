import java.util.Scanner;
public class DosenMain02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Dosen02 [] arraOffDosen02 = new Dosen02[3];
       String nidn, nama, jenjangPendidikan, prodi;
       int tahunMasuk;
       for (int i = 0; i < arraOffDosen02.length; i++) {
              System.out.println("Masukkan NIDN : ");
              nidn = sc.nextLine();
              System.out.println("Masukkan Nama : ");
              nama = sc.nextLine();
              System.out.println("Masukkan Tahun Masuk : ");
              tahunMasuk = sc.nextInt();
              sc.nextLine();
              System.out.println("Masukkan Jenjang Pendidikan : ");
              jenjangPendidikan = sc.nextLine();
              System.out.println("Masukkan Prodi : ");
              prodi = sc.nextLine();
              
              arraOffDosen02[i] = new Dosen02(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
         }
    System.out.println("\nData Dosen:");
for (int i = 0; i < arraOffDosen02.length; i++) {
    arraOffDosen02[i].tampilkanInfo();
}
System.out.println("\nUbah Data Dosen");

System.out.print("Pilih index dosen yang ingin diubah (0-2): ");
int index = sc.nextInt();
sc.nextLine();


System.out.print("Masukkan Prodi Baru: ");
String prodiBaru = sc.nextLine();
arraOffDosen02[index].ubahProdi(prodiBaru);


System.out.print("Masukkan Jenjang Pendidikan Baru: ");
String pendidikanBaru = sc.nextLine();
arraOffDosen02[index].ubahPendidikan(pendidikanBaru);
System.out.println("\nData setelah diubah:");
for (int i = 0; i < arraOffDosen02.length; i++) {
    arraOffDosen02[i].tampilkanInfo();
}
    }
} 
    

