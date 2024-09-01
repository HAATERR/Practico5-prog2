

public class Monotributista extends  Contribuyente{

    private double facturadoPorVentas;
    private double porcentajeFacturado;
    private double porcentajeMontoFijo;

    public Monotributista(String nombre,int codigoIdentificacionTributaria,double montoFijoAbonar,double porcentajeFacturado,double porcentajeMontoFijo,double facturadoPorVentas){
        super(nombre,codigoIdentificacionTributaria,montoFijoAbonar);
        this.porcentajeFacturado = porcentajeFacturado;
        this.porcentajeMontoFijo = porcentajeMontoFijo;
        this.facturadoPorVentas = facturadoPorVentas;
    }

    @Override
    public double calcularImpuestosAbonar(){
        return this.getMontoFijo() * this.getPorcentajeMontoFijo() + this.getFacturadoPorVentas() * this.getPorcentajeFacturado();
    }

    public double getFacturadoPorVentas() {
        return this.facturadoPorVentas;
    }

    public double getPorcentajeFacturado() {
        return this.porcentajeFacturado;
    }

    public double getPorcentajeMontoFijo() {
        return this.porcentajeMontoFijo;
    }
}