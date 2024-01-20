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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fiets otherFiets = (Fiets) obj;

        try {
            Field typeField = Voertuig.class.getDeclaredField("type");
            typeField.setAccessible(true);

            // Vergelijk alle attributen, inclusief het framenummer
            return nieuwprijs == otherFiets.nieuwprijs &&
                    bouwjaar == otherFiets.bouwjaar &&
                    Objects.equals(typeField.get(this), typeField.get(otherFiets)) &&
                    framenummer == otherFiets.framenummer;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }
}
