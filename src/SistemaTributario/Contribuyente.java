public class Contribuyente {
    private String nombre;
    private int idTributario;
    private double montoFijo;

    public Contribuyente(String nombre, int idTributario, double montoFijo) {
        this.nombre = nombre;
        this.idTributario = idTributario;
        this.montoFijo = montoFijo;
    }

    public double calcularImpuestosAbonar(){
        return this.montoFijo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdTributario() {
        return idTributario;
    }
    public double getMontoFijo() {
        return montoFijo;
    }
}
