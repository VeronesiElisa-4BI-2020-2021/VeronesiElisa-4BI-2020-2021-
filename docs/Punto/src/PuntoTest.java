
public class PuntoTest{
    public static void main(String args[ ]){

        Punto p1=new Punto(3,2);
        Punto p2=new Punto();
        Punto p3=new Punto(4,5);

        System.out.println("p1 -> "+p1.toString());
        System.out.println("p2 -> "+p2.toString());
        double d=p1.distanza(p3);
        System.out.println("distanza p1 – p3 -> "+d);
        d=p1.distanzaDaOrigine();
        System.out.println("distanza di p1 dall’origine  -> "+d);

    }
}