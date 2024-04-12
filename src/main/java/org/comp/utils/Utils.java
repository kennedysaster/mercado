package org.comp.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {

    static NumberFormat numberFormat = new
            DecimalFormat("R$#,##0.00", new DecimalFormat("R$#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR"))).getDecimalFormatSymbols());
    public static String doubleString(Double value){

        return numberFormat.format(value);
    }
}
