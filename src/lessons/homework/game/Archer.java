package lessons.homework.game;

public class Archer extends Character implements FastMovement, RangedAttack {
    @Override
    public void move() {
        System.out.println("Archer is moving.");
    }

    @Override
    public void attack() {
        System.out.println("Archer is attacking.");
    }

    @Override
    public void moveFast() {
        System.out.println("Archer is moving quickly.");
    }

    @Override
    public void performRangedAttack() {
        System.out.println("Archer is performing a ranged attack.");
    }
}
