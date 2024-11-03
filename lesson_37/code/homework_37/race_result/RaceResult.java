package homework_37.race_result;

import java.time.LocalDate;

//Задача 3.(*) Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах и десятых долях секунды. Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.
public class RaceResult implements Comparable <RaceResult> {

    private int regNumber;
    private String firstName;
    private String secondName;
    private boolean gender;
    private LocalDate dateOfBirth;
    private String team;
    private double result;

    public RaceResult(int regNumber, String firstName, String secondName, boolean gender, LocalDate dateOfBirth, String team, double result) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.team = team;
        this.result = result;
    }

    public boolean isGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getTeam() {
        return team;
    }

    public double getResult() {
        return result;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RaceResult that)) return false;

        return regNumber == that.regNumber;
    }

    @Override
    public int hashCode() {
        return regNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RaceResult{");
        sb.append("regNumber=").append(regNumber);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", team='").append(team).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(RaceResult o) {
        return Double.compare(getResult(), o.getResult());
    }
}
