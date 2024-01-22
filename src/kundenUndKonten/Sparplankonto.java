package kundenUndKonten;

public class Sparplankonto extends Geldeinlage{

    double sparbetragMonatlich;

    public Sparplankonto(String iban, double kontostand, Kunde kunde, double sparbetragMonatlich) {
        super(iban, kontostand, kunde);
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    public Sparplankonto(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate, double sparbetragMonatlich) {
        super(iban, kontostand, kunde, zinssatz, laufzeitMonate);
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    public Sparplankonto(String iban, double kontostand, Kunde kunde) {
        super(iban, kontostand, kunde);
    }

    public double getSparbetragMonatlich() {
        return sparbetragMonatlich;
    }

    public void setSparbetragMonatlich(double sparbetragMonatlich) {
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    @Override
    public void auszahlen(double betrag) {
        System.out.println("Keine Auszahlung bei Einlagenkonten möglich.");
    }

    @Override
    public double getPrognose() {

        return getKontostand() + this.sparbetragMonatlich * getLaufzeitMonate();
    }
    /*
    getPrognose() errechnet das voraussichtliche Endkapital bei Geldeinlage-Konten. Bei Sparplankonten wird
    einfachheitshalber der Zinssatz nicht berücksichtigt.
     */

    @Override
    public String toString() {
        return getIban() + " (Sparplankonto), Kontostand: " + getKontostand() + ", Zinsatz: " + getZinssatz() + ", Laufzeit: " + getLaufzeitMonate() + ", Sparplan: " + getSparbetragMonatlich() + ", Prognose: " + getPrognose();
    }

}
