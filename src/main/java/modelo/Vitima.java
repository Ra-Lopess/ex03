package modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "690780_vitima")
@ToString

public class Vitima {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "nome")
    String nome;

    @Column(name = "sexo")
    String sexo;

    @Column(name = "data_nasc")
    LocalDateTime data_nasc;

    @Column(name = "cpf")
    String cpf;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "690780_vitima_crime",
            joinColumns = { @JoinColumn(name = "id_vitima") },
            inverseJoinColumns = { @JoinColumn(name = "id_crime") }
    )
    List<Crime> crimes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDateTime getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDateTime data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public void setCrimes(List<Crime> crimes) {
        this.crimes = crimes;
    }

    public Vitima() { }

    public Vitima(String nome, String sexo, LocalDateTime data_nasc, String cpf, List<Crime> crimes) {
        this.nome = nome;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.crimes = crimes;
    }

}