/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class Elementy extends JPanel{    
    private JLabel tlo;
    private KeyListener listener;
    private Ja ja;
    private Kujon kujon;
    private Nauczyciel nauczyciel;
    private Integer licznik = 0;
    private JLabel numer;
    private Obserwowany obserwowany;
    private NauczycielObserwator obserwator;
    //private List <Uczniowie> listaUczniow = new ArrayList <Uczniowie> ();
    public Elementy(){
        obserwowany = new KonkretnyObserwowany();
        obserwator = new KonkretnyNauczycielObserwator();
        obserwowany.addObserwator(obserwator);
        setSize(310,430);        
        tlo = new JLabel(new ImageIcon("obraz\\sala.jpg"));
        tlo.setBounds(0,0,300,400);
        add(tlo); 
        numer = new JLabel(licznik.toString());
        numer.setFont(new Font("Brush Script MT kursywa",Font.BOLD,30));
        numer.setBounds(200,0,150,100);
        tlo.add(numer);
        tlo.add(new Uczniowie(35,120));
        tlo.add(new Uczniowie(67,120));
        tlo.add(new Uczniowie(125,120));
        tlo.add(new Uczniowie(157,120));
        tlo.add(new Uczniowie(215,120));
        tlo.add(new Uczniowie(247,120));
        //Drugi rząd
        tlo.add(new Uczniowie(35,175));
        tlo.add(new Uczniowie(67,175));
        tlo.add(new Uczniowie(125,175));
        tlo.add(new Uczniowie(157,175));
        tlo.add(new Uczniowie(215,175));
        tlo.add(new Uczniowie(247,175));
        //Trzeci rząd - przed ostatni to kujon!!!!
        tlo.add(new Uczniowie(35,240));
        tlo.add(new Uczniowie(67,240));
        tlo.add(new Uczniowie(125,240));
        tlo.add(new Uczniowie(157,240));
        kujon = new Kujon(215,240);
        tlo.add(kujon);//Kujon!!!
        tlo.add(new Uczniowie(247,240));
        //Czwarty rząd
        tlo.add(new Uczniowie(35,295));
        tlo.add(new Uczniowie(67,295));
        tlo.add(new Uczniowie(125,295));
        tlo.add(new Uczniowie(157,295));
        tlo.add(new Uczniowie(215,295));
        tlo.add(new Uczniowie(247,295));
        //Piaty rząd
        tlo.add(new Uczniowie(35,355));
        tlo.add(new Uczniowie(67,355));
        tlo.add(new Uczniowie(125,355));
        tlo.add(new Uczniowie(157,355));
        ja = new Ja(215,355);
        tlo.add(ja);// ja i koło mnie nikogo nie ma   
        //nauczyciel
        nauczyciel = new Nauczyciel(90,160);
        tlo.add(nauczyciel);
        tlo.add(new Promien(90,160));
        obserwator.setPozycja(95, 180); // x+5 y+20
        //ławki pierwszy rząd
        tlo.add(new Lawki(31,86));
        tlo.add(new Lawki(118,86));
        tlo.add(new Lawki(213,86));
        //Drugi rząd
        tlo.add(new Lawki(31,146));
        tlo.add(new Lawki(118,146));
        tlo.add(new Lawki(213,146));
        //Trzeci rzad
        tlo.add(new Lawki(31,208));
        tlo.add(new Lawki(118,208));
        tlo.add(new Lawki(213,208));
        //Czwarty rzad
        tlo.add(new Lawki(30,264));
        tlo.add(new Lawki(118,264));
        tlo.add(new Lawki(212,265));
        //Piaty rzad
        tlo.add(new Lawki(31,323));
        tlo.add(new Lawki(118,323));
        tlo.add(new Lawki(213,323));
        setVisible(true);
        listener = new KeyLis();
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(listener);
    }
    class KeyLis extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            int x = ja.getPozycjaX();
            int y = ja.getPozycjaY();
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:    
                    if(x == 0) break;
                    if(checkLewo() == false) break;
                    Container parent = ja.getParent();
                    parent.remove(ja);
                    parent.repaint();
                    ja = new Ja(x-1,y);
                    tlo.add(ja);
                    repaint(); 
                    obserwowany.powiadomObserwatorow(ja.getPozycjaX(), ja.getPozycjaY());
                    break;
                case KeyEvent.VK_RIGHT: 
                    if(x == 280) break;
                    if(checkPrawo() == false) break;
                    Container parentP = ja.getParent();
                    parentP.remove(ja);
                    parentP.repaint();
                    ja = new Ja(x+1,y);
                    tlo.add(ja);
                    repaint(); 
                    obserwowany.powiadomObserwatorow(ja.getPozycjaX(), ja.getPozycjaY());
                    break;  
                case KeyEvent.VK_DOWN:
                    if(y == 380) break;
                    if(checkDol() == false) break;
                    Container parentD = ja.getParent();
                    parentD.remove(ja);
                    parentD.repaint();
                    ja = new Ja(x,y+1);
                    tlo.add(ja);
                    repaint();
                    obserwowany.powiadomObserwatorow(ja.getPozycjaX(), ja.getPozycjaY());                    
                    break;
                case KeyEvent.VK_UP:
                    if(y == 0) break;
                    if(checkGora() == false) break;
                    Container parentG = ja.getParent();
                    parentG.remove(ja);
                    parentG.repaint();
                    ja = new Ja(x,y-1);
                    tlo.add(ja);
                    repaint(); 
                    obserwowany.powiadomObserwatorow(ja.getPozycjaX(), ja.getPozycjaY());
                    break;
                case KeyEvent.VK_SPACE:
                    if(ja.getPozycjaX()>kujon.getPozycjaX()-40&&ja.getPozycjaX()<kujon.getPozycjaX()+40&&ja.getPozycjaY()>kujon.getPozycjaY()-40&&ja.getPozycjaY()<kujon.getPozycjaY()+40){
                        licznik++;
                        numer.setText(licznik.toString());
                        if(licznik == 500){
                            JOptionPane.showMessageDialog(null,"Gratuluje zdałeś test");
                            System.exit(0);
                        }
                    }
                    obserwowany.powiadomObserwatorow(ja.getPozycjaX(), ja.getPozycjaY());
            }                    
        }
    }    
    public boolean checkLewo(){
        boolean itIsOK = true;
        Uczniowie uczniowie = new Uczniowie();
        List <Uczniowie> lista = uczniowie.getListaUczniow();
        Lawki lawki = new Lawki();
        List <Lawki> listaLawek = lawki.getLawki();
        for(Uczniowie u : lista){
            if(ja.getPozycjaX()==u.getPozycjaX()+20&&ja.getPozycjaY()>=u.getPozycjaY()&&ja.getPozycjaY()<=u.getPozycjaY()+20){                
                itIsOK = false;
            }
        }
        for(Lawki l : listaLawek){            
            if(ja.getPozycjaX()==l.getPozycjaX()+58&&ja.getPozycjaY()>=l.getPozycjaY()&&ja.getPozycjaY()<=l.getPozycjaY()+32){               
                itIsOK = false;
            }
        }
        if(ja.getPozycjaX()==kujon.getPozycjaX()+20&&ja.getPozycjaY()>=kujon.getPozycjaY()&&ja.getPozycjaY()<=kujon.getPozycjaY()+20){
            itIsOK = false;
        }
        if(ja.getPozycjaX()==nauczyciel.getPozycjaX()+30&&ja.getPozycjaY()>=nauczyciel.getPozycjaY()&&ja.getPozycjaY()<=nauczyciel.getPozycjaY()+30){         
                itIsOK = false;
        }
        return itIsOK;
    }
    public boolean checkPrawo(){
        boolean itIsOK = true;
        Uczniowie uczniowie = new Uczniowie();
        List <Uczniowie> lista = uczniowie.getListaUczniow();
        Lawki lawki = new Lawki();
        List <Lawki> listaLawek = lawki.getLawki();
        for(Uczniowie u : lista){
            if(ja.getPozycjaX()+20==u.getPozycjaX()&&ja.getPozycjaY()>=u.getPozycjaY()&&ja.getPozycjaY()<=u.getPozycjaY()+20){         
                itIsOK = false;
            }
        }
        for(Lawki l : listaLawek){
            if(ja.getPozycjaX()+20==l.getPozycjaX()&&ja.getPozycjaY()>=l.getPozycjaY()&&ja.getPozycjaY()<=l.getPozycjaY()+32){         
                itIsOK = false;
            }
        }
        if(ja.getPozycjaX()+20==kujon.getPozycjaX()&&ja.getPozycjaY()>=kujon.getPozycjaY()&&ja.getPozycjaY()<=kujon.getPozycjaY()+20){         
                itIsOK = false;
        }
        if(ja.getPozycjaX()+20==nauczyciel.getPozycjaX()&&ja.getPozycjaY()>=nauczyciel.getPozycjaY()&&ja.getPozycjaY()<=nauczyciel.getPozycjaY()+30){         
                itIsOK = false;
        }
        return itIsOK;
    }
    public boolean checkGora(){
        boolean itIsOK = true;
        Uczniowie uczniowie = new Uczniowie();
        List <Uczniowie> lista = uczniowie.getListaUczniow();
        Lawki lawki = new Lawki();
        List <Lawki> listaLawek = lawki.getLawki();
        for(Uczniowie u : lista){
            if(ja.getPozycjaY()==u.getPozycjaY()+20&&ja.getPozycjaX()>=u.getPozycjaX()&&ja.getPozycjaX()<=u.getPozycjaX()+20){         
                itIsOK = false;
            }
        }
        for(Lawki l : listaLawek){
            if(ja.getPozycjaY()==l.getPozycjaY()+32&&ja.getPozycjaX()>=l.getPozycjaX()&&ja.getPozycjaX()<=l.getPozycjaX()+58){         
                itIsOK = false;
            }
        }
        if(ja.getPozycjaY()==kujon.getPozycjaY()+20&&ja.getPozycjaX()>=kujon.getPozycjaX()&&ja.getPozycjaX()<=kujon.getPozycjaX()+20){         
                itIsOK = false;
        }
        if(ja.getPozycjaY()==nauczyciel.getPozycjaY()+30&&ja.getPozycjaX()>=nauczyciel.getPozycjaX()&&ja.getPozycjaX()<=nauczyciel.getPozycjaX()+30){         
                itIsOK = false;
        }
        return itIsOK;
    }
    public boolean checkDol(){
        boolean itIsOK = true;
        Uczniowie uczniowie = new Uczniowie();
        List <Uczniowie> lista = uczniowie.getListaUczniow();
        Lawki lawki = new Lawki();
        List <Lawki> listaLawek = lawki.getLawki();
        for(Uczniowie u : lista){
            if(ja.getPozycjaY()+20==u.getPozycjaY()&&ja.getPozycjaX()>=u.getPozycjaX()&&ja.getPozycjaX()<=u.getPozycjaX()+20){         
                itIsOK = false;
            }
        }
        for(Lawki l : listaLawek){
            if(ja.getPozycjaY()+20==l.getPozycjaY()&&ja.getPozycjaX()>=l.getPozycjaX()&&ja.getPozycjaX()<=l.getPozycjaX()+58){         
                itIsOK = false;
            }
        }
        if(ja.getPozycjaY()==kujon.getPozycjaY()+20&&ja.getPozycjaX()>=kujon.getPozycjaX()&&ja.getPozycjaX()<=kujon.getPozycjaX()+20){         
                itIsOK = false;
        }
        if(ja.getPozycjaY()==nauczyciel.getPozycjaY()+20&&ja.getPozycjaX()>=nauczyciel.getPozycjaX()&&ja.getPozycjaX()<=nauczyciel.getPozycjaX()+30){         
                itIsOK = false;
        }
        return itIsOK;
    }
}
