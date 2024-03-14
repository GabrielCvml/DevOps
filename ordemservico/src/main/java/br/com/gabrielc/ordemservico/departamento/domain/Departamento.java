package br.com.gabrielc.ordemservico.departamento.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPARTAMEBNTO")
    private Integer idDepartamento;
    @Column(name = "NOME_DEPARTAMENTO")
    private String nomeDeparmaneto;

    public Departamento)(){
    }
    public Departamento(Integer idDepartamento, String nomeDeparmaneto) {
        this.idDepartamento = idDepartamento;
        this.nomeDeparmaneto = nomeDeparmaneto;
    }
}
