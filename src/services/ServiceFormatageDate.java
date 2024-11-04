package services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceFormatageDate {

    public String formaterDateAAAAMMJJ(Date date) {
        return formaterDate(date, "dd.MM.yyyy");
    }

    public String formaterDateJJMMAAAA(Date date) {
        return formaterDate(date, "yyyy.MM.dd");
    }

    public String formaterDateJJMMAAAAHHMMSS(Date date) {
        return formaterDate(date, "yyyy.MM.dd HH:mm:ss");
    }

    private String formaterDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
