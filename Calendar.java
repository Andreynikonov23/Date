package nick.pack;


import java.util.Calendar;

public class ClassCalendar {

    public static void main(String[] args) {
        Calendar calendar = java.util.Calendar.getInstance();
        System.out.println("Сегодня: " + calendar.getTime());
        int today = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Номер дня недели: " + today);
        calendar.set(2001, Calendar.SEPTEMBER, 13);
        System.out.println("Мой день рождения: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 10);
        System.out.println("Через 10 месяцев моего др: " + calendar.getTime());
    }
}
