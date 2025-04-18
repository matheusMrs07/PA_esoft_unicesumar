package com.esoft.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="pessoas")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String nome;
    String cpf;
    int idade;
    Date nascimento;

    @OneToOne
    @JoinColumn(name="usuario_id")
    Usuario usuario;

    @OneToMany(mappedBy="pessoa")
    List<Endereco> enderecos = new ArrayList<>();

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade =idade;
    }

    public void addEdereco(Endereco e){
        enderecos.add(e);
    }

}
