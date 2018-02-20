package no.hiof.tmwasbra.Oblig3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TvSerie alwaysSunny = new TvSerie("It's Always Sunny In Philadelphia", "The Gang gets a tv show", LocalDate.of(2005, 8,4));
        ArrayList<Rolle> alwaysSunnySpillere = new ArrayList<Rolle>();
        alwaysSunnySpillere.add(new Rolle("Charlie", "Day", "Charlie", "Kelly"));
        alwaysSunnySpillere.add(new Rolle("Glenn", "Howerton", "Dennis", "Reynolds"));
        alwaysSunnySpillere.add(new Rolle("Rob", "McElhenney", "Mac", ""));
        alwaysSunnySpillere.add(new Rolle("Kaitlin", "Olson", "Dee", "Reynolds"));

        Episode episode1 = new Episode(1, 1, "The Gang Gets Racist", 22);
        Episode episode2 = new Episode(2, 1, "Charlie Wants an Abortion", 22);
        Episode episode3 = new Episode(3, 1, "Underage Drinking: A National Concern", 22);
        Episode episode4 = new Episode(4, 1, "Charlie has Cancer", 22);
        episode1.leggTilMangeRoller(alwaysSunnySpillere);
        episode2.leggTilMangeRoller(alwaysSunnySpillere);
        episode3.leggTilMangeRoller(alwaysSunnySpillere);
        episode4.leggTilMangeRoller(alwaysSunnySpillere);

        alwaysSunny.leggTilEpisode(episode1);
        alwaysSunny.leggTilEpisode(episode2);
        alwaysSunny.leggTilEpisode(episode3);
        alwaysSunny.leggTilEpisode(episode4);

        alwaysSunny.leggTilEpisode(new Episode(1, 2, "Charlie Gets Crippled", 22));
        alwaysSunny.leggTilEpisode(new Episode(2, 2, "The Gang Goes Jihad", 22));
        alwaysSunny.leggTilEpisode(new Episode(3, 2, "Dennis and Dee Go on Welfare", 22));


        ArrayList<Episode> episodeListe = alwaysSunny.getEpisodeListe();

        System.out.println("******************************");

        System.out.println(alwaysSunny);
        System.out.println("------------------------------");

        for (Episode episode : episodeListe) {
            System.out.println(episode);
        }

        System.out.println("******************************");

        TvSerie friends = new TvSerie("Friends", "So no one told you life was gonna be this waayyyyyy.", LocalDate.of(1994, 9, 22));

        Random randomTallGenerator = new Random();

        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 20; episodeNr++) {

                friends.leggTilEpisode(new Episode(episodeNr, sesongNr, "Episode Tittel ", randomTallGenerator.nextInt(11) + 20));
            }
        }

        ArrayList<Episode> friendsSesong4Episoder = friends.hentEpisoderISesong(4);

        System.out.println("******************************");

        System.out.println(friends);
        System.out.println("Gjennomsnittligspilletid ");
        System.out.println("------------------------------");

        for (Episode episode : friendsSesong4Episoder) {
            System.out.println(episode);
        }

        System.out.println("******************************");

        friends.leggTilEpisode(new Episode(1, 10, "EpisodeISesong10", 50));

        System.out.println("******************************");

        Film jaws = new Film("Jaws", 130, "Jaws is a movie which makes sharks hella scary damn.", LocalDate.of(1976,2,16));
        Film paddington2 = new Film("Paddington 2", 104, "Paddington 2 is an adorable movie with 100% on rottentomatoes, its cute.", LocalDate.of(2017,11,9));

        System.out.println("Filmen " + jaws.getTittel() + ", den ble lansert " + jaws.getUtgivelsesDato() + ", den varer i " + jaws.getSpilletid() + " minutter. " + jaws.getBesrkivelse());
        System.out.println("Filmen " + paddington2.getTittel() + ", den ble lansert " + paddington2.getUtgivelsesDato() + ", den varer i " + paddington2.getSpilletid() + " minutter. " + paddington2.getBesrkivelse());

        System.out.println("******************************");
        jaws.leggTilRolle(new Rolle("Jaws", "The Animatronic", "Jaws", "the Shark"));
        jaws.setRessigjor(new Person("Maker of", "Jaws"));

        System.out.println("Ressigjør: " + jaws.getRessigjor());
        System.out.println(jaws.getSkuespillerListe());
        System.out.println(alwaysSunny.hentCast());

    }
}
