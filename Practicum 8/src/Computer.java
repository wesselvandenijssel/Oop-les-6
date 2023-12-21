import java.util.Objects;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this. productieJaar = jr;
    }

    public double huidigeWaarde(){
        return aanschafPrijs * Math.pow(0.6, (2023 - productieJaar));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return Double.compare(aanschafPrijs, computer.aanschafPrijs) == 0 && productieJaar == computer.productieJaar && Objects.equals(type, computer.type) && Objects.equals(macAdres, computer.macAdres);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", macAdres='" + macAdres + '\'' +
                ", aanschafPrijs=" + aanschafPrijs +
                ", productieJaar=" + productieJaar +
                ", huidige waarde=" + huidigeWaarde() +
                '}';
    }
}
