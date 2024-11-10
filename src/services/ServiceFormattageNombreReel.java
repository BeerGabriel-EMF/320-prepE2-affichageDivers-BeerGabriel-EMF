package services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ServiceFormattageNombreReel {
    public ServiceFormattageNombreReel() {
    }

    public String formattageNombreReel(double nombre) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator('\'');
        df.setDecimalFormatSymbols(dfs);
        String retour = "";
        retour = df.format(nombre);
        return retour;
    }
}
