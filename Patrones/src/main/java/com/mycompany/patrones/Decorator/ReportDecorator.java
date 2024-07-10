/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones.Decorator;

/**
 *
 * @author CltControl
 */
public abstract class ReportDecorator implements Report {
    protected Report report;
    public ReportDecorator(Report rep){
        this.report = rep;
    }
    @Override
    public void escribirInforme(){
        this.report.escribirInforme();
    }
    
}
