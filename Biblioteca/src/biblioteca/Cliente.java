
package biblioteca;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String n_telefone;
    private int idade;
    
    public Cliente() {
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getN_Telefone(){
        return n_telefone;
    }
    public void setN_Telefone(String n_telefone){
        this.n_telefone = n_telefone;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String checarIdadeMinima(){
        String respostaIdade;
    if(this.idade < 18){
        respostaIdade = "Idade não autorizada";
    }else{
        respostaIdade = "Idade autorizada";
    }   return respostaIdade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome+
                "\nCPF: " + this.cpf+
                "\nNúmero de Telefone: " + this.n_telefone+
                "\nIdade: " + this.idade+
                "\nIdade Autorizada?: " + this.checarIdadeMinima();
    }
}
