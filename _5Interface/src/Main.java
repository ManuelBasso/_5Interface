public class Main {
    public static void main(String[] args) {

        Triangolo triang = new Triangolo(4,6);
        Rettangolo rett = new Rettangolo(4, 6);

        System.out.println("Area triangolo: " + triang.calcolaArea());
        System.out.println("Area Rettangolo: " + rett.calcolaArea());
    }
}