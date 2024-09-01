import java.util.ArrayList;

public class CasaEstricta extends CasaHogwarts{

    public CasaEstricta(String nombre,int cantMaxAlumnos){
        super(nombre,cantMaxAlumnos);
    }
    @Override
    public boolean verificarAlumno(Alumno a){
        return super.verificarAlumno(a) && this.verificarFamiliar(a.getFamiliares());
    }
    public boolean verificarFamiliar(ArrayList<Alumno> a){
        for (int i = 0;i < a.size();i++){
            if (super.getAlumnos().contains(a.get(i))){
                return true;
            }
        }
        return false;
    }
}