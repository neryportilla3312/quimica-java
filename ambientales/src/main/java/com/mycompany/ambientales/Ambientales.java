

package com.mycompany.ambientales;

import javax.swing.JOptionPane;

public class Ambientales {

    public static void main(String[] args) {
        
       float precipitacion;
       float temperatura; 
       
       precipitacion = Float.parseFloat(JOptionPane.showInputDialog("Cantidad precipitacion"));
       temperatura = Float.parseFloat(JOptionPane.showInputDialog("Temperatura")); 
       
       
       if((temperatura*2)<precipitacion){
           JOptionPane.showMessageDialog(null,"No existe sequia");
       }else{
           JOptionPane.showMessageDialog(null,"Existe sequia");
       }
  
    }
}
