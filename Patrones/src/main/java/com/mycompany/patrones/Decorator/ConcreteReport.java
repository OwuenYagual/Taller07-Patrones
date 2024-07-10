/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones.Decorator;

/**
 *
 * @author CltControl
 */
public class ConcreteReport implements Report {

    @Override
    public void escribirInforme() {
        System.out.println("Informe normal escrito");
    }
    
}
