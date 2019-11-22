import java.util.ArrayList;

public class Cliente{
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereco;
    private ArrayList<Pet> pets;

//    public Cliente(){};
    public Cliente(String nome, String sobrenome, int idade, String CPF, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
        this.pets = new ArrayList<Pet>();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", endereço='" + endereco + '\'' +
                ", pets=" + pets +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void fazerAvalaiacao(Avaliacao avaliacao){
        System.out.println(avaliacao);
    }


    public void cadastrarGato(Gato gato){
        pets.add(gato);
    }

    public void cadastrarCachorro(Cachorro cachorro){
        pets.add(cachorro);
    }
	public ArrayList<Pet> getPets() {
		return pets;
	}
	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
    
}
