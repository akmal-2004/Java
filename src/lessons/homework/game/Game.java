package lessons.homework.game;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        warrior.move();
        warrior.attack();

        Character archer = new Archer();
        archer.move();
        archer.attack();

        // Accessing abilities specific to the Archer class
        ((Archer) archer).moveFast();
        ((Archer) archer).performRangedAttack();
    }
}
