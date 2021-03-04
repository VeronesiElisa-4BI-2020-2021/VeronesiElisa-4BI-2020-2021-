package Scuola;

import java.util.Date;

public class Dsga extends Persona {
    private String contratto, incarico;

    public Dsga (String cognome, String nome, Date d_nasc, String contratto, String incarico) {
        super(cognome,nome,d_nasc);
        setContratto(contratto);
        setIncarico(incarico);
    }
    public Dsga (String cognome, String nome, String d_nasc, String contratto, String incarico) {
        super(cognome,nome,d_nasc);
        setContratto(contratto);
        setIncarico(incarico);
    }

    public String getContratto() {
        return contratto;
    }

    public void setContratto(String contratto) {
        contratto=contratto.toUpperCase();
        if (contratto == null || contratto != "TD" || contratto != "TI") {
            this.contratto = "TD";
        } else {
            this.contratto = contratto;
        }
    }

    public String getIncarico() {
        return incarico;
    }

    public void setIncarico(String incarico) {
        this.incarico = incarico;
    }

    @Override
    public String toString() {
        return super.toString() + ", contratto: " + this.contratto + " incarico: " + this.incarico;
    }

    public boolean equals(Dsga s){

        boolean equals = this.toString().equals(s.toString());
        return equals;
    }

}