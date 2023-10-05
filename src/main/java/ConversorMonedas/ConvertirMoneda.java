
package ConversorMonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
public class ConvertirMoneda {
    
    public void ConvertirPesosArgentinosDolar (double valor){
        double monedaDolar = valor / 344.82;
	monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }
    
    
    public void ConvertirPesosArgentinosEuro (double valor){
        double monedaEuro = valor / 0.74;
	monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    
    
    public void ConvertirPesosArgentinosReal (double valor){
        double monedaReal = valor / 71.42;
	monedaReal = (double)Math.round(monedaReal * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaReal + " Reales");
    }
    
    public void ConvertirPesosArgentinosPChilenos (double valor){
        double monedaPChilenos = valor / 137.68;
	monedaPChilenos = (double)Math.round(monedaPChilenos * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPChilenos + " Pesos Chilenos");
    }
    
    ///////////////////////////
    public void ConvertirDolarPesosArgentinos (double valor){
        double monedaArgentina = 344.82 * valor;
        monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
    
     public void ConvertirEuroPesosArgentinos (double valor){
        double monedaArgentina = 0.74 * valor;
	monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
     
     public void ConvertirRealPesosArgentinos (double valor){
        double monedaArgentina = 71.42 * valor;
	monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }

   
    public void ConvertirPChilenosPesosArgentinos (double valor){
        double monedaArgentina = 137.68 * valor;
	monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
}
