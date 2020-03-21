public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa(String nimd, String nama, String kelas) {
        nim = nimd;
        this.nama = nama;
        this.kelas = kelas;
    }
    public Mahasiswa() {
        nim = "18090040";
        nama = "Muhamad Nur Alim";
        kelas = "4D";
    }
    public String info() {
        return nim + ":" + nama + ":" +kelas;
    }
}