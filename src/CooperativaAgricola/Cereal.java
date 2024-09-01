import java.util.ArrayList
public class Cereal {
    private ArrayList<String> mineralesNecesarios;

    public Cereal() {
        mineralesNecesarios = new ArrayList<>();
    }
    public boolean mineralNecesario(String mineral) {
        return mineralesNecesarios.contains(mineral);
    }
    public boolean loteSirve(Lote lote) {
        int i = 0;
        if (this.mineralesNecesarios.size() == lote.cantidadMinerales()) {
            while (i < this.mineralesNecesarios.size()) {
                if (lote.tieneMineral(this.mineralesNecesarios.get(i))) {
                    i++;
                } else {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
