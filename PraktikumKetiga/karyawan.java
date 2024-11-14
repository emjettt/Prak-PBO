package PraktikumKetiga;

    public class karyawan {
        protected String kodeKaryawan;
        protected String nama;
    
    public karyawan (String kodeKaryawan, String nama) {
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }
    
    public void absenPagi(){
        System.out.println(this.nama + " Absen Pagi ");
    }
    
    public void kerja(){
        System.out.println(this.nama + " Sedang Bekerja ");
    }
    
    public void absenPulang(){
        System.out.println(this.nama + " Absen Pulang ");
    }
    
    public void getInfo(){
        System.out.println("Kode Karyawan :" + this.kodeKaryawan );
        System.out.println("Nama : " + this.nama);
    }    
}