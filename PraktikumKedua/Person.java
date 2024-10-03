public class Person {
    private String Name;
    private int Age;
    private String Address;

    public Person (String Name, int Age, String Address){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Adress: " + this.Address);
    }

    public void setName(String Name){
         this.Name = Name;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public int getAge(){
        return this.Age;
    }
}