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
public class ExerciseD {

public static void main (String[] args){
int stones=Integer.valueOf(JOptionPane.showInputDialog("Please type the amount of pounds you want to convert: "));
int pound=(int)(stones*0.45359237);
System.out.print(pound);
    
} 
}
