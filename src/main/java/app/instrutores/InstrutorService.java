package app.instrutores;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InstrutorService {
    @Autowired
    private InstrutorRepository instrutorRepo;

    public Iterable<InstrutorDTO> getAll() {
        return instrutorRepo.findAll().stream().map(InstrutorDTO::new).toList();
    }

    public Iterable<InstrutorDTO> getByFormacao(String formacao) {
        return instrutorRepo.findByFormacaoContainingIgnoreCase(formacao).stream().map(InstrutorDTO::new).toList();
    }

    public InstrutorDTO insert(InstrutorInsertDTO dados) {
        return new InstrutorDTO(instrutorRepo.save(new Instrutor(dados)));
    }
}