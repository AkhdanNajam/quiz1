public class MataKuliah02 {
    public String kodeMatkul;
    public String namaMatkul;
    public int sks;

    void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah : " + kodeMatkul);
        System.out.println("Nama Mata Kuliah : " + namaMatkul);
        System.out.println("SKS              : " + sks);
        System.out.println("-----------------------------");
    }
    void ubahNamaMatkul(String namaBaru) {
        namaMatkul = namaBaru;
    }
        void ubahSks(int sksBaru) {
    if (sksBaru > 2) {
        sks = sksBaru;
    } else {
        System.out.println("SKS harus lebih dari 2.");
    }
}
}