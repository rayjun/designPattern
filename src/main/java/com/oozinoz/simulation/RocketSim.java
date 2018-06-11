package com.oozinoz.simulation;

public interface RocketSim {
    abstract double getMess();
    public double getThrust();
    void setSimTime(double t);
}