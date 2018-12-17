/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class KonkretnyObserwowany implements Obserwowany{
    private List<NauczycielObserwator> lista = new ArrayList<NauczycielObserwator>();

    @Override
    public void addObserwator(NauczycielObserwator nauczyciel) {
        lista.add(nauczyciel);
    }

    @Override
    public void removeObserwator(NauczycielObserwator nauczyciel) {
        lista.remove(nauczyciel);
    }

    //Promień ma 20 x 300
    @Override
    public void powiadomObserwatorow(int jaX, int jaY) {
        for(NauczycielObserwator nauczyciel : lista){
            if(nauczyciel.getX()<jaX&&nauczyciel.getX()+20>jaX&&nauczyciel.getY()<jaY&&nauczyciel.getY()+300>jaY){
                nauczyciel.aktualizacja("zlapany");
            }
        }
    }
    
}
