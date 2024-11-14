package homeWork_16.model;

public class Pet {

    private int id;
    private String species;
    private int age;
    private String name;

    public Pet(int id, String species, int age, String name) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void sleep() {
        System.out.println (name + " is sleeping.");
    }

    public void eat() {
        System.out.println (name + " is eating.");
    }

    public void makeSound() {
        System.out.println (name + " is making a sound.");
    }

    public void play() {
        System.out.println (name + " is playing.");
    }

    public void walk() {
        System.out.println (name + " is walking.");
    }
}
