package kundenUndKonten;

public abstract class Geldeinlage extends Konto{

    double zinssatz;
    int laufzeitMonate;

    public Geldeinlage(String iban, double kontostand, Kunde kunde) {
        super(iban, kontostand, kunde);
    }

    public Geldeinlage(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate) {
        super(iban, kontostand, kunde);
        this.zinssatz = zinssatz;
        this.laufzeitMonate = laufzeitMonate;
    }

    public double getPrognose(){

        return 0;
    };

    public double getZinssatz() {
        return zinssatz/100;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public int getLaufzeitMonate() {
        return laufzeitMonate;
    }

    public void setLaufzeitMonate(int laufzeitMonate) {
        this.laufzeitMonate = laufzeitMonate;
    }
}
