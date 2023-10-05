
package ConversorLongitud;

import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
public class OpcionesConversionLongitud {
      ConvertirLongitud Longitud = new ConvertirLongitud();
    
    public void ConvertirLongitud(double valor){
        
        String opcion = JOptionPane.showInputDialog(null, 
                "Seleccione la unidad de longitud que desea convertir", "Longitud", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Metros a Kilometro", "De Metros a Centimetros","De Metro a Milimetro","De Metro a Pulgadas","De Kilometro a Metro","De Centimetro a Metro","De Milimetro a Metro","De Pulgadas a Metros","De Kilometro a Centimetro","De Centimetro a Milimetro"}, 
                        "Seleccion").toString();
        
        
        switch(opcion){
            case "De Metros a Kilometro":
                Longitud.ConvertirMetroKilometro(valor);
                break;
            
            case "De Metros a Centimetros":
                Longitud.ConvertirMetroCentimetro(valor);
                break;
        
            case "De Metro a Milimetro":
                Longitud.ConvertirMetroMilimetro(valor);
                break;
                
            case "De Metro a Pulgadas":
                Longitud.ConvertirMetroPulgada(valor);
                break;
                
            case "De Kilometro a Metro":
                Longitud.ConvertirKilometroMetro(valor);
                break;
                
            case "De Centimetro a Metro":
                Longitud.ConvertirCentimetroMetro(valor);
                break;
                
            case "De Milimetro a Metro":
                Longitud.ConvertirMilimetroMetro(valor);
                break;
                
            case "De Pulgadas a Metros":
                Longitud.ConvertirPulgadaMetro(valor);
                break;
                
            case "De Kilometro a Centimetro":
                Longitud.ConvertirKilometroCentimetro(valor);
                break;
                
            case "De Centimetro a Milimetro":
                Longitud.ConvertirCentimetroMilimetro(valor);
                break;
        }
        
    }
}
