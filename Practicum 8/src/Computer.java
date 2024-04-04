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
    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Computer) {
            Computer andereComputer = (Computer) andereObject;

            if (this.type.equals(andereComputer.type) &&
                    this.macAdres.equals(andereComputer.macAdres) &&
                    this.aanschafPrijs == andereComputer.aanschafPrijs &&
                    this.productieJaar == andereComputer.productieJaar) {
                gelijkeObjecten = true;
            }

        }
        return gelijkeObjecten;
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
