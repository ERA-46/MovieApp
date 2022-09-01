/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author erand
 */
public class Movie {
    
    private float rate;
    private String Name;
    private int year;

    public Movie(float rate, String Name, int year) {
        this.rate = rate;
        this.Name = Name;
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return year;
    }
    
    
}
 