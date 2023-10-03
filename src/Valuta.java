public class Valuta {
    private final String name;
    private final double kurs;

    public Valuta(String name, double kurs) {
        this.name = name;
        this.kurs = kurs;
    }

    public String getName() {
        return this.name;
    }

    public double veksling(double penger) {
        return penger * this.kurs;
    }
}
