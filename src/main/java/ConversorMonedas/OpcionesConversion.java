
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
                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Peso a Dolar", "De Peso a Euro","De Peso a Reales","De Peso a Pesos Chilenos","De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano",
                        "De Dolar a Peso","De Euro a Peso","De Reales a Peso","De Pesos Chilenos a Peso","De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
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
            
            case "De Pesos a Libras Esterlinas":
		moneda.ConvertirPesosArgentinosLibraEsterlinas(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		moneda.ConvertirPesosArgentinosYen(valor);
		break;
		
	case "De Pesos a Won sub-coreano":
		moneda.ConvertirPesosArgentinosWon(valor);
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
            
            case "De Libras Esterlinas a Pesos":
		moneda.ConvertirLibraEsterlinasPesosArgentinos(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		moneda.ConvertirYenPesosArgentinos(valor);
		break;
		
	case "De Won sub-coreano a Pesos":
		moneda.ConvertirWonPesosArgentinos(valor);
		break;    
                
        }
                
            
    }
    
}
