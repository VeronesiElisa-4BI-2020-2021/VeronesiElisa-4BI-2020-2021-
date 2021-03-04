
public class Rettangolo {

    private int base;
    private int altezza;
    private int ascissa;
    private int ordinata;

    public Rettangolo(){
        base = 1;
        altezza = 1;
        ascissa = 0;
        ordinata = 0;
    }
    public Rettangolo(int unaBase, int unAltezza, int unAscissa, int unOrdinata) {
        base = unaBase;
        altezza = unAltezza;
        ascissa = unAscissa;
        ordinata = unOrdinata;
    }

    public int getBase(){
        return base;
    }
    public int getAltezza(){
        return altezza;
    }
    public int getAscissa(){
        return ascissa;
    }
    public int getOrdinata(){
        return ordinata;
    }

    public void setBase(int nuovaBase){
        base = nuovaBase;
    }
    public void setAltezza(int nuovaAltezza){
        altezza = nuovaAltezza;
    }
    public void setAscissa(int nuovaAscissa)
    {
        ascissa = nuovaAscissa;
    }
    public void setOrdinata(int nuovaOrdinata){
        ordinata = nuovaOrdinata;
    }

    public void traslazione(int trX, int trY){
        ascissa = ascissa + trX;
        ordinata = ordinata + trY;
    }

    public int getPerimetro(){
        return (base + altezza)*2;
    }

    public int getArea(){
        return base * altezza;
    }
}
