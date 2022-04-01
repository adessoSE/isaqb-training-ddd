package de.adesso.isaqbtrainingddd;

import org.junit.jupiter.api.Test;

public class PlaetzeAuswaehlenTest {

    @Test
    void test() {

        // James Bond 20:00 Uhr
        var vorstellung = new Vorstellung();
        // Saalplan ermittelt
        var saalplan = vorstellung.getSaalplan();
        // Platz 7E gewählt
        var sitz = new Sitz('E');
        var reihe = new Reihe(7);
        assert saalplan.getPlatz(reihe, sitz).isFrei();
        saalplan.waehlePlatzAus(reihe, sitz);
        // Platz für 15 Min. blockiert
        // Platz im Saalplan vergeben markiert

        assert saalplan.getPlatz(reihe, sitz).isBlockiert();
        // Preis für Platz angezeigt
        // Gesamtpreis 12,50 € berechnet


    }
}
