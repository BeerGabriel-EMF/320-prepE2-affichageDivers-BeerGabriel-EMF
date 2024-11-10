import java.util.Date;

import services.ServiceFormatageDate;
import services.ServiceFormattageNombreEntier;
import services.ServiceFormattageNombreReel;

public class App {
    public static void main(String[] args) throws Exception {
        ServiceFormatageDate serviceFormattageDate = new ServiceFormatageDate();
        System.out.println("------------Affichage Date -----------");
        Date dateAFormatter = new Date();
        System.out.println("Formattage yyyy-MM-dd");
        System.out.println(serviceFormattageDate.formaterDateAAAAMMJJ(dateAFormatter));
        System.out.println("Formattage dd-MM-yyyy");
        System.out.println(serviceFormattageDate.formaterDateJJMMAAAA(dateAFormatter));

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