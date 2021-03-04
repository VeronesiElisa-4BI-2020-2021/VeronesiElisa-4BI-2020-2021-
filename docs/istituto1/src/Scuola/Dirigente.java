package Scuola;

import java.util.Date;

public class Dirigente extends Persona {
    private int annoCarica;

    public Dirigente (String cognome, String nome, Date d_nasc, int annoCarica) {
        super(cognome, nome, d_nasc);
        this.annoCarica=annoCarica;
    }
    public Dirigente (String cognome, String nome, String d_nasc, int annoCarica) {
        super(cognome, nome, d_nasc);
        this.annoCarica=annoCarica;
    }

    public int getAnnoCarica() {
        return annoCarica;
    }

    public void setAnnoCarica (int annoCarica) {
        this.annoCarica=annoCarica;
    }

    @Override
    public String toString() {
        return super.toString()+", anno in cui è in carica: " + annoCarica;
    }

    public boolean equals(Dirigente d){

        return (this.toString().equals(d.toString()));
    }

}

