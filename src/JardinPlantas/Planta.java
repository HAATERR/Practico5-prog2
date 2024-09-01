import java.time.LocalDateTime;

public class Planta {
    private String nombreCientifico;
    private String nombre;
    private String pais;
    private int id;
    private LocalDateTime fecha_compra;

    private int ultId = 0;
    public Planta(String nombreCientifico, String nombre, String pais, LocalDateTime fecha_compra) {
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.pais = pais;
        this.id = incrementarId();
        this.fecha_compra = fecha_compra;

    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getFecha_compra() {
        return fecha_compra;
    }
    public void setFecha_compra(LocalDateTime fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    private int incrementarId() {
        return ++ultId;
    }

}

