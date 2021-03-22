
package estudodirigido;

public class Produtos {
    
    public int codigo;
    public String descProduto;
    public float preco;
    public int quantidade;
    public int fechar;
    
    public Produtos(){}
    
    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescProduto() {
        return this.descProduto;
    }
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }
    public float getPreco() {
        return this.preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getFechar() {
        return this.fechar;
    }
    public void setFechar(int fechar) {
        this.fechar = fechar;
    }
       
    @Override
    public String toString(){
        return "Código: " + this.codigo+
                "\nDescrição: " + this.descProduto+
                "\nPreço: " + this.preco+
                "\nQuantidade: " +this.quantidade;
    }
}
