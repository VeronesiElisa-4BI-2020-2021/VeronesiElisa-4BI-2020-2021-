package Scuola;

import java.util.Date;

public class Docente extends Persona {
    private String contratto, cls_concorso;

    public Docente(String cognome, String nome, Date d_nasc, String contratto, String cls_concorso) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.cls_concorso = cls_concorso;
    }

    public Docente(String cognome, String nome, String d_nasc, String contratto, String cls_concorso) {
        super(cognome, nome, d_nasc);
        this.contratto = contratto;
        this.cls_concorso = cls_concorso;
    }

    public String getContratto() {
        return contratto;
    }

    public void setContratto(String contratto) {

        contratto = contratto.toUpperCase();
        if (contratto == null || contratto != "TD" || contratto != "TI") {
            this.contratto = "TD";
        } else {
            this.contratto = contratto;
        }
    }

    public String getCls_concorso() {
        return cls_concorso;
    }

    public void setCls_concorso(String cls_concorso) {
        this.cls_concorso = cls_concorso;
    }

    @Override
    public String toString() {
        return super.toString() + ", contratto:" + contratto + " cls concorso:" + cls_concorso;
    }

    public boolean equals(Docente s) {

        boolean equals = this.toString().equals(s.toString());
        return equals;
    }

}

