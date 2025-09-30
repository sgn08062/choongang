package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 날짜 포멧형식 변경
        System.out.println(now.format(dtf));

        // 타임존 변경
        LocalDateTime london = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(london);
        System.out.println(london.format(dtf));
    }
}
