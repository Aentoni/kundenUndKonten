package kundenUndKonten;

public abstract class Konto {

    private String iban;
    private double kontostand;

    Kunde kunde;

    public Konto(String iban, double kontostand, Kunde kunde) {
        this.iban = iban;
        this.kontostand = kontostand;
        this.kunde = kunde;
    }

    public void einzahlen(double betrag) {
        this.kontostand += betrag;
        System.out.println(this.kontostand);
    }

    public void auszahlen(double betrag) {
    this.kontostand -= betrag;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }



}
