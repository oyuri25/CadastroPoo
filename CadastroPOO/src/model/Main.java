import model.*;

import java.io.IOException;
import java.util.List;
import java.io.Serializable;

public class Main {
    
    public static void main(String[] args) {
        try {
            // Teste para PessoaFisicaRepo
            RepositorioPessoaFisica repo1 = new RepositorioPessoaFisica();
            repo1.inserir(new PessoaFisica(1, "Alice", "123.456.789-00", 30));
            repo1.inserir(new PessoaFisica(2, "Bob", "987.654.321-00", 40));
            repo1.persistir("pessoas_fisicas.dat");

            RepositorioPessoaFisica repo2 = new RepositorioPessoaFisica();
            repo2.recuperar("pessoas_fisicas.dat");
            List<PessoaFisica> pessoasFisicas = repo2.obterTodos();
            System.out.println("Pessoas Fisicas recuperadas:");
            for (PessoaFisica pf : pessoasFisicas) {
                pf.exibir();
            }

            // Teste para PessoaJuridicaRepo
            RepositorioPessoaJuridica repo3 = new RepositorioPessoaJuridica();
            repo3.inserir(new PessoaJuridica(1, "Company A", "12.345.678/0001-99"));
            repo3.inserir(new PessoaJuridica(2, "Company B", "98.765.432/0001-99"));
            repo3.persistir("pessoas_juridicas.dat");

            RepositorioPessoaJuridica repo4 = new RepositorioPessoaJuridica();
            repo4.recuperar("pessoas_juridicas.dat");
            List<PessoaJuridica> pessoasJuridicas = repo4.obterTodos();
            System.out.println("Pessoas Juridicas recuperadas:");
            for (PessoaJuridica pj : pessoasJuridicas) {
                pj.exibir();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
