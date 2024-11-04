package services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ServiceFormattageNombreEntier {
    public ServiceFormattageNombreEntier() {
    }

    public String formattageNombreEntier(int nombre) {
        DecimalFormat df = new DecimalFormat("###,### ");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setGroupingSeparator('\'');
        df.setDecimalFormatSymbols(dfs);
        String retour = "";
        retour = df.format(nombre);
        return retour;
    }
}
