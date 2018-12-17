/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */
public class Lawki extends JLabel{
    private int pozycjaX;
    private int pozycjaY;
    private static List <Lawki> lawki = new ArrayList <Lawki> ();
    public Lawki(int x, int y){
        setBounds(x,y,58,32);
        setIcon(new ImageIcon("obraz\\lawka.png"));
        pozycjaX = x;
        pozycjaY = y;
        lawki.add(this);
    }
    public Lawki(){
        
    }

    public int getPozycjaX() {
        return pozycjaX;
    }

    public int getPozycjaY() {
        return pozycjaY;
    }

    public static List<Lawki> getLawki() {
        return lawki;
    }

    public void setPozycjaX(int pozycjaX) {
        this.pozycjaX = pozycjaX;
    }

    public void setPozycjaY(int pozycjaY) {
        this.pozycjaY = pozycjaY;
    }    
    
}
