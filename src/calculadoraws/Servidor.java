/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author BELLAVER
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadoraWS calculadoraWS = new CalculadoraWS();
       String url = "http://localhost:8080/calcws";
        System.out.println("Calculadora Rodando: "+url);
        Endpoint.publish(url,calculadoraWS);
    }
    
}
