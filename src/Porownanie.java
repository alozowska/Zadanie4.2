public class Porownanie {
    private Line line1;
    private Line line2;

    public Porownanie(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;

    }

    public Line porownaj() {
        double dlugosc1 = line1.dlugosc();
        double dlugosc2 = line2.dlugosc();
        if (dlugosc1 > dlugosc2) {
            return line1;
        } else {
            return line2;
        }

    }


}
