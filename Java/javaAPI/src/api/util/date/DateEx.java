package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        // 포맷팅
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
        System.out.println(sdf2.format(date));
    }
}
