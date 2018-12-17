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
public interface Obserwowany {
    public void addObserwator(NauczycielObserwator nauczyciel);
    public void removeObserwator(NauczycielObserwator nauczyciel);
    public void powiadomObserwatorow(int jaX, int jaY);//Przechodzimy po liscie i wszystkim obserwatorom
    //wysyłamy String. Obserwator robi z tym co chce
    //Powiadamiam obserwatora jesli uczen jest w polu widzenia nauczyciela
    //I nie znajduje się na bezpiecznej pozycji
}
