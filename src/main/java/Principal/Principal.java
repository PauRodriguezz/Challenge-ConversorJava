
package Principal;

import ConversorDecimal.OpcionesConversionNum;
import ConversorLongitud.OpcionesConversionLongitud;
import ConversorMonedas.OpcionesConversion;
import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */

public class Principal {
    
    public static void main(String[] args) {
        
        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesConversionLongitud conversionLong = new OpcionesConversionLongitud();
        OpcionesConversionNum conversionNum = new OpcionesConversionNum();
        
       while(true) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
                        new Object[] {"Conversor de Monedas", "Conversor de Longitud", "Conversor de Sistemas Numericos"}, "Elegir").toString(); 
        
                
        switch(opciones){
            case "Conversor de Monedas":
                String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double valorRecibido = Double.parseDouble(input);
		conversion.ConvertirMoneda(valorRecibido);
				
                
		int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
		if(JOptionPane.OK_OPTION == respuesta) {
			System.out.println("Entra");
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
		break;
        
            case "Conversor de Longitud":
                String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		double valorRecibidoL = Double.parseDouble(input1);
		conversionLong.ConvertirLongitud(valorRecibidoL);
				
                
		int respuestaL = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
		if(JOptionPane.OK_OPTION == respuestaL) {
			System.out.println("Entra");
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
                break;
                
            case "Conversor de Sistemas Numericos":
                String input2 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
		int valorRecibidoNum = Integer.parseInt(input2);
                conversionNum.ConvertirNum(valorRecibidoNum);
		
				
		int respuestaNum = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
		if(JOptionPane.OK_OPTION == respuestaNum) {
			System.out.println("Entra");
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
            break; 
        }
       
        
        }    
    }   
}
