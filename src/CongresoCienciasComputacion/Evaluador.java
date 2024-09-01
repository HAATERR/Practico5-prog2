import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private String tipo;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<String> temas;

    public Evaluador(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.trabajos = new ArrayList<>();
        this.temas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantTrabajos() {
        return this.trabajos.size();
    }
    public int getCantTemas(){
        return this.temas.size();
    }
    public void addTrabajo(Trabajo trabajo) {
        this.trabajos.add(trabajo);
    }
    public boolean trataTema(String tema){
        return this.temas.contains(tema);
    }
}
