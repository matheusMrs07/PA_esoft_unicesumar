package com.esoft;

import java.util.Date;

import com.esoft.models.Endereco;
import com.esoft.models.Pessoa;
import com.esoft.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("esoft_p");
        EntityManager em = emf.createEntityManager();

        Pessoa p = new Pessoa("Pedro", "001", 22);

        p.setNascimento(new Date());


        Usuario u = new Usuario();
        u.setEmail("pedro@email.com");
        u.setPessoa(p);
        u.setSenha("senha");
        u.setUsuario("pedro");
        p.setUsuario(u);

        Endereco e = new Endereco();
        e.setCep("00000-000");
        e.setEnderecoCompleto("Rua 123");
        p.addEdereco(e);
        e.setPessoa(p);
                

        em.getTransaction().begin();
        em.persist(p);
        em.persist(u);
        em.persist(e);

        em.getTransaction().commit();

        em.getTransaction().begin();

        em.remove(e);
        em.getTransaction().commit();

        System.out.println("ID: "+ p.getId());

        System.out.println( "Conectado com Sucesso!" );

        em.close();
        emf.close();

    }
}
