package com.oozinoz.simulation;


public class Skyrocket {
    private double time;

    private double mass;

    private double thrust;

    private double burnTime;

    public Skyrocket(double mass, double thrust, double burnTime) {
        this.burnTime = burnTime;
        this.mass = mass;
        this.thrust = thrust;
    }

    public double getMass() {
        return 0;
    }

    public double getThrust() {
        return 0;
    }

    public void setSimTime(double t) {
        this.time = t;
    }
}