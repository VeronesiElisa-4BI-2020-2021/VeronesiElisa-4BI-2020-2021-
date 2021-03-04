package Scuola;

import java.util.Date;


public class Studente extends Persona {
    private int matricola;
    private String classe;

    public Studente(String cognome, String nome, Date d_nasc, String classe, int matricola) {
        super(cognome,nome,d_nasc);
        this.classe = classe;
        this.matricola=matricola;
    }

    public Studente(String veronesi, String cognome, String nome, String d_nasc, String classe) {
        super(cognome,nome,d_nasc);
        this.classe = classe;
        this.matricola=matricola;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return super.toString()+ ", classe: " + this.classe + " matricola: " + this.matricola ;
    }

    public boolean equals(Studente s){
        boolean equals = this.toString().equals(s.toString());
        return equals;
    }

}
