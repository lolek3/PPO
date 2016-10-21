import java.util.Random;

/**
 * Created by charl0tte on 2016-10-18.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        BrylaObrotowa[] bryla = new BrylaObrotowa[15];
        for(int i = 0; i < 5; i++){
            bryla[i] = new Walec(r.nextDouble(), r.nextDouble());
            System.out.println("Bryła nr " + (i+1) + ": " + bryla[i]);
        }
        System.out.println("##############################################");

        for (int a = 0; a < 5; a++) {
            bryla[a] = new Stozek(r.nextDouble(), r.nextDouble());

            System.out.println("Bryła nr " + (a+1) + ": " + bryla[a]);
        }

        System.out.println("##############################################");

        for (int b = 0; b < 5; b++) {
            bryla[b] = new Kula(r.nextDouble(), r.nextDouble());

            System.out.println("Bryła nr " + (b+1) + ": " + bryla[b]);
        }

    }
}
