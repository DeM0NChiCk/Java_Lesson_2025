package lesson_19_12.model;

import lesson_19_12.enums.Day;

public class Cleaner {
    private final Day day;

    public Cleaner(Day day) {
        this.day = day;
    }

    public void cleaning() {
        if (day == Day.SATURDAY)  {}
    }


}
