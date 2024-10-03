abstract class Animal{
protected int legs;

    public Animal(int legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Sedang Berjalan " + legs + " kaki");
    }

    public abstract void eat();
}