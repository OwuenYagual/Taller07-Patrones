/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patrones;
import com.mycompany.patrones.Decorator.*;
/**
 *
 * @author CltControl
 */
public class Patrones {

    public static void main(String[] args) {
        Report colorRep = new ColorReport(new ConcreteReport());
        colorRep.escribirInforme();
        System.out.println("");
        
        Report colorStyleFormReport = new ColorReport(new StyleReport(new FormReport(new ConcreteReport())));
        colorStyleFormReport.escribirInforme();
    }
}
