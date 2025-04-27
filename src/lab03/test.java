package lab03;

public class test {

    public static void main(String[] args) {
        

        ServicioHogar servicioHogar = new ServicioHogar(true, "Av. Manuel olguin 600", 5, 20, true, "Joaquin A");
        System.out.println("precio servicio hogar: " + servicioHogar.calcularPrecioFinal());

        ServicioOficina servicioOficina = new ServicioOficina(10, "Av. Manuel olguin 601", 6, 25, true, "Joaquin B");
        System.out.println("precio servicio oficina: " + servicioOficina.calcularPrecioFinal());

        ServicioIndustrial servicioIndustrial = new ServicioIndustrial(1.5, "Av. Manuel olguin 602", 8, 30, true, "Joaquin C");
        System.out.println("precio servicio industrial: " + servicioIndustrial.calcularPrecioFinal());

     
        
        ServicioLimpieza servicioBase = new ServicioHogar(false, "Av. Manuel olguin 603", 5, 20, true, "Joaquin D");
        Descuento descuentoCampania = new DescuentoCampania();
        Descuento descuentoClienteFrecuente = new DescuentoClienteFrecuente();
        double precioConDescuentoCampania = descuentoCampania.aplicarDescuento(servicioBase.calcularPrecioFinal());
        double precioConDescuentoClienteFrecuente = descuentoClienteFrecuente.aplicarDescuento(servicioBase.calcularPrecioFinal());
        System.out.println("precio con campana: " + precioConDescuentoCampania);
        System.out.println("precio con cliente frecuente: " + precioConDescuentoClienteFrecuente);


        ServicioLimpieza servicioConAromatizante = new ConAromatizante(servicioBase);
        ServicioLimpieza servicioConDesinfeccion = new ConDesinfeccion(servicioConAromatizante);
        ServicioLimpieza servicioConLimpiezaVidrios = new ConLimpiezaVidrios(servicioConDesinfeccion);
        System.out.println("precio con aromatizante,desinfeccion,limpieza de vidrios: " + servicioConLimpiezaVidrios.calcularPrecioFinal());

        
        
        ServicioLimpieza servicioCreado = ServicioFactory.crearServicio("hogar", "Av. manuel olguin 604", 4, 22, true, "Joaquin E", true);
        if (servicioCreado != null) {
            System.out.println("servicio factory:");
            System.out.println("tipo: " + servicioCreado.getClass().getSimpleName());
            System.out.println("dirección cliente: " + servicioCreado.direccionCliente);
            System.out.println("duración en horas: " + servicioCreado.duracionHoras);
            System.out.println("tarifa por hora: " + servicioCreado.tarifaHora);
            System.out.println("incluye materiales: " + servicioCreado.incluyeMateriales);
            System.out.println("nombre cliente: " + servicioCreado.nombreCliente);
            System.out.println("precio final: " + servicioCreado.calcularPrecioFinal());
        } else {
            System.out.println("no se pudo crear el servicio.");
        }
    }
}
