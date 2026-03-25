package app.instrutores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {
    @Autowired
    private InstrutorService instrutorService;

    @GetMapping
    public Iterable<InstrutorDTO> getAll() {
        return instrutorService.getAll();
    }

    @PostMapping
    public InstrutorDTO insertOne(@RequestBody InstrutorInsertDTO dados) {
        return instrutorService.insert(dados);
    }

    @GetMapping("/formacao/{formacao}")
    public Iterable<InstrutorDTO> getByFormacao(@PathVariable String formacao){
        return instrutorService.getByFormacao(formacao);
    }
}
