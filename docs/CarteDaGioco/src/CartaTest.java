public class CartaTest{

    public static void main(String[] args) {
        Carta c1 = new Carta();
        System.out.println("carta1 -> " + c1.toString());
        System.out.println("punteggio carta1 -> " + c1.calcolaPunteggio());

        Carta c2 = new Carta("fiori","A");
        System.out.println("carta2 -> " + c2.toString());
        System.out.println("punteggio carta2 -> " + c2.calcolaPunteggio());

        System.out.println("tra le due carte vince -> " + c1.vince(c1));
        System.out.println("fondi carte -> " + c1.fondi(c1));
    }
}
