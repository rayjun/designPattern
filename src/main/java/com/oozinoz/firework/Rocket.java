package com.oozinoz.firework;

import com.oozinoz.utility.Dollars;

public class Rocket extends Firework {
    private double apogee;

    private double thrust;

    public Rocket() {
        
    }

    public Rocket(String name, double mass, Dollars price, double apogee,
            double thrust) {
        super(name, mass, price);
        setApogee(apogee);
        setThrust(thrust);
    }

    public double getApogee() {
        return apogee;
    }

    public void setApogee(double value) {
        apogee = value;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double value) {
        thrust = value;
    }
}