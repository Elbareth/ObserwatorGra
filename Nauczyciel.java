/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */
//Nauczyciel na 30x30 cm i pole widzenia
public class Nauczyciel extends JLabel{
    private int pozycjaX;
    private int pozycjaY;
    public Nauczyciel(int x, int y){        
        setBounds(x,y,30,30);
        setIcon(new ImageIcon("obraz\\nauczyciel.png"));
        pozycjaX = x;
        pozycjaY = y;
    }

    public void setPozycjaX(int pozycjaX) {
        this.pozycjaX = pozycjaX;
    }

    public void setPozycjaY(int pozycjaY) {
        this.pozycjaY = pozycjaY;
    }

    public int getPozycjaX() {
        return pozycjaX;
    }

    public int getPozycjaY() {
        return pozycjaY;
    }
    
}
