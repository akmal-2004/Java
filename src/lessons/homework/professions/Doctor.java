package lessons.homework.professions;

public class Doctor extends Profession{
    public Doctor() {
        super("Doctor");
    }

    @Override
    public void performJob() {
        System.out.println("Treating patients and saving lives.");
    }
}
