package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {

    public String tytul;
    public String adresStrony;
    public String szerokosc;
    public String wysokosc;
    public String adresMiniaturki;
    public String adresGrafiki;


    public Infografika(String tekst) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);

        if (m.find())
            tytul = m.group(1);
        else
            tytul = "BRAK";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);

        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "BRAK";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(tekst);

        if (m.find())
            szerokosc = m.group(1);
        else
            szerokosc = "0";

        pat = Pattern.compile("height=\"(.*)\">");
        m = pat.matcher(tekst);

        if (m.find())
            wysokosc = m.group(1);
        else
            wysokosc = "0";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher(tekst);

        if (m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "BRAK";

        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher(tekst);

        if (m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "BRAK";
    }

    public void print() {
        System.out.println("Infografika: \nTytuł: " + tytul + "\nAdres strony: " + adresStrony + "\nAdres grafiki: " + adresGrafiki + "\nAdres miniaturki: " + adresMiniaturki + "\nRozmiary: " + szerokosc + "x" + wysokosc+"\n\n");
    }

}
