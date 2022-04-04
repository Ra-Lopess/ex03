package modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "690780_crime")
@ToString

public class Crime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "data")
    LocalDateTime data;

    @Column(name = "local")
    String local;

    @Column(name = "descricao")
    String descricao;

    @ManyToMany(mappedBy = "crimes")
    List<Criminoso> criminosos;

    @ManyToMany(mappedBy = "crimes")
    List<Vitima> vitimas;

    public Crime() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Criminoso> getCriminosos() {
        return criminosos;
    }

    public void setCriminosos(List<Criminoso> criminosos) {
        this.criminosos = criminosos;
    }

    public List<Vitima> getVitimas() {
        return vitimas;
    }

    public void setVitimas(List<Vitima> vitimas) {
        this.vitimas = vitimas;
    }

    public Crime(LocalDateTime data, String local, String descricao, List<Criminoso> criminosos, List<Vitima> vitimas ) {
        this.data = data;
        this.local = local;
        this.descricao = descricao;
        this.vitimas = vitimas;
        this.criminosos = criminosos;
    }
}
