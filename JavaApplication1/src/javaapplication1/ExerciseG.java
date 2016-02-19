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
public class ExerciseG {
    public static void main(String[] args) {
    int n=Integer.valueOf(JOptionPane.showInputDialog("pick a value for n"));
    while (n!=1){
        if (n%2==0)
            n=n/2;
        else 
            n=(n*3)+1;
        System.out.print(" "+n );
        
                
    }
    
        
    
    }
}
