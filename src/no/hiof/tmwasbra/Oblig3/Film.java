package no.hiof.tmwasbra.Oblig3;

import java.time.LocalDate;

public class Film extends Produksjon {

    public Film(String tittel, int spilletid, String beskrivelse, LocalDate utgivelsesDato) {
        super(tittel, spilletid, beskrivelse, utgivelsesDato);
    }

    @Override
    public String toString() {
        return "Filmen " + getTittel() + ", den ble lansert " + getUtgivelsesDato() + " varer i " + getSpilletid() + " minutter! " + getBesrkivelse();
    }
}
