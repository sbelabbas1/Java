/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author eia14sb
 */
public class ExercoseE {

public static void main (String[] args){
double speed=Double.valueOf(JOptionPane.showInputDialog("What is the current speed of the vehicle"));
double speedlimit=Double.valueOf(JOptionPane.showInputDialog("What is the current speed limit"));
if (speed>speedlimit)
    JOptionPane.showMessageDialog(null,"you have exceeded the speeding limit");
else
    ;
    
        
}
}
