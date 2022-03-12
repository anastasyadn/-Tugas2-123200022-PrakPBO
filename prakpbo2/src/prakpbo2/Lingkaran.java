/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo2;

/**
 *
 * @author Suyoto
 */
public class Lingkaran implements Menghitungbidang{
    double jarijari,phi=3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    @Override
    public double luas() {
      return phi*jarijari*jarijari;
    }

    @Override
    public double keliling() {
        return 2*phi*jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public double getPhi() {
        return phi;
    }
    
}
