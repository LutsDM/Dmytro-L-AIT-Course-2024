package homeWork_18.animals.model;

public class Cat extends Pet {

    private String breed;
    private int height;
    private double weight;

    public Cat(int id, String type, int age, String name, String breed, int height, double weight) {
        super(id, type, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

   public void voice () {
        System.out.println("Мяу!");
    }
}
