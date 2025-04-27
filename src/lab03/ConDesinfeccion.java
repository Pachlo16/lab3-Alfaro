/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Pachlo16
 */
public class ConDesinfeccion extends ServicioAdicional {

    public ConDesinfeccion(ServicioLimpieza servicioBase) {
        super(servicioBase, servicioBase.direccionCliente, servicioBase.duracionHoras, servicioBase.tarifaHora, servicioBase.incluyeMateriales, servicioBase.nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        return 15 + servicioBase.calcularPrecioFinal();
    }

    @Override
    public String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

