package lessons.homework.game;

public class Warrior extends Character {
    @Override
    public void move() {
        System.out.println("Warrior is moving.");
    }

    @Override
    public void attack() {
        System.out.println("Warrior is attacking.");
    }
}
