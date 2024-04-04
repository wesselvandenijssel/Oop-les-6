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
    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Voertuig) {
            Voertuig andereVoertuig = (Voertuig) andereObject;

            if (this.type.equals(andereVoertuig.type) &&
                    this.bouwjaar == andereVoertuig.bouwjaar &&
                    this.nieuwprijs == andereVoertuig.nieuwprijs) {
                gelijkeObjecten = true;
            }

        }
        return gelijkeObjecten;
    }
    
    @Override
    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: €%.2f.", type, bouwjaar, huidigeWaarde());
    }
}
