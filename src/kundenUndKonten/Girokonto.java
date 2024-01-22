package kundenUndKonten;

public class Girokonto extends Konto {

    double disporahmen;

    public Girokonto(String iban, double kontostand, Kunde kunde) {
        super(iban, kontostand, kunde);
    }

    public double getDisporahmen() {
        return disporahmen;
    }

    public void setDisporahmen(double disporahmen) {
        this.disporahmen = disporahmen;
    }


    @Override
    public void auszahlen(double betrag) {

        if ( betrag < this.disporahmen){
            super.auszahlen(betrag);
        } else {
            System.out.println("Auszahlung konnte nicht getätigt werden, da Disporahmen zu klein.");
        }
    }

    @Override
    public String toString() {
        return getIban() + " (Girokonto), Kontostand: " + getKontostand();
    };

};
