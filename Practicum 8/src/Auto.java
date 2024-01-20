import java.util.Objects;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        // Apply the depreciation separately for Auto
        return nieuwprijs * Math.pow(0.7, (2023 - bouwjaar));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Auto otherAuto = (Auto) obj;

        // Vergelijk alle attributen, inclusief het kenteken
        return nieuwprijs == otherAuto.nieuwprijs &&
                bouwjaar == otherAuto.bouwjaar &&
                Objects.equals(kenteken, otherAuto.kenteken);
    }
}
