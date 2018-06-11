package com.oozinoz.firework;

import com.oozinoz.simulation.*;

//对象适配模式
public class OozinozSkyrocket extends Skyrocket {

    private PhysicalRocket rocket;

    private double time;

    public OozinozSkyrocket(PhysicalRocket r) {
        super(r.getMass(0), r.getThrust(0), r.getBurnTime());
        rocket = r;
    }

    @Override
    public double getMass() {
        return rocket.getMass(this.time);
    }

    @Override
    public double getThrust() {
        return rocket.getThrust(this.time);
    }
    

    public void setTime(double t) {
        this.time = t;
    }
}