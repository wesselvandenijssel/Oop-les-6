import java.lang.reflect.Field;
import java.util.Objects;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        // Apply the depreciation separately for Fiets
        return nieuwprijs * Math.pow(0.7, (2023 - bouwjaar));
    }

    @Override
    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;

        if(andereObject instanceof Fiets){
            Fiets andereFiets = (Fiets) andereObject;

            if (super.equals(andereFiets) &&
                    this.framenummer == andereFiets.framenummer){
                gelijkeObjecten = true;
            }

        }
        return gelijkeObjecten;
    }
}
