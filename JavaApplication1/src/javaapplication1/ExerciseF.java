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
public class ExerciseF {
public static void main(String[] args) {
int age= Integer.valueOf(JOptionPane.showInputDialog("Please type in your age to confirm purchase"));
if (age<25)
    JOptionPane.showMessageDialog(null,"You are too young to buy alchohol police have been alerted and you will now be assisnated");
else
    JOptionPane.showMessageDialog(null,"Please Provide Id else you will be assasinated");
    ;
        
    }
}
