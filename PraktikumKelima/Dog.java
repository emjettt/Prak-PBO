public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4); // Default dogs have 4 legs
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " Bermain tangkap stik kayu.");
    }

    @Override
    public void eat() {
        System.out.println(name + " makan daging.");
    }

    @Override
    public void walk() {
        System.out.println(name + " jalan bersama tuannya");
    }
}