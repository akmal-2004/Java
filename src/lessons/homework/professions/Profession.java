package lessons.homework.professions;

public abstract class Profession {
    private String name;

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performJob();
}
