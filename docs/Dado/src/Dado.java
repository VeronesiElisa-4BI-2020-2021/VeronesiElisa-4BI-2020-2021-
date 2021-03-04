public class Dado {

    private int facce;
    private boolean truccato;
    private int ultimoLancio;

    public Dado(int facce, boolean truccato) {
        if (facce < 2) {
            this.facce = 2;
        } else {
            this.facce = facce;
        }

        this.truccato = truccato;
        this.ultimoLancio=1;

    }

    public Dado() {
        this.facce =26;
        this.truccato = false;
        this.ultimoLancio=1;
    }

    public Dado(Dado d) {
        this.facce=d.getFacce();
        this.truccato=d.getTruccato();
        this.ultimoLancio=d.getUltimoLancio();
    }


    public void setDado(int facce, boolean truccato) {
        if (facce < 2) {
            this.facce = 2;
        } else {
            this.facce = facce;
        }
        this.truccato = truccato;
        this.ultimoLancio=1;
    }

    public void setFacce(int facce){
        if (facce >=2) {
            this.facce = facce;
        }
        else{
            this.facce=2;
        }
    }
    public int getFacce(){
        return facce;
    }

    public void setTruccato(boolean truccato){
        this.truccato=truccato;
    }
    public boolean getTruccato(){
        return truccato;
    }

    public void setUltimoLancio(int ultimoLancio){
        this.ultimoLancio=ultimoLancio;
    }
    public int getUltimoLancio(){
        return this.ultimoLancio;
    }

    public int lancia(){
        if (this.truccato==false){
            this.ultimoLancio= (int)((Math.random()*facce)+1);
        }else{
            this.ultimoLancio=this.facce;
        }
        return this.ultimoLancio;
    }

    public String toString(){
        return "Dado: numero facce: "+this.facce+", truccato: "+this.truccato
                + " ultimoLancio: "+this.ultimoLancio;
    }

    public boolean equals(Dado d){
        return(this.toString().equals(d.toString()));
    }

    @Override
    public Dado clone() throws CloneNotSupportedException{

        Dado nuovo=null;
        if (this!=null){
            nuovo=new Dado(this);
        }
        return nuovo;
    }

    public boolean vince(Dado d){
        boolean ris=true;
        if(this.facce==d.getFacce()) {
            if(this.ultimoLancio>=d.getUltimoLancio()){
                ris = true;
            }else{
                ris = false;
            }
        }
        return ris;
    }
}
