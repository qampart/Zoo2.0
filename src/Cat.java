public class Cat extends AnimalImpl{
    public Cat(String name, double age, String type, double weight) {
        super(name, age, type, weight);
    }

    public void scratchFurniture() {
        System.out.println(getName() + " is scratching the furniture.");
    }

    public void meow() {
        System.out.println("Meow! Meow!");
    }
}
