package Scuola;

public class Scuola {
    public static void main(String args[]){

        Studente p1 = new Studente("Veronesi", "Elisa", "06/06/2003", "4B", "18805");
        System.out.println("persona1: " + p1.toString());

        Docente p2 = new Docente("Rossi", "Mario", "21/12/1970", "TD", "informatica");
        System.out.println("persona2: " + p2.toString());

        Dirigente p3 = new Dirigente("Russo", "Lucia", "06/06/2003", 12);
        System.out.println("persona3: " + p3.toString());

        Ata p4 = new Ata("Barbieri", "Alessandro", "05/08/1986", "TI", "AMM");
        System.out.println("persona4: " + p4.toString());

        Dsga p5 = new Dsga("Ferrari", "Simona", "06/02/1958", "TD", "segretaria della scuola");
        System.out.println("persona5: " + p5.toString());

        

    }
}
