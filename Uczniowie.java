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
//O uczniach musimy wiedzieć tylko tyle jaką mają pozycje na mapce
//Uczniowie są zieloni
public class Uczniowie extends JLabel{
    private int pozycjaX;
    private int pozycjaY;
    private static List <Uczniowie> listaUczniow = new ArrayList<Uczniowie>();
    public Uczniowie(int x, int y){        
        setBounds(x,y,20,20);
        setIcon(new ImageIcon("obraz\\uczen.png")); 
        pozycjaX = x;
        pozycjaY = y;
        listaUczniow.add(this);
    }
    public Uczniowie(){
        
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

    public static List<Uczniowie> getListaUczniow() {
        return listaUczniow;
    }
    
}
