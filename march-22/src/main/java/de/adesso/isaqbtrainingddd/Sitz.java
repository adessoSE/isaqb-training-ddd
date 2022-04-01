package de.adesso.isaqbtrainingddd;

import java.util.Objects;

public class Sitz {

    private final char sitz;

    public Sitz(char sitz) {
        this.sitz = sitz;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Sitz sitz1 = (Sitz) o;
        return sitz == sitz1.sitz;
    }

    @Override public int hashCode() {
        return Objects.hash(sitz);
    }
}
