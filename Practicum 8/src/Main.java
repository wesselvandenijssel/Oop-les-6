public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("Mijn Bedrijf", 50000.0);

        Computer computer1 = new Computer("Laptop", "00:1A:2B:3C:4D:5E", 1200.0, 2022);
        Computer computer2 = new Computer("Desktop", "00:1A:2B:3C:4D:5F", 1500.0, 2022);

        Fiets fiets1 = new Fiets("Stadsfiets", 300.0, 2021, 12345);
        Fiets fiets2 = new Fiets("Mountainbike", 500.0, 2020, 67890);

        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Volkswagen Golf", 25000.00, 2020, "6-ABC-12");

        inventaris.schafAan(computer1);
        inventaris.schafAan(computer2);
        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);
        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);

        System.out.println(inventaris);
    }
}
