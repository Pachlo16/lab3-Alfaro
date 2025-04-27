/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author L34217
 */
public class DescuentoCampania implements Descuento{
    private double DescuentoCampa = 0.30;

    @Override
    public double aplicarDescuento(double monto) {
       
        return monto * (1-DescuentoCampa);
    
    }
    
}
