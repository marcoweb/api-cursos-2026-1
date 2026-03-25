package app.instrutores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "instrutores")
@Getter
@Setter
@NoArgsConstructor
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String formacao;

    public Instrutor(InstrutorInsertDTO dados) {
        this.setNome(dados.nome());
        this.setFormacao(dados.formacao());
    }

    public Instrutor(InstrutorDTO dados) {
        this.setId(dados.id());
        this.setNome(dados.nome());
        this.setFormacao(dados.formacao());
    }
}
