package app.instrutor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    // public List<Instrutor> findByFormacao(String formacao);
    public List<Instrutor> findByFormacaoContainingIgnoreCase(String formacao);
}
