package de.adesso.isaqbtrainingddd;

import java.util.Collection;
import java.util.HashSet;

public class Saalplan {

    private final Collection<Platz> plaetze;

    public Saalplan(Collection<Platz> plaetze) {
        this.plaetze = plaetze;
    }

    public Platz getPlatz(Reihe reihe, Sitz sitz) {
        return plaetze.stream().findAny().orElseThrow();
    }

    public void waehlePlatzAus(Reihe reihe, Sitz sitz) {

    }
}
