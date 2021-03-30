// aggiungere i set e i get
// aggiungere un piccolo main per provare la classe

public class ATVCorsaRilevata {
    private ATVTime inizio;
    private ATVTime fine;

    public ATVCorsaRilevata(){
	this.inizio = new ATVTime(0,0);
        this.fine = new ATVTime(0,0);
    }
    /*public ATVCorsaRilevata(ATVTime inizio, ATVTime fine) {
        this.inizio = inizio;
        this.fine = fine;
    }//senza sicurezza*/
    
    public ATVCorsaRilevata(ATVTime inizio, ATVTime fine) {
        this.inizio = new ATVTime(inizio);
        this.fine = new ATVTime(fine);
    }
				"07:25"
    public ATVCorsaRilevata(String inizio, String fine) {//sicura
        this.inizio = new ATVTime(inizio);
        this.fine = new ATVTime(fine);
    }
    public void setInizio(ATVTime i){
	this.inizio=new ATVTime(i);
    }
    public void setFine(ATVTime f){
	this.fine=new ATVTime(f);
    }
    public void setATVCorsaRilevata(ATVCorsaRilevata c){
	this.inizio = c.getInizio();
        this.fine = c.getFine();
---------------------------------------------------
	
	this.inizio = new ATVTime(c.inizio);
        this.fine = new ATVTime(c.fine);
    }
    public ATVTime getInizio(){
	return new ATVTime(this.inizio);
    }
    public ATVTime getFine(){
	return new ATVTime(this.fine);
    }
    public boolean equals(ATVCorsaRilevata a)
    @Override
    public String toString() {
        return this.inizio.toString() + "-" + this.fine.toString() ;
    }
    
    
    //gestione delle corse a cavallo della mezzanotte
    // part 23:30 arr 00:56
    public int durata(){
        int t=fine.toMinuti()-inizio.toMinuti();
        return t;
       
    }
    
    
}
