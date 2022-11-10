package construtores;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;
    private String endereco;
    private Double altura;

    private LocalDate dataNascimento = LocalDate.of(2002,2,12);
    private String data = "02/02/2022";

    public Pessoa(){
    }
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, Integer idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Pessoa(Integer idade, String cpf){
        this.idade = idade;
        this.cpf = cpf;
    }
    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    public Pessoa(String nome, Integer idade, String cpf, String endereco, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.altura = altura;
        data.equals()

    }
}
