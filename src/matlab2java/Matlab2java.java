/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matlab2java;

/**
 *
 * @author admin
 */
public class Matlab2java {

    /**
     * @param args the command line arguments
     */
    public static double segitiga(double a, double b, double c, double x) {
        if (x >= a && x < b) {
            return (x - a) / (b - a);
        } else if (x >= b && x < c) {
            return (c - x) / (c - b);
        }
        return 0;
    }
    
    public static double trapesium(double a, double b, double c, double d, double y) {
        if (y >= b && y <= c) {
            return 1;
        } else if (y >= a && y < b) {
            return (y - a) / (b - a);
        } else if (y > c && y <= d) {
            return (d - y) / (d - c);
        }
        return 0;
    }
    
    public static double gabungan(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static double irisan(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        double a = segitiga(0, 20, 40, 10);
        double b = trapesium(0, 20, 40, 60, 30);
        System.out.println(a);
        System.out.println(b);
        //max 
        System.out.println(gabungan(a, b));
        //min
        System.out.println(irisan(a, b));
        
    }
}
