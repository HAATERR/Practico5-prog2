import java.util.ArrayList;

public class Trabajo {
    private Evaluador evaluador;
    private ArrayList<String> temas;

    public Trabajo() {
        this.evaluador = null;
        this.temas = new ArrayList<>();
    }
    public boolean sirveEvaluador(Evaluador e){
        if(e.getCantTemas()== this.temas.size()){
            for (int i = 0; i < this.temas.size(); i++) {
                if(!evaluador.trataTema(this.temas.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public void setEvaluador(Evaluador e){
        this.evaluador = e;
    }
    public int getCantTemas(){
        return this.temas.size();
    }
    public boolean tieneTema(String tema){
        return this.temas.contains(tema);
    }
}
