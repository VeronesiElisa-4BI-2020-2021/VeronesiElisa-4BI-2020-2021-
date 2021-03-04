public class DadoTest {

    public static void main(String []args){
        Dado d1;
        d1 = new Dado(24, false);
        System.out.println("il lancio ha realizzato: "+d1.lancia());
        d1.setTruccato(true);
        System.out.println("il lancio ha realizzato: "+d1.lancia());
        d1.setTruccato(false);
        Dado d2 = new Dado(24, false);
        System.out.println("vince il dado: "+d1.vince(d2));
        d2.setTruccato(true);
        d1.lancia();
        d2.lancia();

        System.out.println("Sia dato il lancio di due dadi: ");
        System.out.println("il primo dado "+d1);
        System.out.println(" il secondo dado: "+d2);
        d1.lancia();
        d2.lancia();
        if(d1.vince(d2)){
            System.out.println(" e vince il dado d1 con punti: "+d1.getUltimoLancio());
        }else{
            System.out.println(" e vince il dado d2 con punti: "+d2.getUltimoLancio());
        }
    }
}
