package PraktikumKetiga;

public class app {
    public static void main(String[] args) throws Exception {
            
        karyawan Ridho = new karyawan("12345", "Ridho");
    
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();

        karyawan Melan = new karyawan("12346", "Melan");
    
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Ridho.absenPulang();
        Melan.absenPulang();
    
        dosen Andiani = new dosen("23455", "332211", "Andiani");
    
        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.kerja();
        Andiani.ngajar();
        Andiani.absenPulang();

        dosen Ionia = new dosen("23456", "332212", "Ionia");
    
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.ngajar();
        Ionia.absenPulang();
        Andiani.absenPulang();
    }
}
