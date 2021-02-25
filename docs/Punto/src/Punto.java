
public class Punto {

    private int x;
    private int y;

    public Punto( ){
        this.x=0;
        this.y=0;
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Punto(int x){
        this.x=x;
        this.y=0;
    }

    public void set(int x, int y){
        setX(x);
        setY(y);
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public String toString(){
        return ("ascissa: "+ this.x +" E ordinata: "+ this.y);
    }

    public boolean equals(Punto p){
        return(this.toString().equals(p.toString()));
    }

    public double distanza (Punto pB){
        int qDisX, qDisY;
        double ris;
        qDisX=(this.x-pB.x) * (this.x-pB.x);
        qDisY=(this.y-pB.y) * (this.y-pB.y);
        ris=Math.sqrt(qDisX+qDisY);
        return ris;
    }

    public double distanzaDaOrigine(){
        int qDisX, qDisY;
        double ris;
        qDisX=(this.x-0) * (this.x-0);
        qDisY=(this.y-0) * (this.y-0);
        ris=Math.sqrt(qDisX+qDisY);
        return ris;
    }
    public void trasla(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
}
