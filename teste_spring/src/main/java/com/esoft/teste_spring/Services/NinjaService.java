package com.esoft.teste_spring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esoft.teste_spring.models.Ninja;
import com.esoft.teste_spring.repositories.NinjaRepository;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> listar() {

        return ninjaRepository.findAll();
    }

    public Ninja salvar(Ninja ninja) {

        return ninjaRepository.save(ninja);
    }

    public Optional<Ninja> buscarPorId(Long id) {
        return ninjaRepository.findById(id);
    }

    public void deletar(Long id) {
        ninjaRepository.deleteById(id);
    }

}
