

public class Morador {
    private static int contador = 1;
    private int codigoSequencial;
    private String nome;
    private int idade;
    private String apartamento;

    public Morador(String nome, int idade, String apartamento) {
        this.codigoSequencial = contador++;
        this.nome = nome;
        this.idade = idade;
        this.apartamento = apartamento;
    }

    public int getCodigoSequencial() {
        return codigoSequencial;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getApartamento() {
        return apartamento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public String toString() {
        return "Código: " + codigoSequencial +
               ", Nome: " + nome +
               ", Idade: " + idade +
               ", Apartamento: " + apartamento;
    }
}
