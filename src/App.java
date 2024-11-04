import java.util.Date;

import services.ServiceFormatageDate;
import services.ServiceFormattageNombreEntier;
import services.ServiceFormattageNombreReel;

public class App {
    public static void main(String[] args) throws Exception {
        ServiceFormatageDate serviceFormattageDate = new ServiceFormatageDate();
        System.out.println("------------Affichage Date -----------");
        Date dateAFormatter = new Date();
        String format1 = "yyyy-MM-dd";
        String format2 = "dd-MM-yyyy";
        System.out.println("Formattage yyyy-MM-dd");
        System.out.println(serviceFormattageDate.formatageDate(dateAFormatter, format1));
        System.out.println("Formattage dd-MM-yyyy");
        System.out.println(serviceFormattageDate.formatageDate(dateAFormatter, format2));

        System.out.println("-------Formattage nombre entier---------");
        ServiceFormattageNombreEntier serviceFormattageNombreEntier = new ServiceFormattageNombreEntier();
        int nombre = 123456789;
        System.out.println(serviceFormattageNombreEntier.formattageNombreEntier(nombre));

        System.out.println("-------Formattage nombre reel---------");
        ServiceFormattageNombreReel serviceFormattageNombreReel = new ServiceFormattageNombreReel();
        double nombre2 = 123456.789;
        System.out.println(serviceFormattageNombreReel.formattageNombreReel(nombre2));
    }
}