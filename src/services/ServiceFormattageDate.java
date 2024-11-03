package services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceFormattageDate {

    public ServiceFormattageDate() {
    }

    public String formattageDate(Date dateAFormatter, String format) {
        SimpleDateFormat formatFinal = new SimpleDateFormat(format);
        String retour = formatFinal.format(dateAFormatter);
        return retour;
    }

}
