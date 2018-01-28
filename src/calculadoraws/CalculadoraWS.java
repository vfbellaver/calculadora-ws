/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author BELLAVER
 */
@WebService
public class CalculadoraWS {
    private Calculadora calc = new Calculadora();
    
    @WebMethod
    public double getSoma(double valor1, double valor2){
       return calc.soma(valor1,valor2);
    }
    
    @WebMethod
    public double getSubtrair(double valor1, double valor2){
       return calc.subtrair(valor1,valor2);
    }
    
    @WebMethod
    public double getMultiplica(double valor1, double valor2){
       return calc.multiplica(valor1,valor2);
    }
    
    @WebMethod
    public double getDivide(double valor1, double valor2){
       return calc.divide(valor1,valor2);
    }
    
}
