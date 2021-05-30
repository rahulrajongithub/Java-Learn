package Enums;

public class EnumTest {

    public static void main(String[] args) {
        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
