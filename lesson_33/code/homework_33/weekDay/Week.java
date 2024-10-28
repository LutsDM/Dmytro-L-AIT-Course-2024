package homework_33.weekDay;

import classwork_33.month.Month;

public enum Week {
    MONDAY("Понедельник", 1, false),
    TUESDAY("Вторник", 2, false),
    WEDNESDAY("Среда", 3, false),
    THURSDAY("Четверг", 4, false),
    FRIDAY("Пятница",  5, false),
    SATURDAY("Суббота", 6, true),
    SUNDAY("Воскресенье", 7, true);;

    private String name;
    private int number;
    private boolean isWeekend;

    Week(String name, int number, boolean isWeekend) {
        this.name = name;
        this.number = number;
        this.isWeekend = isWeekend;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Week{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", isWeekend=").append(isWeekend);
        sb.append('}');
        return sb.toString();
    }

    public Week plusDay(int quantity) {
        int index = this.ordinal() + quantity;
        Week[] days = Week.values();
        int res = index % days.length;
        return days[res];

    }
}
