public class Dog extends AnimalImpl {

    public Dog(String name, double age, String type, double weight) {
        super(name, age, type, weight);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void digHole() {
        System.out.println(getName() + " is digging a hole in the ground.");
    }






}
