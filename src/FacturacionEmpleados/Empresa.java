import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        empleados = new ArrayList<>();
        this.nombre = nombre;
    }
    public void addEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    public double sumarGastosSueldos(){
        double total = 0;
        for (int i = 0; i < empleados.size(); i++) {
            total += empleados.get(i).getSueldo();
        }
        return total;
    }
}
