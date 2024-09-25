package model;
import java.io.Serializable;
public class PessoaJuridica extends Pessoa {
    private static final long serialVersionUID = 1L;

    private String cnpj;

    // Construtor padrão
    public PessoaJuridica() {}

    // Construtor completo
    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método polimórfico para exibir
    @Override
    public void exibir() {
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", CNPJ: " + cnpj);
    }
    
}
