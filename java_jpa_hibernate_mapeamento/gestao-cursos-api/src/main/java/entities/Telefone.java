package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone {
    @Id
    private int id;
    private String DDD;
    private int numero;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDDD() {
        return DDD;
    }
    public void setDDD(String dDD) {
        DDD = dDD;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
