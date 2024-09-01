import java.util.ArrayList;

public class Alumno {
    private ArrayList<Cualidad> cualidades;
    private String nombre;
    private ArrayList<Alumno> familiares;
    private CasaHogwarts casa;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.casa = null;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Cualidad> getCualidades() {
        return cualidades;
    }
    public void setCualidades(ArrayList<Cualidad> cualidades) {
        this.cualidades = cualidades;
    }
    public ArrayList<Alumno> getFamiliares() {
        return familiares;
    }
    public void setFamiliares(ArrayList<Alumno> familiares) {
        this.familiares = familiares;
    }
    public CasaHogwarts getCasa() {
        return casa;
    }
    public void setCasa(CasaHogwarts casa) {
        this.casa = casa;
    }

}
