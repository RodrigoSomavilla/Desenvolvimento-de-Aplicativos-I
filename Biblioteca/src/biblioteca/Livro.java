
package biblioteca;

public class Livro {
    
    private String nome;
    private String autor;
    private double preco;
    
    public Livro(){      
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String checarDesconto(){
        String desconto;
    if(this.preco > 50.00){
        desconto = "Você ganhou 10% de desconto";
    }else{
        desconto = "Sem descontos";
    }   return desconto;
    }
    
    @Override
    public String toString(){
        return "Nome do Livro: " + this.nome+
                "\nAutor do Livro: " + this.autor+
                "\nPreço do Livro: " + this.preco+
                "\nDesconto?: " + this.checarDesconto();
    }
}
