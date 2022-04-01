package de.adesso.isaqbtrainingddd;

import java.util.Set;

public class SaalplanRepositoryInMemoryImpl implements SaalplanRepository {
    
    public Saalplan getSaalplan(VorstellungId vorstellungId) {
        Saalplan saalplan = new Saalplan(Set.of(new Platz(Reihe.of(7), new Sitz('E'))));
        
        return saalplan;
    }
}
