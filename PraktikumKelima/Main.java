public class Main {
    public static void main(String[] args) {
        Spider spider = new Spider("Mike");
        spider.walk();
        spider.eat();

        Dog dog = new Dog();
        dog.setName("Jerry");
        dog.play();
        dog.eat();
        dog.walk();
        
        Cat cat = new Cat("Dudul");
        cat.play();
        cat.eat();
        cat.walk();

    }
}