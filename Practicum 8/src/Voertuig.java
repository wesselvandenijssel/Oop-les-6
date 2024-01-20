import java.util.Objects;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        this.type =  tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(nieuwprijs, voertuig.nieuwprijs) == 0 && bouwjaar == voertuig.bouwjaar && Objects.equals(type, voertuig.type);
    }
    @Override
    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: €%.2f.", type, bouwjaar, huidigeWaarde());
    }
}
