package ProvaSCI;

import javax.swing.JOptionPane;

/**
 *
 * @author Marlon Milliorini
 */
public class Java2 {
    public static void main(String[] args) {
        
        int valor1, valor2, maior, menor;

        valor1=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        
        valor2=Integer.parseInt(JOptionPane.showInputDialog("Informe outro numero"));
        
        maior=Math.max(valor1, valor2);
        menor=Math.min(valor1, valor2);
        
        JOptionPane.showMessageDialog(null,"Maior número "+ maior);
        JOptionPane.showMessageDialog(null,"Menor número "+ menor);   
    }
}
