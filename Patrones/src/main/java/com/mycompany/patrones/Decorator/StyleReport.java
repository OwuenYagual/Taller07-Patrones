/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones.Decorator;

/**
 *
 * @author CltControl
 */
public class StyleReport extends ReportDecorator{
    public StyleReport(Report rep) {
        super(rep);
    }
    @Override
    public void escribirInforme(){
        super.escribirInforme();
        System.out.println("Añadiendo estilos al reporte");
    }
}
