package no.hiof.tmwasbra.Oblig3;

public class Person {
    private String fornnavn;
    private String etternavn;


    public Person(String fornnavn, String etternavn) {
        this.fornnavn = fornnavn;
        this.etternavn = etternavn;
    }

    public String getFornnavn() {
        return fornnavn;
    }

    public void setFornnavn(String fornnavn) {
        this.fornnavn = fornnavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    @Override
    public String toString() {
        return fornnavn + " " + etternavn;
    }
}
