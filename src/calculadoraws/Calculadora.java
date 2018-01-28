/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraws;

/**
 *
 * @author BELLAVER
 */
public class Calculadora {
    private double total = 0;
    
    public double soma(double valor1, double valor2){
        this.total = valor1 + valor2;
        return this.total;
    }
    
    public double subtrair(double valor1, double valor2){
        this.total = valor1 - valor2;
        return this.total;
    }
    
    public double divide(double valor1, double valor2){
        this.total = valor1 / valor2;
        return this.total;
    }
    
    public double multiplica(double valor1, double valor2){
        this.total = valor1 * valor2;
        return this.total;
    }
}
