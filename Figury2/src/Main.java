/**
 * Created by charl0tte on 21.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Figura[] f = new Figura[10];
        f[0] = new Kwadrat(5);
        f[1] = new Prostokat(8, 7);
        f[2] = new Trojkat(3, 4, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(f[i]);
        }
    }
}
