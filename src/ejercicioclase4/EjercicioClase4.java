
package ejercicioclase4;

import javax.swing.JOptionPane;

public class EjercicioClase4 {

   
    public static void main(String[] args) {
               int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
               
               if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Es mayor de edad " );
        }
               else{
                   JOptionPane.showMessageDialog(null, "Es menor de edad " );
               }

    }
    
}
