package com.oozinoz.ballistics;

public class Ballistics {
    private static BallisticsFunction rate;

    private static BallisticsFunction thrust;

    /**
     * @return a standard function that models the burn rate of a rocket's fuel
     *         as function of burn time and the peak time when the burn area
     *         reaches its maximum
     */
    public static BallisticsFunction rate() {
        if (rate == null) {
            rate = new BallisticsFunction() {
                public double function(double t, double tPeak) {
                    return .5 * Math.pow(25, -Math.pow((t - tPeak), 2));
                }
            };
        }
        return rate;
    }

    /**
     * @return a standard function that models the thrust of a rocket engine as
     *         a function of burn time and the peak time when the burn area
     *         reaches its maximum
     */
    public static BallisticsFunction thrust() {
        if (thrust == null) {
            thrust = new BallisticsFunction() {
                public double function(double t, double tPeak) {
                    return 1.7 * Math.pow((rate().function(t, tPeak) / .6),
                            (1 / .3));
                }
            };
        }
        return thrust;
    }
}