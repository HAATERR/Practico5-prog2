import java.util.ArrayList;

public class CasaHogwarts {
    private String nombre;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Cualidad> cualidades;
    private int cantMaxAlumnos;

    public CasaHogwarts(String nombre, int cantMaxAlumnos) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.cualidades = new ArrayList<>();
        this.cantMaxAlumnos = cantMaxAlumnos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public ArrayList<Cualidad> getCualidades() {
        return cualidades;
    }
    public void setCualidades(ArrayList<Cualidad> cualidades) {
        this.cualidades = cualidades;
    }
    public int getCantMaxAlumnos() {
        return cantMaxAlumnos;
    }
    public void setCantMaxAlumnos(int cantMaxAlumnos) {
        this.cantMaxAlumnos = cantMaxAlumnos;
    }
    public void addAlumno(Alumno alumno) {
      if (this.verificarAlumno(alumno) && this.alumnos.size() < cantMaxAlumnos){
          this.alumnos.add(alumno);
          alumno.setCasa(this);
      }
    }

    public boolean verificarAlumno(Alumno alumno) {
        return this.cualidades.equals(alumno.getCualidades()) && alumno.getCasa() == null;
    }
}
