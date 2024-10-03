package PraktikumKeempat;

    public class Mobil {
        protected String nama;
    
    public Mobil (String nama) {
        this.nama = nama;
    }
    
    public void klakson(){
        System.out.println(this.nama + " = Teet ");
    }    
}