public class Pegawai {
    private String  NIP;
    private String Nama;
    private String Alamat;
    private double Jumlah;
    private double GajiPokok;
    private double TotalGaji;
    public Pegawai (){
        this.NIP="";
        this.Nama="";
        this.Alamat="";
        this.Jumlah=0;
        this.GajiPokok=0;
        this.TotalGaji=0;
    }
    //fungsi mutator
    public void setNIP (String NIP){
        this.NIP=NIP;
    }
    public void setNama (String Nama){
        this.Nama=Nama;
    }
    public void setAlamat (String Alamat){
        this.Alamat=Alamat;

    }
    public void setJumlah (double Jumlah){
        this.Jumlah=Jumlah;
    }
    public void setGajiPokok (double GajiPokok){
        this.GajiPokok=GajiPokok;
    }
    //fungsi accesor
    public String getNIP(){
        return this.NIP;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public double getJumlah(){
        return this.Jumlah;
    }
    public double getGajiPokok(){
        return this.GajiPokok;
    }
    public double getTotalGaji(){
        return this.TotalGaji;
    }
    public void HitungTotalGaji(){
        TotalGaji=GajiPokok+(GajiPokok*Jumlah*0.01);
    }
    public void HitungTotalGaji(float Persen){
        TotalGaji=GajiPokok+(GajiPokok*Jumlah*Persen);
    }
    public void display (){
        System.out.println("NIP : "+NIP);
        System.out.println("Nama : "+Nama);
        System.out.println("Alamat : "+Alamat);
        System.out.println("Jumlah : "+Jumlah);
        System.out.println("GajiPokok : "+GajiPokok);
        System.out.println("TotalGaji : "+TotalGaji);
    }
}
