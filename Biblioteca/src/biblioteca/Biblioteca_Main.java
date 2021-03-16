
package biblioteca;

import java.util.Scanner;

public class Biblioteca_Main {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        Cliente l1 = new Cliente();
        Livro c1 = new Livro();
        
        System.out.println("Nome: ");
        l1.setNome(ler.nextLine());
        System.out.println("CPF: ");
        l1.setCpf(ler.nextLine());
        System.out.println("Número de Telefone: ");
        l1.setN_Telefone(ler.nextLine());
        System.out.println("Idade: ");
        l1.setIdade(ler.nextInt());
        ler.nextLine();
        System.out.println("Nome do Livro: ");
        c1.setNome(ler.nextLine());
        System.out.println("Autor do Livro: ");
        c1.setAutor(ler.nextLine());
        System.out.println("Preço do Livro: ");
        c1.setPreco(ler.nextDouble());
        System.out.println(l1);
        System.out.println(c1);
    }
}
