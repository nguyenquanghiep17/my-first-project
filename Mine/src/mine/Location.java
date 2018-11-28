/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mine;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Location implements Comparable<Location>{
    public int x;
    public int y;

    public Location(int a, int b) {
        this.x = new Random().nextInt(a);
        this.y = new Random().nextInt(b);
    }






    @Override
    public int compareTo(Location o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        Location location = (Location) obj;
        if (this.x == location.x && this.y == location.y) {
            return true;
        }
        return false;
    }


    
    
    
}
