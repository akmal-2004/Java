package lessons.homework.professions;

public class Main {
    public static void main(String[] args) {
        Profession doctor = new Doctor();
        Profession engineer = new Engineer();

        doctor.performJob();
        ((Engineer) engineer).leadTeam();
    }
}
