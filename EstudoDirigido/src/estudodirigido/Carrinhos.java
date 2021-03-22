
package estudodirigido;
import java.util.Scanner;

public class Carrinhos {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        Produtos a1 = new Produtos();
        
        do{
            System.out.println("Digite o Código do produto: ");
            a1.setCodigo(ler.nextInt());
            System.out.println("Digite a Descrição do produto: ");
            a1.setDescProduto(ler.nextLine());
            a1.setDescProduto(ler.nextLine());
            System.out.println("Digite o Preço do produto: ");
            a1.setPreco(ler.nextFloat());
            System.out.println("Digite a Quantidade do produto: ");
            a1.setQuantidade(ler.nextInt());
            System.out.println("Para fechar digite 0: ");
            a1.setFechar(ler.nextInt());
        } while (a1.getFechar() != 0);
        
        System.out.println(a1);
       
    }
}
