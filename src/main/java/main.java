import data_layer.Dog;
import data_layer.Star;

import java.util.HashMap;
import java.util.Map;


public class main {

    public static void main(String[] args) {
        Star sun = new Star("asaf", "hello world", 1, 1, "here", 2.1, 7.9);
        System.out.println(sun.getAveOrbitalSpeed());
        System.out.println();
    }
}
