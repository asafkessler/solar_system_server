package data_layer;

import java.util.ArrayList;
import java.util.List;

/**
 * AU =  astronomical unit. is a unit of length, roughly the distance from Earth to the Sun 8 min 19 s at light speed 150 million kilometres.
 * M⊕ = Earth mass  = 5.9722×1024 kg .
 * earth year =  365.256363004 days.
 */
public class SolarSystem {

    private List<Star> solarSystem = new ArrayList<Star>();

    public SolarSystem(List<Star> solarSystem) {
        this.solarSystem = solarSystem;
    }

    public List<Star> getSolarSystem() {
        return solarSystem;
    }
}
