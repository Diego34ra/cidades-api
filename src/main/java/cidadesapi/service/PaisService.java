package cidadesapi.service;

import cidadesapi.model.Pais;
import cidadesapi.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    public Pais findById(Integer id) {
        Optional<Pais> pais = paisRepository.findById(id);
        return pais.get();
    }
}
