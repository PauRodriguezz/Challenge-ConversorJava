
package ConversorMonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
public class OpcionesConversion {
    
    ConvertirMoneda moneda = new ConvertirMoneda();
    
    public void ConvertirMoneda(double valor){
        
        String opcion = JOptionPane.showInputDialog(null, 
                "Seleccione la moneda que desea convertir", "Moneda", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Peso a Dolar", "De Peso a Euro","De Peso a Reales","De Peso a Pesos Chilenos","De Dolar a Peso","De Euro a Peso","De Reales a Peso","De Pesos Chilenos a Peso"}, 
                        "Seleccion").toString();
        
        
        switch(opcion){
            case "De Peso a Dolar":
                moneda.ConvertirPesosArgentinosDolar(valor);
                break;
                
            case "De Peso a Euro":
                moneda.ConvertirPesosArgentinosEuro(valor);
                break;
                
            case "De Peso a Reales":
                moneda.ConvertirPesosArgentinosReal(valor);
                break;
                
            case "De Peso a Pesos Chilenos":
                moneda.ConvertirPesosArgentinosPChilenos(valor);
                break;
                
            case "De Dolar a Peso":
                moneda.ConvertirDolarPesosArgentinos(valor);
                break;
                
            case "De Euro a Peso":
                moneda.ConvertirEuroPesosArgentinos(valor);
                break;
            
            case "De Reales a Peso":
                moneda.ConvertirRealPesosArgentinos(valor);
                break;
            
            case "De Pesos Chilenos a Peso":
                moneda.ConvertirPChilenosPesosArgentinos(valor);
                break;
        }
                
            
    }
    
}
