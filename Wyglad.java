/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class Wyglad extends JFrame{    
    public Wyglad(){
        setSize(310,430);
        setTitle("Kartkówka");
        setLayout(null);  
        setResizable(false);
        add(new Elementy());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
