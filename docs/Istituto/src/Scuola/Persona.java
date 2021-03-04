package Scuola;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    protected String cognome, nome;
    protected Date data_nasc;

    public Persona(String cognome, String nome, Date d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        this.data_nasc = d_nasc;
    }
    public Persona(String cognome, String nome, String d_nasc) {
        this.cognome = cognome;
        this.nome = nome;
        try {
            this.data_nasc = new
                    SimpleDateFormat("dd/MM/yyyy").parse(d_nasc);
        } catch (ParseException ex) {
            this.data_nasc= new Date(0);//1 1 1970
        }
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return "cognome:" +cognome+" nome:" +nome+" datanascita:" + df.format(data_nasc);
    }

    public boolean equals(Persona p){
        return (this.toString().equals(p.toString()));
    }

}
