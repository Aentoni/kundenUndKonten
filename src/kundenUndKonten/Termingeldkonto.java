package kundenUndKonten;

public class Termingeldkonto extends Geldeinlage {


    public Termingeldkonto(String iban, double kontostand, Kunde kunde) {
        super(iban, kontostand, kunde);
    }

    public Termingeldkonto(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate) {
        super(iban, kontostand, kunde, zinssatz, laufzeitMonate);
    }

    @Override
    public void einzahlen(double betrag) throws IllegalArgumentException {
       throw new IllegalArgumentException("Keine Einzahlung bei Termingeldkonten möglich.");
    }

    @Override
    public void auszahlen(double betrag) throws IllegalArgumentException{
        throw new IllegalArgumentException("Keine Auszahlung bei Einlagenkonten möglich.");
    }

    @Override
    public double getPrognose() {
        double zinseszins = getKontostand() * Math.pow(1 + getZinssatz(), getLaufzeitMonate());
        return Math.round(zinseszins * 100.0) / 100.0;
    }
        /*
    getPrognose() errechnet das voraussichtliche Endkapital bei Geldeinlage-Konten. Für
    Termingeldkonten wird die Zinseszins-Formel angewendet. (Kn = K0 * (1 + p)^n).
     */

    @Override
    public String toString() {
        return getIban() + " (Termingeldkonto), Kontostand: " + getKontostand() + ", Zinsatz: " + getZinssatz() + ", Laufzeit: " + getLaufzeitMonate() + ", Prognose: " + getPrognose();
    }

    ;
}

