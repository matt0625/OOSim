package org.example;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2){
        int compVal = Integer.compare(v1.getSpeed(), v2.getSpeed());
        if (compVal == 0){
            return Double.compare(v1.getLocation(), v2.getLocation());
        }
        else { return compVal; }
    }
}
