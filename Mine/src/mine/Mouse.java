/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mine;

import java.awt.event.MouseAdapter;

/**
 *
 * @author Admin
 */
public abstract class Mouse extends MouseAdapter{
    public int i;
    public int j;
    public Mouse(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
}
