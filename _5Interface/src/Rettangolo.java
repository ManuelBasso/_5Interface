public class Rettangolo implements Forma{
    private int base;
    private int altezza;
    private int area;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int calcolaArea(){
        area = base*altezza;
        return area;
    }
}
