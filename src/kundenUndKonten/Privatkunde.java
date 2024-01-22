package kundenUndKonten;

public class Privatkunde extends Kunde{

   private String vorname;
    private String nachname;

    public Privatkunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
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

        return "\n" + getVorname() + " " + getNachname() + ": " + getKonten().size() + ausgabeAnzahlKonten();
    }
}
