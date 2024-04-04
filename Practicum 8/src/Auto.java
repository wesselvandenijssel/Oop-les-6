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
    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;

        if(andereObject instanceof Auto){
            Auto andereAuto = (Auto) andereObject;

            if (super.equals(andereAuto) &&
                    this.kenteken.equals(andereAuto.kenteken)){
                gelijkeObjecten = true;
            }

        }
        return gelijkeObjecten;
    }
}
