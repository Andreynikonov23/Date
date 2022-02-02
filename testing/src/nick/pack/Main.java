package nick.pack;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        Date date = new Date(101, 8, 13, 11,30);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());
        date.setMinutes(23);
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getTime());
        System.out.println(today.before(date));
    }
}
