import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
    }

    public static double pospesek(double nadmorskaV){
        double a = 0;
        double c = 6.674 * Math.pow(10, -11);
        double m = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);
        
        a = (c*m)/((r + nadmorskaV) * (r + nadmorskaV));

        return a;
    }
}