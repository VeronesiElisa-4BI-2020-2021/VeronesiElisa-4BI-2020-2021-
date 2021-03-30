import java.util.Objects;

public class ATVCorsaMonitorata {
    private String linea;
    private ATVCorsaRilevata [] corse;
    public int numCorse;

    public ATVCorsaMonitorata(){
        this.linea = "";
        this.corse = new ATVCorsaRilevata[100];
        this.numCorse = 0;
    }
    public ATVCorsaMonitorata(String linea, ATVCorsaRilevata [] c, int numCorse){
        this.linea = linea;  //genera da sola la stringa ----- è come scrivere new String(l)
        this.corse = new ATVCorsaRilevata[c.lenght];
        for (int i=0; i<numCorse; i++){ //per ogni valore presente in c
            this.corse[i]=new ATVCorsaRilevata(c[i]);
        }
        this.numCorse = numCorse;
    }
    public ATVCorsaMonitorata(ATVCorsaMonitorata a){
        this.linea = a.getLinea();
        this.corse = new ATVCorsaRilevata[a.corse.lenght];
        for (int i=0; i<a.getNumCorse; i++){ 
            this.corse[i]=new ATVCorsaRilevata(a.getCorse[i]);
        }
        this.numCorse = a.numCorse;
    }
    public ATVCorsaMonitorata(String linea){
        String [] c = split(linea, " ");
        String [] b;
        this.linea = c[0];
        this.corse = new ATVCorsaRilevata[c.lenght-1];
        for (int i=1; i<corse.lenght; i++){ 
            b=split(c[i], "-") ;
            this.corse[i-1]=new ATVCorsaRilevata(b[0], b[1]);
            this.numCorse ++;
        }
    }

    public void setLinea(String l){
        this.linea=l;
    }
    public void setCorse(ATVCorsaRilevata[]){
        this.corse = new ATVCorsaRilevata[c.lenght];
        for (int i=0; i<c.lenght; i++){ 
            this.corse[i]=new ATVCorsaRilevata(c[i]);
        }
    }
    public void setATVCorsaMonitorata(String l, ATVCorsaRilevata[]){
        this.linea=l;
        this.corse = new ATVCorsaRilevata[c.lenght];
        for (int i=0; i<c.lenght; i++){ 
            this.corse[i]=new ATVCorsaRilevata(c[i]);
        }
    }

    public boolean equals(ATVCorsaMonitorata a){
        return this.toString().equals(a.toString());
    }
    
    public void add(ATVCorsaRilevata c){
        if(this.corse.lenght > numCorse){
            corse[numcorse] = new ATVCorsaRilevata(c);
            numCorse++;
        } else{
            ATVCorsaRilevata[] temp = new ATVCorsaRilevata[corse.lenght *2];
            for(int i=0; i<numCorse; i++){
                temp[i] = corse[i];
            }
            this.corse = temp;
            corse[numCorse]=new ATVCorsaRilevata(c);
        }
        numCorse++;
    }
    public ATVCorsaRilevata remove(String l){
        int pos = getINdexOfl(l);
        ATVCorsaRilevata r = null;
        if(pos >=0){
            r = get(pos);
            for(int i=pos; i<this.numCorse - 1; i++){
                this.corse[i] = this.corse[i+1];
            }
            corse[this.numCorse - 1] = null;
            this.numCorse--;
        }
        return r;
    }

    public ATVCorsaRileva get(int pos){
        if (index >= 0 && index < this.numCorse){
            return new ATVCorsaRileva(this.corse[index]);
        } else {
            return null;
        }
    }
    
    public int getIndexOf(String c){
        boolean trovato = false;
        int l = corse.lenght;
        while(trovato=false || l > 0){
            if(corse[l-1].equals(c)){
                trovato=true;
            }
            l--;
        }
        if (trovato){
            return l;
        } 
        else {
            return -1;
        } 
    }
    
    public int size(){
        return this.numCorse;
    }

    public String getLinea() {
        return linea;
    }
    public ATVCorsaRilevata[] getCorse(String linea) {
        String [] c = split(linea, " ");
        String [] b;
        this.corse = new ATVCorsaRilevata[c.lenght-1];
        for (int i=1; i<corse.lenght; i++){ 
            b=split(c[i], "-") ;
            this.corse[i-1]=new ATVCorsaRilevata(b[0], b[1]);
            this.numCorse ++;
        }
    }
    public int getNumCorse(){
        return numCorse;
    }
    

    public int durataMedia(){
        int durTot = 0;
        for (int i=0; i<lenght; i++){
            durTot = corse[i].durata();
        }

        int media = durTot/this.numCorse;
        return media;
    }
    public int durataMinima(){
        int min=corse[0].durata();

        for (int i=1; i<this.numCorse; i++){
            int dur2 = corse[i].durata();
            if (dur2 < min){
                min = dur2;
            }
        }
        return min;
    }
    public int durataMassima(){
        int max=corse[0].durata();

        for (int i=1; i<this.numCorse; i++){
            int dur2 = corse[i].durata();
            if (dur2 > max){
                max = dur2;
            }
        }
        return max;
    }
    
    @Override
    public String toString() {
        String s = linea + ", ";
        for(int i=0; i<this.numCorse; i++){
            s = this.corse[i] + ", ";
        }
        return  s;
    }
}
