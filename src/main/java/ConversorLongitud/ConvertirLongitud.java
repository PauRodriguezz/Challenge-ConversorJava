
package ConversorLongitud;

import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
public class ConvertirLongitud {
    
    public void ConvertirMetroKilometro(double valor){
        double kilometros = valor / 1000; 
        kilometros = (double) Math.round(kilometros * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " metros son equivalentes a " + kilometros + " kilómetros");
    }
    
    public void ConvertirMetroCentimetro(double valor){
        double centimetros = valor * 100; 
        centimetros = (double) Math.round(centimetros * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " metros son equivalentes a " + centimetros + " centimetros");
    }
    
    public void ConvertirMetroMilimetro(double valor){
        double milimetros = valor * 1000; 
        milimetros= (double) Math.round(milimetros * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " metros son equivalentes a " + milimetros + " milimetros");
    }
    
    public void ConvertirMetroPulgada(double valor){
        double pulgadas = valor * 39.37; 
        pulgadas= (double) Math.round(pulgadas * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " metros son equivalentes a " + pulgadas + " pulgadas");
    }
    
    ///////
    public void ConvertirKilometroMetro(double valor){
        double metros = valor * 1000; 
        metros = (double) Math.round(metros * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + " Kilometros son equivalentes a " + metros + " metros");
    }
    
    public void ConvertirCentimetroMetro(double valor){
        double metros = valor / 100;
        metros = (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "centimetros son equivalentes a " + metros + " metros");
    }
    
    public void ConvertirMilimetroMetro(double valor){
        double metros = valor / 1000;
        metros = (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "milimetros son equivalentes a " + metros + " metros");
    }
    
    public void ConvertirPulgadaMetro(double valor){
        double metros = valor / 39.37;
        metros = (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "pulgadas son equivalentes a " + metros + " metros");
    }
    /////////
    public void ConvertirKilometroCentimetro(double valor){
        double centimetros = valor * 100000;
        centimetros = (double) Math.round(centimetros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "kilometros son equivalentes a " + centimetros + " centimetros");
    }
    
    public void ConvertirCentimetroMilimetro(double valor){
        double milimetros = valor * 10;
        milimetros = (double) Math.round(milimetros *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "centimetros son equivalentes a " + milimetros + " milimetros");
    }
    
}
