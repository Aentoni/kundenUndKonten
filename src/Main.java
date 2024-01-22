import kundenUndKonten.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    private static List<Konto> konten = new ArrayList<>();
    private static List<Kunde> kunden = new ArrayList<>();


    public static void main(String[] args) {
        initDemoData();
        printKonten(konten);
        printKunden(kunden);

        System.out.println("\nKonto mit höchstem Kontostand: \n" + getKontoMitHoechstenKontostand());

    }

    public static void initDemoData() {

        //Kunden anlegen
        Kunde kunde1 = new Privatkunde("Anna", "Musterfrau");
        Kunde kunde2 = new Privatkunde("Max", "Mustermann");
        Kunde kunde3 = new Firmenkunde("Lagerhaus Tulln");

        //Konten anlegen
        Konto girokonto = new Girokonto("AT00786598324571", 3865, kunde1, 400);
        Konto termingeldkonto = new Termingeldkonto("AT00786598324573", 10000.00, kunde1, 2.00, 24);
        Konto sparplankonto = new Sparplankonto("AT00786598324578", 10000.00, kunde2, 2.00, 24, 150);
        Konto girokonto2 = new Girokonto("AT00786598324579", 44444, kunde3);

        //Konten der spezifischen Kontenliste vom Kunden hinzufügen
        kunde1.addKonto(girokonto);
        kunde1.addKonto(termingeldkonto);
        kunde2.addKonto(sparplankonto);
        kunde3.addKonto(girokonto2);

        //Kunden der Gesamtkundenliste hinzufügen
        kunden.add(kunde1);
        kunden.add(kunde2);
        kunden.add(kunde3);

        //Konten der Gesamtkontenliste hinzufügen
        konten.add(girokonto);
        konten.add(termingeldkonto);
        konten.add(girokonto2);
        konten.add(sparplankonto);

        termingeldkonto.einzahlen(500);
    }

    public static void printKonten(Collection<Konto> konten) {
        for (Konto konto : konten) {
            printKonto(konto);
        }
    }

    public static void printKonto(Konto konto) {
        System.out.println(konto);
    }

    public static void printKunden(Collection<Kunde> kunden) {
        for (Kunde kunde : kunden) {
            printKunde(kunde);
        }
    }

    public static void printKunde(Kunde kunde) {
        String konten = "";

        //spezifische Kontenliste vom Kunden ausgeben
        for (Konto konto : kunde.getKonten()) {
            konten += konto.getIban() + " (" + konto.getClass().getSimpleName() + ") \n";
        }
        //Daten vom Kunden inklusive Konten ausgeben
        System.out.println(kunde + konten);
    }

    public static Konto getKontoMitHoechstenKontostand(){
        Konto max = konten.get(0);
        for(Konto k : konten){
            if(max.getKontostand() < k.getKontostand()){
                max = k;
            }
        }
        return max;
    }
}
