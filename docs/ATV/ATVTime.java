import java.util.Objects;

public class ATVTime implements Comparable{
    private int ora;  //0..23
    private int min;  //0..59

    private void normalizza(){
        while (min>59){
            min-=60;
            ora++;
        }
        while (min<00){
            min+=60;
            ora--;
        }
        while (ora >23)
            ora-=24;
        while (ora <0)
            ora+=24;
    }
    
    public ATVTime(){
	this.ora=0;
	this.min=0;
    }
    
    public ATVTime(String s) { //"05:70"
        try{
            String t[]=s.split(":");

            this.ora = Integer.parseInt(t[0]);
            this.min=Integer.parseInt(t[1]);
        }
        catch (Exception e){
            // qualsiasi errore ....
            this.ora=0;
            this.min=0;
        }
        normalizza();
    }

    public ATVTime(int ora, int min) {
        this.ora = ora;
        this.min = min;
        normalizza();
    }
    public ATVTime(ATVTime a){
	this(a.ora, a.min);
	
-----------------------------
	this(a.getOra(), a.getMin());
	
-----------------------------------
	this.ora=a.ora;
	this.min=a.min;
	normalizza();
----------------------------------
	this.ora=a.getOra();
	this.min=a.getMin();
	normalizza();
-----------------------------------
	setOra(a.getOra());
	setMin(a.getMin());
-----------------------------------
	setATVTime(a.ora, a.min);
------------------------------------
	setATVTime(a.getOra(), a.getMin());
    }
    public int getOra() {
        return new ATVTime(ora);
    }

    public void setOra(int ora) {
        this.ora = ora;
        normalizza();
    }

    public int getMin() {
        return new ATVTime(min);
    }

    public void setMin(int min) {
        this.min = min;
        normalizza();

    }
    public void setATMTime(int ore, int min) {
	this.ore=ore;
	this.min=min;
	this.normalizza();
    }

    @Override
    public boolean equals(ATVTime o) {
        if (this == o) return true;
        if (o == null) return false;
        return (ora == o.getOra() && min == o.getMin());
    }
--------------------------------------
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATVTime atvTime = (ATVTime) o;
        return (ora == atvTime.ora && min == atvTime.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ora, min);
    }


    @Override
    public int compareTo(Object o) {
        // <0 se this < o
        //==0 se this ==o
        // >0 se this > o
        if (this == o) return 0;

        if (o == null || this.getClass() != o.getClass()) return 1;
        return this.toMinuti()-((ATVTime)o).toMinuti();
    }

    public int toMinuti(){
        return ora*60+min;
    }

    public int diff(ATVTime t){

        return this.toMinuti()-t.toMinuti();
    }


    // aggiunge uno 0 se serve
    private String dueCifre(int c){
        if (c>9)
            return ""+c;
        else
            return "0"+c;
    }
    @Override
    public String toString() {
        return dueCifre(ora)+":"+dueCifre(min); //"02:30"
    }
    
    
    public static void main(String[] args) {
        ATVTime t1,t2,t3;
        t1=new ATVTime(10,72);
        System.out.println(t1);
        t2=new ATVTime("15:13");
        System.out.println(t2);
        System.out.println(t1.diff(t2));
        t3=new ATVTime(100,1000);
        System.out.println(t3);
        t3.setMin(1);
        t3.setOra(1);
        System.out.println(t3);   
        System.out.println(t3.toMinuti());
        t2.setMin(0);
        t2.setOra(2);
        System.out.println(t2.diff(t3)); // 2.00 - 1.1
        
        t1=new ATVTime("12:4");
        System.out.println(t1);
        t1=new ATVTime("124");
        System.out.println(t1);
        t1=new ATVTime("12:4");
        System.out.println(t1);
        t1=new ATVTime("pippo");
        System.out.println(t1);
        t1=new ATVTime(null);
        System.out.println(t1);
        
        
        
        
        
        t1.setOra(8);
        t1.setMin(5);
        
        
        t2.setMin(50);
        t2.setOra(10);
        
        int d=t2.diff(t1);
        
        
        System.out.println(t1+"  "+t2+" "+  d);
        
        t3=new ATVTime(0,d);
        
        System.out.println(t3);
        
        
    }
}
