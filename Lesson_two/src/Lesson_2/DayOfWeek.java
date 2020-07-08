package Lesson_2;

public enum DayOfWeek {
    MONDAY(7,8),
    TUESDAY(1,8),
    WEDNESDAY(2,8),
    THURSDAY(3,8),
    FRIDAY(4,8),
    SATURDAY(5,0),
    SUNDAY(6,0);

    private final int dayNumber;
    private final int workHours;

    DayOfWeek (int dayNumber, int workHours){
        this.dayNumber = dayNumber;
        this.workHours = workHours;
    }
    public int getWorkHours(){
        return this.workHours;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }

    static DayOfWeek convertIntToDay (int number){
        for(DayOfWeek day: values())
            if(day.dayNumber == number)
                return day;
        return null;
    }
}