package services;

import java.text.DecimalFormat;

public class ServiceFormattageNombreEntier {
    public ServiceFormattageNombreEntier() {
    }

    public String formattageNombreEntier(int nombre) {
        DecimalFormat df = new DecimalFormat("###,###");
        String retour = "";
        retour = df.format(nombre);
        return retour;
    }
}
