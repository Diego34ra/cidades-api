package cidadesapi.service;

import cidadesapi.model.Cidade;
import cidadesapi.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repository;

    public List<Cidade> findAll() {
        return repository.findAll();
    }
}
