public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Zidan", 19, "Jl. Tanabang");
        person1.displayInfo();

        //Ubah nilai atribut menggunakan setter
        person1.setName("Ican");
        person1.setAge(20);

        //Tampilkan kembali informasi
        System.out.println("Update Information");
        person1.displayInfo();
    }
}