package lessons.homework.enumeration;

public class EnumDemo {
    private Directions dir;

    public EnumDemo(Directions dir) {
        this.dir = dir;
    }

    public void getMyDirection() {
        switch (dir) {
            case EAST -> System.out.println("In East Direction");
            case WEST -> System.out.println("In West Direction");
            case NORTH -> System.out.println("In North Direction");
            case SOUTH -> System.out.println("In South Direction");
        }
    }
}
