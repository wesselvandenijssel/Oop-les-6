import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;

    private ArrayList<Goed> goederen;

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
        this.goederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
        if (!goederen.contains(g) && g.huidigeWaarde() <= budget) {
            goederen.add(g);
            budget -= g.huidigeWaarde();
        } else {
            System.out.println("Aanschaf van " + g.toString() + " mislukt (te weinig budget of al toegevoegd).");
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("BedrijfsInventaris{" +
                "bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", budget=" + budget +
                "}\nGoederen:\n");
        for (Goed g : goederen) {
            result.append(g.toString()).append("\n");
        }
        return result.toString();
    }
}
