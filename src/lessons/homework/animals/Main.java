package lessons.homework.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        speak(dog);
    }
    static void speak(Animal animal) {
        animal.speak();
    }
}
