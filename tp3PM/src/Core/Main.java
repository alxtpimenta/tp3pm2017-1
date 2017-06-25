/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import UI.GraphicUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static boolean ticking = false;
    private static boolean setTime = false;
    private static boolean execution = true;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Clock clock = new Clock();
        GraphicUI ui = new GraphicUI();
        clock.setPassingRate(1000);
        //Action listeners da interface
        while(execution)
        {
        GraphicUI.setTime.addActionListener((ActionEvent e) -> {
            setTime = true;
            ticking = false;
        });
        GraphicUI.stop.addActionListener((ActionEvent e) -> {
            ticking = false;
        });
        GraphicUI.start.addActionListener((ActionEvent e) -> {
            ticking = true;
        });
        
        if(setTime)
        {
            setTime = false;
            clock.setCurrentTime(GraphicUI.setHours(), GraphicUI.setMinutes(), GraphicUI.setSeconds());
            ui.updateTime(clock.getCurrentTime());
        }
            while(ticking)
            {
                Thread.sleep(clock.getPassingRate());
                clock.tick();
                ui.updateTime(clock.getCurrentTime());
            }
        }

    }
    
}
