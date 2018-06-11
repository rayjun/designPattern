package com.oozinoz.firework;

import com.oozinoz.simulation.*;


//接口适配器模式
public class OozinozRocket extends PhysicalRocket implements RocketSim {

    private double time;

    public OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
       super(burnArea, burnRate, fuelMass, totalMass);
    }

	public double getMess() {
		return super.getMass(this.time);
	}

	public double getThrust() {
		return super.getThrust(this.time);
	}

	public void setSimTime(double t) {
		this.time = t;
	}

}