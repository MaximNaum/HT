package t2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Time {

    public static void timePassed(int year, int month, int day, int hour, int minute, int second) {
        LocalDateTime pastDateTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, minute, second));
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(pastDateTime, now);

        long years = duration.toDays() / 365;
        long months = duration.toDays() % 365 / 30;
        long days = duration.toDays() % 365 % 30;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.printf("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин та %d секунд.%n",
                years, months, days, hours, minutes, seconds);
    }

    public static void main(String[] args) {

        timePassed(2006, 12, 20, 4, 30, 45);
    }
}
