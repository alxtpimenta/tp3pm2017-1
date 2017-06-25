/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author alex
 */
public class GraphicUI {
    
    private static JFrame mainWindow;
    private static JLabel timeLabel;
    public static JButton setTime;
    public static JButton start;
    public static JButton stop;
    
    public GraphicUI()
    {
        mainWindow = new JFrame("Clock");
        mainWindow.setSize(300, 150);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);
        
        setTime = new JButton("Set");
        setTime.setBounds(10, 10, 60, 30);
        
        start = new JButton("Start");
        start.setBounds(110, 10, 60, 30);
        
        stop = new JButton("Stop");
        stop.setBounds(230, 10, 60, 30);
        
        Font medium = new Font("SansSerif", Font.BOLD, 30);
        timeLabel = new JLabel("Time");
        timeLabel.setBounds(30, 50, 150, 80);
        timeLabel.setText("00:00:00");
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setVerticalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(medium);
        timeLabel.setForeground(Color.black);
        
        
        mainWindow.add(stop);
        mainWindow.add(setTime);
        mainWindow.add(start);
        mainWindow.add(timeLabel);
        
        mainWindow.repaint();
    }
    
    public void refreshUI()
    {
        mainWindow.repaint();
    }
    
    public void updateTime(String time)
    {
        timeLabel.setText(time);
    }
    
    public static int setHours()
    {
        int output = -1;
        String input;
        while(output < 0 || output > 24)
        {
            input = JOptionPane.showInputDialog("Hours (0 to 24)");
            output = Integer.parseInt(input);
        }
        return output;
    }
    
    public static int setMinutes()
    {
        int output = -1;
        String input;
        while(output < 0 || output > 60)
        {
            input = JOptionPane.showInputDialog("Minutes (0 to 60)");
            output = Integer.parseInt(input);
        }
        return output;
    }
    
    public static int setSeconds()
    {
        int output = -1;
        String input;
        while(output < 0 || output > 60)
        {
            input = JOptionPane.showInputDialog("Seconds (0 to 60)");
            output = Integer.parseInt(input);
        }
        return output;
    }
}
