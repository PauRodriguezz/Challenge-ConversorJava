
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
    
    public void ConvertirPesosArgentinosLibraEsterlinas(double valor){
        double monedaLibEster = valor / 0.00235;
        monedaLibEster = (double)Math.round(monedaLibEster * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibEster + " Libras Esterlinas");
    }
    
    public void ConvertirPesosArgentinosYen( double valor){
        double monedaYen = valor / 2.4;
        monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + "Yen Japonés");
    } 
    
    public void ConvertirPesosArgentinosWon (double valor){
        double monedaWon = valor / 0.259;
        monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + "Won sub-coreano");
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
    
    public void ConvertirLibraEsterlinasPesosArgentinos(double valor){
        double monedaArgentina = 0.00235 * valor;
        monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
    
    public void ConvertirYenPesosArgentinos(double valor){
        double monedaArgentina = 2.4 * valor;
        monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
    
    public void ConvertirWonPesosArgentinos(double valor){
        double monedaArgentina = 0.259 * valor;
        monedaArgentina = (double)Math.round(monedaArgentina * 100d) /100 ;
	JOptionPane.showMessageDialog(null, "Tienes $ " + monedaArgentina + " Pesos Argentinos");
    }
}
