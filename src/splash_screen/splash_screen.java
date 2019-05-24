/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash_screen;
import asiap_sport.Login;
import asiap_sport.Splash_screen_loading;
/**
 *
 * @author galih
 */
public class splash_screen {
    public static void main(String[] args) {
        
    
    Login lg = new Login ();
    Splash_screen_loading sp = new Splash_screen_loading();
    sp.setVisible(true);
    
    try{
    for (int i=0; i<=100; i++)
    {
        Thread.sleep(50);
        sp.Time.setText(Integer.toString(i)+"%");
        sp.ProgressBar.setValue(i);
        if (i==100)
        {
            sp.setVisible(false);
            lg.setVisible(true);
        }
    }
} catch (Exception e) {
}}}


