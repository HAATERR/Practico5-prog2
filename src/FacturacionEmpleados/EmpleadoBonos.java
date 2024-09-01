public class EmpleadoBonos extends EmpleadoVentas{
    private int bono;
    private int cantVentasPremio;

    public EmpleadoBonos(int bono, int cantVentasPremio, String nombre, int dni, double sueldo, int porcentajexventas){
        super(porcentajexventas, nombre, dni, sueldo);
        this.bono = bono;
        this.cantVentasPremio = cantVentasPremio;
    }
    @Override
    public double getSueldo(){
        double sueldo = super.getSueldo();
        if (getCantVentas().size() >= cantVentasPremio){
            sueldo += bono;
        }
        return sueldo;
    }

}
