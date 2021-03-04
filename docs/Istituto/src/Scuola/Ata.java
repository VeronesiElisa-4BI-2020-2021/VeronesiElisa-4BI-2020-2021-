package Scuola;

import java.util.Date;

public class Ata extends Persona {
    private String contratto, incarico;

    public Ata(String cognome, String nome, Date d_nasc, String contratto, String incarico) {
        super(cognome,nome,d_nasc);
        setContratto(contratto);
        setIncarico(incarico);
    }
    public Ata(String cognome, String nome, String d_nasc, String contratto, String incarico) {
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

    public String getincarico() {
        return incarico;
    }

    public void setIncarico(String incarico) {

        incarico = incarico.toUpperCase();

        if (incarico == null || incarico != "TEC" || incarico != "AMM" || incarico != "COL") {
            this.incarico = "TEC";
        } else {
            this.incarico = incarico;
        }
    }

    @Override
    public String toString() {
        return super.toString()+", contratto:" + this.contratto + " incarico:" + this.incarico;
    }

    public boolean equals(Ata a){
        return (this.toString().equals(a.toString()));
    }

}