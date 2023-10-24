public class Triangolo implements Forma{
    private int base;
    private int altezza;
    private int area;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int calcolaArea(){
    area = (base*altezza)/2;
    return area;
    }
}
