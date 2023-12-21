import java.util.Objects;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);  // Gebruik de constructor van Voertuig
        this.kenteken = kt; // Wijs de waarde toe aan het kenteken
    }

    public double huigeigeWaarde(){
        return super.huidigeWaarde() * 0.7;  // Auto waarde daalt met 30%
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Auto auto = (Auto) obj;
        return Objects.equals(kenteken, auto.kenteken);
    }

}
