package lessons.homework.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        EnumDemo enumDemo = new EnumDemo(Directions.EAST);
        enumDemo.getMyDirection();

        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}
