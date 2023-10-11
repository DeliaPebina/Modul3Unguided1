public class Pegawai2 {
    public static void main(String[] args) {

        Pegawai Pegawai = new Pegawai();
        Pegawai.setNIP("03037");
        Pegawai.setNama("Delia");
        Pegawai.setAlamat("Medan");
        Pegawai.setJumlah(15);
        Pegawai.setGajiPokok(7500000);
        Pegawai.HitungTotalGaji();
        Pegawai.display();
        Pegawai Gubernur = new Pegawai();
        Pegawai.setNIP("010204");
        Pegawai.setNama("Delia");
        Pegawai.setAlamat("Medan");
        Pegawai.setJumlah(15);
        Pegawai.setGajiPokok(7500000);
        Pegawai.HitungTotalGaji(0.05f);
        Pegawai.display();
    }
}
