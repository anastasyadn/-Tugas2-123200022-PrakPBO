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
public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;

    public Tabung(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }
    
    
    @Override
    public double volume() {
       return super.luas()*tinggi;
    }

    @Override
    public double luaspermukaan() {
       return 2*super.luas()+2*super.getPhi()*super.getJarijari()*tinggi;
    }
    
}
