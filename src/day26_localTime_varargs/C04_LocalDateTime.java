package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2023-06-10T11:15:40.187330900

        System.out.println(ldt.toLocalDate()); //2023-06-10
    }
}
