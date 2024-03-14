package br.com.gabrielc.ordemservico.departamento.repositories;

import br.com.gabrielc.ordemservico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
