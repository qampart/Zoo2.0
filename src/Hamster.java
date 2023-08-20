public class Hamster extends Animal {
    public Hamster(String name, double age, String type, double weight) {
        super(name, age, type, weight);
    }

    public void runInWheel() {
        System.out.println(getName() + " is running in the wheel.");
    }

    public void storeCheeks(String food) {
        System.out.println(getName() + " is storing " + food + " in its cheeks.");
    }

    public void playWithToys() {
        System.out.println(getName() + " is playing with its toys.");
    }

    @Override
    public void move(double speed) {

    }

    @Override
    public void eat() {

    }
}
