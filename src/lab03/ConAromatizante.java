/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author L34217
 */
public class ConAromatizante extends ServicioAdicional {

    public ConAromatizante(ServicioLimpieza servicioBase) {
        super(servicioBase, servicioBase.direccionCliente, servicioBase.duracionHoras, servicioBase.tarifaHora, servicioBase.incluyeMateriales, servicioBase.nombreCliente);
    }


    @Override
    public double calcularPrecioFinal() {
        return 5 + servicioBase.calcularPrecioFinal();
    }

    @Override
    public String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

