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
//Mogę się ruszać za pomocą strzałek.
//Nie mogę wchodzić na ławki i być złapaną przez nauczyciela
public class Ja extends JLabel{
    private int pozycjaX;
    private int pozycjaY;
    public Ja(int x, int y){
        setBounds(x,y,20,20);
        setIcon(new ImageIcon("obraz\\ja.png"));
        pozycjaX=x;
        pozycjaY=y;
    }

    public int getPozycjaX() {
        return pozycjaX;
    }

    public int getPozycjaY() {
        return pozycjaY;
    }

    public void setPozycjaX(int pozycjaX) {
        this.pozycjaX = pozycjaX;
    }

    public void setPozycjaY(int pozycjaY) {
        this.pozycjaY = pozycjaY;
    }
    
}
