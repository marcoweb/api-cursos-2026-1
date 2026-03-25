package app.instrutores;

public record InstrutorDTO(long id, String nome, String formacao) {
    public InstrutorDTO(Instrutor dados) {
        this(dados.getId(), dados.getNome(), dados.getFormacao());
    }    
}
