/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author pauro
 */
//Conversor de sistemas numericos
public class OpcionesConversionNum {
    
    ConvertirNum Numero = new ConvertirNum();
    
    public void ConvertirNum(int valor){
        
        String opcion = JOptionPane.showInputDialog(null, 
                "Seleccione el sistema al que desea convertir", "Numero", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Decimal a Binario", "De Decimal a Hexadecimal","De Decimal a octal"}, 
                        "Seleccion").toString();
        
        
        switch(opcion){
            case "De Decimal a Binario":
                Numero.ConvertirDecimalABinario(valor);
                break;
            
            case "De Decimal a Hexadecimal":
                Numero.ConvertirDecimalAHexadecimal(valor);
                break;
            
            case "De Decimal a octal":
                Numero.ConvertirDecimalAOctal(valor);
                break;
        }
    }}

