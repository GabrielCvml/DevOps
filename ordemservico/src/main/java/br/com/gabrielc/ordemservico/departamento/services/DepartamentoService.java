package br.com.gabrielc.ordemservico.departamento.services;

import br.com.gabrielc.ordemservico.departamento.domain.Departamento;
import br.com.gabrielc.ordemservico.departamento.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Departamento criarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> listarDepartamento() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> bucarDepartamento(Integer idDepartamento) {
        return departamentoRepository.findById(idDepartamento);
    }

    public void deletarDepartamento(Integer idDepartamento) {
        departamentoRepository.deleteById(idDepartamento);
    }
}

