package de.adesso.isaqbtrainingddd;

import java.util.Objects;

public class Reihe {

    private final int reihe;

    private Reihe(int reihe) {
        this.reihe = reihe;
    }

    public static Reihe of(int reihe){
        return new Reihe(reihe);
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reihe reihe1 = (Reihe) o;
        return reihe == reihe1.reihe;
    }

    @Override public int hashCode() {
        return Objects.hash(reihe);
    }
}
