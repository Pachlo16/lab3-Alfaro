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
public class ServicioFactory {

    public static ServicioLimpieza crearServicio(String tipo,String direccionCliente,double duracionHoras,double tarifaHora,boolean incluyeMateriales,String nombreCliente,Object EspeExtra) {
        switch (tipo.toLowerCase()) {
            case "hogar":
                if (!(EspeExtra instanceof Boolean)) {
                    throw new IllegalArgumentException("debe ser booleano ");
                }
                return new ServicioHogar((Boolean) EspeExtra,direccionCliente,duracionHoras,tarifaHora,incluyeMateriales,nombreCliente
                );

            case "oficina":
                if (!(EspeExtra instanceof Integer)) {
                    throw new IllegalArgumentException("debe ser entero ");
                }
                return new ServicioOficina((Integer) EspeExtra,direccionCliente,duracionHoras,tarifaHora,incluyeMateriales,nombreCliente
                );

            case "industrial":
                if (!(EspeExtra instanceof Double)) {
                    throw new IllegalArgumentException("debe ser double ");
                }
                return new ServicioIndustrial((Double) EspeExtra,direccionCliente,duracionHoras,tarifaHora,true,nombreCliente
                );

            default:
                throw new IllegalArgumentException("invalido: " + tipo);
        }
    }
}
