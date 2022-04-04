package modelo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "690780_arma")
@ToString

public class Arma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "tipo")
    String tipo;

    @Column(name = "nome")
    String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Crime getCrime() {
        return crime;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }

    @OneToOne()
    @JoinColumn(name = "id_crime", referencedColumnName = "id")
    Crime crime;

    public Arma() { }

    public Arma(String nome, String tipo, Crime crime) {
        this.tipo = tipo;
        this.nome = nome;
        this.crime = crime;
    }
}
