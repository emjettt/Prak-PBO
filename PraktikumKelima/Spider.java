public class Spider extends Animal {
    private String name;

    public Spider(String name) {
        super(8); // Spiders have 8 legs
        this.name = name;
    }

    
    @Override
    public void eat() {
        System.out.println(name + " Sedang makan serangga.");
    }
}