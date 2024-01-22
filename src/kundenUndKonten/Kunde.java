package kundenUndKonten;
import java.util.ArrayList;
import java.util.List;

public abstract class Kunde {

      List<Konto> konten = new ArrayList<>();

    public List<Konto> getKonten() {
        return konten;
    }

    public void setKonten(List<Konto> konten) {
        this.konten = konten;
    }

    public void addKonto(Konto konto){
        konten.add(konto);
    }

}
