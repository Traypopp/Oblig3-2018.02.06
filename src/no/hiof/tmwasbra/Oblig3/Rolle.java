package no.hiof.tmwasbra.Oblig3;

public class Rolle extends Person{
    private String karakterFornavn;
    private String karakterEtternavn;

    public Rolle(String fornnavn, String etternavn, String karakterFornavn, String karakterEtternavn) {
        super(fornnavn, etternavn);
        this.karakterFornavn = karakterFornavn;
        this.karakterEtternavn = karakterEtternavn;
    }

    public String getKarakterFornavn() {
        return karakterFornavn;
    }

    public void setKarakterFornavn(String karakterFornavn) {
        this.karakterFornavn = karakterFornavn;
    }

    public String getKarakterEtternavn() {
        return karakterEtternavn;
    }

    public void setKarakterEtternavn(String karakterEtternavn) {
        this.karakterEtternavn = karakterEtternavn;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +  " spiller " + getKarakterFornavn() + " " + getKarakterEtternavn();
    }
}
