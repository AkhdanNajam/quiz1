public class Dosen02 {
    public String nidn;
    public String nama;
    public int tahunMasuk;
    public String jenjangPendidikan;
    public String prodi;
    public Dosen02(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    void tampilkanInfo() {
        System.out.println("NIDN              : " + nidn);
        System.out.println("Nama              : " + nama);
        System.out.println("Tahun Masuk       : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Prodi             : " + prodi);
        System.out.println("-----------------------------");
    }

    // Method mengubah prodi
    void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
    }

    // Method mengubah jenjang pendidikan
    void ubahPendidikan(String pendidikanBaru) {
        jenjangPendidikan = pendidikanBaru;
    }
}

