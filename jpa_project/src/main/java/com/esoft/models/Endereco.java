package com.esoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String enderecoCompleto;
    String cep;

    @ManyToOne
    Pessoa pessoa;

}
