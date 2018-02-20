package no.hiof.tmwasbra.Oblig3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produksjon {
    private String tittel;
    private int spilletid;
    private String besrkivelse;
    private LocalDate utgivelsesDato;
    private Person ressigjor;
    private ArrayList<Rolle> skuespillerListe = new ArrayList<>();

    public Produksjon(String tittel, int spilletid, String besrkivelse, LocalDate utgivelsesDato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.besrkivelse = besrkivelse;
        this.utgivelsesDato = utgivelsesDato;
    }

    public Produksjon(String tittel, int spilletid) {
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    public ArrayList<Rolle> getSkuespillerListe() {
        return skuespillerListe;
    }

    public void setSkuespillerListe(ArrayList<Rolle> skuespillerListe) {
        this.skuespillerListe = skuespillerListe;
    }

    public Person getRessigjor() {
        return ressigjor;
    }

    public void setRessigjor(Person ressigjor) {
        this.ressigjor = ressigjor;
    }

    public String getBesrkivelse() {
        return besrkivelse;
    }

    public void setBesrkivelse(String besrkivelse) {
        this.besrkivelse = besrkivelse;
    }

    public LocalDate getUtgivelsesDato() {
        return utgivelsesDato;
    }

    public void setUtgivelsesDato(LocalDate utgivelsesDato) {
        this.utgivelsesDato = utgivelsesDato;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }


    public void leggTilRolle(Rolle rolle) {
        skuespillerListe.add(rolle);
    }
    public void leggTilMangeRoller(ArrayList<Rolle> rolle){
        skuespillerListe.addAll(rolle);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
