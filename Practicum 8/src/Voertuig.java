public class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        this.type =  tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, (2023 - bouwjaar));
    }

    @Override
    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: €%.2f.", type, bouwjaar, huidigeWaarde());
    }
}
