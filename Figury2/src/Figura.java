/**
 * Created by charl0tte on 21.10.2016.
 */
public abstract class Figura {
    double a;
    double b;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double obwod();
    public abstract double pole();
}

class Kwadrat extends Figura {

    public Kwadrat(double a) {
        super(a, 0);
    }

    @Override
    public double obwod() {
        return 4*a;
    }

    @Override
    public double pole() {
        return a*a;
    }

    @Override
    public String toString() {
        return "K (P = " + pole() + ", O = " + obwod() + ")";
    }
}

class Prostokat extends Figura {

    public Prostokat(double a, double b) {
        super(a, b);
    }

    @Override
    public double obwod() {
        return 2*(a+b);
    }

    @Override
    public double pole() {
        return a*b;
    }

    @Override
    public String toString() {
        return "P (P = " + pole() + ", O = " + obwod() + ")";
    }
}

class Trojkat extends Figura {

    double c;

    public Trojkat(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double obwod() {
        return a+b+c;
    }

    @Override
    public double pole() {
        if (a+b<c) return 0;
        if (a+c<b) return 0;
        if (b+c<a) return 0;
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "T (P = " + pole() + ", O = " + obwod() + ")";
    }
}