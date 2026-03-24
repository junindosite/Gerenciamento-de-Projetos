package com.junior.crud.service;

import com.junior.crud.entity.Projeto;
import com.junior.crud.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }

    public List<Projeto> listarTodos() {
        return repository.findAll();
    }

    public Projeto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}