package lessons.homework.professions;

public class Engineer extends Profession implements Leadership{
    public Engineer() {
        super("Engineer");
    }

    @Override
    public void performJob() {
        System.out.println("Designing and building structures or systems.");
    }

    @Override
    public void leadTeam() {
        System.out.println("Leading team to success.");
    }
}
