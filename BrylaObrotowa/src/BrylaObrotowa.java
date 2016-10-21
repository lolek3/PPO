/**
 * Created by charl0tte on 2016-10-18.
 */
public abstract class BrylaObrotowa {
    double r;
    double h;
    double pi = Math.PI;

    public BrylaObrotowa(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public abstract double powierzchnia();

    public abstract double objetosc();
}

class Walec extends BrylaObrotowa {
    public Walec(double r, double h) {
        super(r, h);
    }

    @Override
    public double powierzchnia() {
        return 2*pi*r*(r+h);
    }

    @Override
    public double objetosc() {
        return pi*r*h;
    }

    @Override
    public String toString() {
        return "Walec(P = "+Math.round(powierzchnia()*100.0)/100.0+", O = "+Math.round(objetosc()*100.0)/100.0+")";
    }
}

class Stozek extends BrylaObrotowa {
    public Stozek(double r, double h) {
        super(r, h);
    }

    @Override
    public double powierzchnia() {
        return pi*r*(r+(Math.sqrt(r*r*h*h)));
    }

    @Override
    public double objetosc() {
        return pi*r*r*h/3;
    }

    @Override
    public String toString() {
        return "Stozek(P = "+Math.round(powierzchnia()*100.0)/100.0+", O = "+Math.round(objetosc()*100.0)/100.0+")";
    }
}

class Kula extends BrylaObrotowa {

    public Kula(double r, double h) { super(r, h = 1.00); }

    @Override
    public double powierzchnia() { return 4 * pi * r * r; }

    @Override
    public double objetosc() { return 4/3 * pi * r * r *r; }

    @Override
    public String toString() {
        return "Kula (P = " + Math.round(powierzchnia()*100.00)/100.00 + ", O = " + Math.round(objetosc()*100.00)/100.00 + ") ";
    }
}