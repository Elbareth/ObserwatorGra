/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class KonkretnyNauczycielObserwator implements NauczycielObserwator{
    private int x;
    private int y;
    @Override
    public void aktualizacja(String message) {
        if(message.equals("zlapany")){
            JOptionPane.showMessageDialog(null,"Przykro mi! Zostałeś złapany");
            System.exit(0);
        }
    }

    @Override
    public void setPozycja(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
       return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
    
}
