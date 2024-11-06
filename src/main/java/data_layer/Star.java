package data_layer;

import java.io.Serializable;

public class Star implements Serializable {

    private String name;
    private String info;
    private double distance; // the distance in light years from the sun.
    private double mass; // the mass of a star in tons.
    private String imgPath;
    private double orbitalPeriod;
    private double aveOrbitalSpeed;

    public Star(String name, String info, double distance, double mass, String imgPath, double orbitalPeriod, double aveOrbitalSpeed) {
        this.name = name;
        this.info = info;
        this.distance = distance;
        this.mass = mass;
        this.imgPath = imgPath;
        this.orbitalPeriod = orbitalPeriod;
        this.aveOrbitalSpeed = aveOrbitalSpeed;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public double getDistance() {
        return distance;
    }

    public double getMass() {
        return mass;
    }

    public double getAveOrbitalSpeed() { return aveOrbitalSpeed; }
}
