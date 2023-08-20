public abstract class AnimalImpl implements Animal {

    private String name;
    private double age;
    private String type;
    private double weight;

    public AnimalImpl(String name, double age, String type, double weight) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move(double speed) {
        System.out.println("Animal is moving with speed of " + speed + "km/h");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

}
