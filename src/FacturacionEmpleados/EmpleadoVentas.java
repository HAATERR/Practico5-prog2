import java.util.ArrayList;

public class EmpleadoVentas extends Empleado{
    private ArrayList<Double> cantVentas;
    private double porcentajexventas;

    public EmpleadoVentas( double porcentajexventas, String nombre, int dni, double sueldo) {
        super(nombre, dni, sueldo);
        this.cantVentas = new ArrayList<>();
        this.porcentajexventas = porcentajexventas;
    }
    public ArrayList<Double> getCantVentas() {
        return cantVentas;
    }

    public double getPorcentajexventas() {
        return porcentajexventas;
    }
    public void setPorcentajexventas(int porcentajexventas) {
        this.porcentajexventas = porcentajexventas;
    }
    public void addVenta(double v) {
        cantVentas.add(v);
    }
    @Override
    public double getSueldo() {
        double totalVentas = 0;
        for (double venta : cantVentas) {
            totalVentas += venta;
        }
        return super.getSueldo() + (totalVentas * porcentajexventas) / 100;
    }
}
