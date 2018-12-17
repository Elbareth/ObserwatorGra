/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

/**
 *
 * @author lenovo
 */
public interface NauczycielObserwator {
    public void aktualizacja(String message);//Gdy dostanie swoją wiadomosc
    //JOptionPane, że się nie powodło i zamyka aplikacje
    public void setPozycja(int x, int y);
    public int getX();
    public int getY();
}
