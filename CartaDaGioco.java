package com.company;

import java.io.Serializable;

class CartaTest{

    public static void main(String[] args) {
        Carta c1 = new Carta();
        System.out.println("carta1 -> " + c1.toString());
        System.out.println("punteggio carta1 -> " + c1.calcolaPunteggio());

        Carta c2 = new Carta("fiori","A");
        System.out.println("carta2 -> " + c2.toString());
        System.out.println("punteggio carta2 -> " + c2.calcolaPunteggio());

        System.out.println("tra le due carte vince -> " + c1.vince(c1));
        System.out.println("fondi carte -> " + c1.fondi(c1));
    }
}

class Carta{

    private String seme;  //cuori, quadri, fiori, picche
    private String valore;  //numeri da 2 a 9, lettere A,J,Q,K,* (per i jolly)


    // sceglie quale valore dare a seme e valore
    public Carta(){
        this.seme = generaSeme();
        if (this.seme != "*"){
            this.valore = generaValore();
        }else{
            this.valore=" ";
        }
    }

    //gli vengono dati entrambi i parametri nel main
    public Carta(String seme, String valore){
        //this.seme=seme;
        setSeme(seme);
        //this.valore=valore;
        setValore(valore);
    }

    public String toString(){
        String s;
        s = "valore:" + valore + " seme:" + seme;
        return s;
    }

    public String generaValore(){
        String s = "";
        int valore;
        valore = (int) (Math.random() * 14);
        switch (valore) {
            case 1:
                s = "A";
                break;
            case 2:
                s = "2";
                break;
            case 3:
                s = "3";
                break;
            case 4:
                s = "4";
                break;
            case 5:
                s = "5";
                break;
            case 6:
                s = "6";
                break;
            case 7:
                s = "7";
                break;
            case 8:
                s = "8";
                break;
            case 9:
                s = "9";
                break;
            case 10:
                s = "J";
                break;
            case 11:
                s = "Q";
                break;
            case 12:
                s = "K";
                break;
            case 13:
                s = "*";
                break;

        }
        return s;
    }

    public String generaSeme(){
        int val = (int)(Math.random()*5);
        String s = "";
        switch (val) {
            case 1:
                s = "cuori";
                break;
            case 2:
                s = "quadri";
                break;
            case 3:
                s = "fiori";
                break;
            case 4:
                s = "picche";
                break;
        }
        return s;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }
    public void setSeme(String seme) {
        this.seme = seme;
    }

    public String getValore(){
        return this.valore;
    }
    public String getSeme(){
        return this.seme;
    }

    //restituisce il punteggio relativo ad una carta (A, J, Q, K valgono 10, il jolly vale 25)
    public String calcolaPunteggio(){
        String s = " ";
        switch (this.valore) {
            case "A":
                s =  "10";
                break;
            case "2":
                s =  "2";
                break;
            case "3":
                s =  "3";
                break;
            case "4":
                s =  "4";
                break;
            case "5":
                s =  "5";
                break;
            case "6":
                s =  "6";
                break;
            case "7":
                s =  "7";
                break;
            case "8":
                s =  "8";
                break;
            case "9":
                s =  "9";
                break;
            case "J":
                s =  "10";
                break;
            case "Q":
                s =  "10";
                break;
            case "K":
                s =  "10";
                break;
            case "*":
                s =  "25";
                break;
        }
        return s;
    }

    // restituisce, tra due, la carta con punteggio maggiore e, in caso di parità, la carta il cui seme viene prima in ordine alfabetico
    public String vince(Carta c1){
        String semec2 = generaSeme();
        String valorec2 = generaValore();
        System.out.println("nuova carta -> " + valorec2 + " " + semec2);

        if (valorec2 != "*"){
            valorec2 = calcolaPunteggio();

            Integer v2_int = Integer.valueOf(valorec2);
            Integer v1_int = Integer.valueOf(this.valore);

            if (v2_int > v1_int) {
                return ("valore: " + valorec2 + " seme: " + semec2);
            }else {
                return ("valore: " + this.valore + " seme: " + this.seme);
            }
        } else {
            return "jolly" ;
        }

    }

    // restituisce una carta con il seme della prima carta e il valore della seconda. Il jolly non si può fondere
    public String fondi(Carta c1){

        String valorec2 = generaValore();
        String s;

        if (valorec2 == "*"){
            s = "non si può fondere ";
        } else {
            s = "valore:" + valorec2 + " seme:" + this.seme;
        }
        return s;
    }

}