public class Pastura extends Cereal{
    private double superficie;
    public Pastura(double superficie){
        super();
        this.superficie = superficie;
    }
    public double getSuperficie(){
        return superficie;
    }
    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }
    @Override
    public boolean loteSirve(Lote lote){
        return super.loteSirve(lote) && this.superficie <= lote.getSuperficie();
    }
}
