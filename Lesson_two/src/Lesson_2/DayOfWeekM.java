package Lesson_2;

import java.util.Calendar;
import java.util.Date;

public class DayOfWeekM {
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        DayOfWeek today = DayOfWeek.convertIntToDay(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("часов до окончания рабочей недели: "+getWorkingHours(today));
    }

    public static int getWorkingHours(final DayOfWeek currentDay) {
        int hours=0;
        if (currentDay != DayOfWeek.TUESDAY){
            for(DayOfWeek day: DayOfWeek.values()){
                if(day.getDayNumber() >= currentDay.getDayNumber()){
                    hours+=day.getWorkHours();
                }
            }
        }
        return hours;

    }
}
