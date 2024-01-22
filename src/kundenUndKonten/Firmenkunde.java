package kundenUndKonten;

public class Firmenkunde extends Kunde{

   private String firmenname;

    public Firmenkunde(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public String ausgabeAnzahlKonten(){

        if (getKonten().size() != 1) {
            return " Konten\n";
        } else {
            return " Konto\n";
        }
    }

    @Override
    public String toString() {
        return getFirmenname() + ": " + getKonten().size() + ausgabeAnzahlKonten();
    }
}
