package homework_30.relatives;

import java.util.Objects;

//Хочется раздать всем родственникам по 100 евро, но родственников много, а евро всего 500. Хочу сначала
// отсортировать самых бедных, среди них женщин, а затем самых пожилых.
public class Relatives implements Comparable<Relatives> {

    private String name;
    private boolean gender;
    private int age;
    private double annualIncome;

    public Relatives(String name, boolean gender, int age, double annualIncome) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Relatives relatives)) return false;
        return gender == relatives.gender && age == relatives.age && annualIncome == relatives.annualIncome && Objects.equals(name, relatives.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, annualIncome);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Relatives{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", annualIncome=").append(annualIncome);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Relatives o) {
        return this.getName().compareTo(o.getName());
    }
}
