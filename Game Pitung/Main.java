public class Main{
    public static void main(String[] args) {
        Jagoan player1 = new Jagoan("Jaka Sembung");
        Jubah armor1 = new Jubah("Jubah Puith",7,50);
        Senjata weapon1 = new Senjata("Golok", 25);
        player1.setJubah(armor1);
        player1.setSenjata(weapon1);

        Jagoan player2 = new Jagoan("Si Pitung");
        Jubah armor2 = new Jubah("Jubah Hitam",8,52);
        Senjata weapon2 = new Senjata("Toya", 24);
        player2.setJubah(armor2);
        player2.setSenjata(weapon2);

        player1.display();
        player2.display();

        System.out.println("Kedua Jagoan Memulai Perkelahian");
        System.out.println("================================");
        player1.attack(player2);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
    }
}