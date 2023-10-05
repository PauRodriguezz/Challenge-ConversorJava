
package ConversorDecimal;

import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
public class ConvertirNum {
  
    public void ConvertirDecimalABinario(int valor) {
    String binario = Integer.toBinaryString(valor);
    JOptionPane.showMessageDialog(null, valor + " en decimal es equivalente a " + binario + " en binario");
    }
    
    public void ConvertirDecimalAHexadecimal(int valor) {
    String hexadecimal = Integer.toHexString(valor);
    JOptionPane.showMessageDialog(null, valor + " en decimal es equivalente a " + hexadecimal.toUpperCase() + " en hexadecimal");
    }
    
    public void ConvertirDecimalAOctal(int valor) {
    String octal = Integer.toOctalString(valor);
    JOptionPane.showMessageDialog(null, valor + " en decimal es equivalente a " + octal + " en octal");
    }
   
}
