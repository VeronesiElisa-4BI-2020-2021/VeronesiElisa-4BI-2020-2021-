import java.util.Date;

public class Employee{
    private String nome;
    private Date data;

    public Employee() {
        this.nome = null;
        this.data = null;
    }
    
    public Employee(String nome) {
        this.nome = nome;
        this.data = null;
    }
    public Employee(Date data) {
        this.data = data;
        this.nome = null;
    }
    
    public Employee(Date data, String nome) {
        setEmployee(nome, data);
    }

    public void setEmployee(String nome, Date data){
        this.data = data;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    // toString
    public String toString() {
        return ("nome dipendente: " + this.nome + " assunzione: " + this.data);
    }

    // equals
    public boolean equals(Employee e) {
        return (this.toString().equals(e.toString()));
    }
}



