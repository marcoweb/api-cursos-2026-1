package app.categorias;

public record CategoriaDTO(
    long id,
    String nome
){
    public CategoriaDTO(Categoria dados) {
        this(dados.getId(), dados.getNome());
    }
}