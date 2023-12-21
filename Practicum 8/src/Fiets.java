import java.util.Objects;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);  // Gebruik de constructor van Voertuig
        this.framenummer = fnr; // Wijs de waarde toe aan het kenteken
    }

    public double huidigeWaarde(){
        return super.huidigeWaarde() * 0.7;  // Auto waarde daalt met 30%
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fiets fiets = (Fiets) obj;
        return framenummer == fiets.framenummer;
    }
}
