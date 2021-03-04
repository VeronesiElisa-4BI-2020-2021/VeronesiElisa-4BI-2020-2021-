public class RettangoloTest {

    public static void main(String[] args) {
	    Rettangolo r = new Rettangolo();
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Area: " + r.getArea()); System.out.println("Expected perimetro: 4");
        System.out.println("Expected area: 1");
        Rettangolo rr = new Rettangolo(5, 3, 9, 2);
        System.out.println("Perimetro: " + rr.getPerimetro());
        System.out.println("Area: " + rr.getArea());
        System.out.println("Expected perimetro: 16");
        System.out.println("Expected area: 15");
    }
}
