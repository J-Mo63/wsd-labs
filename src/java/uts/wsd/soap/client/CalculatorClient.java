/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

/**
 *
 * @author J-Mo
 */
public class CalculatorClient {
    public static void main(String[] args) {
        Calculator_Service locator = new Calculator_Service();
        Calculator calculator = locator.getCalculatorPort();
        
        System.out.println("2+2 is " + calculator.add(2, 2));
        System.out.println("7-3 is " + calculator.sub(7, 3));
        System.out.println("8*8 is " + calculator.mul(8, 8));
        System.out.println("10/5 is " + calculator.div(10, 5));
    }
}