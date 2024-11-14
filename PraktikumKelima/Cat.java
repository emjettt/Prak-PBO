public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); // Default cats have 4 legs
        this.name = name;
    }

    public Cat() {
        super(4);
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
        System.out.println(name + " Bermain bola kecil.");
    }

    @Override
    public void eat() {
        System.out.println(name + " makan ikan.");
    }
}