package de.adesso.isaqbtrainingddd;

import java.util.Objects;

public class Platz {
    private final Reihe reihe;
    private final Sitz sitz;

    public Platz(Reihe reihe, Sitz sitz) {
        this.reihe = reihe;
        this.sitz = sitz;
    }

    public boolean isFrei() {
        return false;
    }

    public boolean isBlockiert() {
        return false;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Platz platz = (Platz) o;
        return reihe.equals(platz.reihe) && sitz.equals(platz.sitz);
    }

    @Override public int hashCode() {
        return Objects.hash(reihe, sitz);
    }
}
