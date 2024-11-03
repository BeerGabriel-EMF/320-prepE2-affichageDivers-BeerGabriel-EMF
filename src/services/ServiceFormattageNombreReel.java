package services;

import java.text.DecimalFormat;

public class ServiceFormattageNombreReel {
    public ServiceFormattageNombreReel() {
    }

    public String formattageNombreReel(double nombre) {
        DecimalFormat df = new DecimalFormat("###,###.###");
        String retour = "";
        retour = df.format(nombre);
        return retour;
    }
}
