/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author L34217
 */
public abstract class ServicioAdicional extends ServicioLimpieza {

    protected ServicioLimpieza servicioBase;

    public ServicioAdicional(ServicioLimpieza servicioBase, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.servicioBase = servicioBase;
    }
    
    

    
    @Override
    public abstract double calcularPrecioFinal();
    
    
    public abstract String getDescripcion();
}
