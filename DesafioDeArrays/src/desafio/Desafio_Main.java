
package desafio;

import java.util.Scanner;
import java.util.ArrayList;

public class Desafio_Main {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        System.out.println("Digite seus números: ");
        System.out.println("(Para parar, digite 0)");
        int num = 0;
        
        do{
           System.out.println("Digite um número: ");
           num = ler.nextInt();
            
           numeros.add(num);   
        }while (num > 0);
        
        System.out.println("Números gravados: " + numeros);
        
        int numConjunto;
        System.out.println("Digite quantos números você quer que seja mostrado: ");
        numConjunto = ler.nextInt();
        
        int numero = 0;
        
        for (int i = 0; i < numConjunto; i++){
            numero = numeros.get(i);
            System.out.println(numero);
        }
        System.out.println("Números gravados: " + numeros);
    }
}
