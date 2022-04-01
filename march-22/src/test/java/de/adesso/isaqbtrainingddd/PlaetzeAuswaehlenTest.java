package de.adesso.isaqbtrainingddd;

import org.junit.jupiter.api.Test;

public class PlaetzeAuswaehlenTest {

    @Test
    void test() {

        // James Bond 20:00 Uhr
        var vorstellungId = new VorstellungId();
        // Saalplan ermittelt
        var saalplanRepo = new SaalplanRepositoryInMemoryImpl();
        var saalplan = saalplanRepo.getSaalplan(vorstellungId);
        assert saalplan != null; 
        // Platz 7E gewählt
        var sitz = new Sitz('E');
        var reihe = Reihe.of(7);

        Platz platz = new Platz(reihe, sitz);
        Platz saalplanPlatz = saalplan.getPlatz(reihe, sitz);
        assert platz.equals(saalplanPlatz);

        assert saalplanPlatz.isFrei();
        saalplan.waehlePlatzAus(reihe, sitz);
        // Platz für 15 Min. blockiert
        // Platz im Saalplan vergeben markiert

        assert saalplan.getPlatz(reihe, sitz).isBlockiert();
        // Preis für Platz angezeigt
        // Gesamtpreis 12,50 € berechnet


    }
}
