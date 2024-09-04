import java.util.Scanner;

public class Fibonacci {
    // Enquanto B for menor que o número informado, calcula o próximo número da sequência
    //e atualiza A e B
    //retorna true se o número informado for igual a B ou seja, se ele foi encontrado na sequência
    //caso contrario retorna false.
    public static boolean pertenceFibonacci(int num){
        int a = 0, b = 1;
        while (b < num){
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(": Digite o número: ");
        int numero = input.nextInt();

        // chamada do método para verificar se o número pertence à sequência.
        if(pertenceFibonacci(numero)){
            System.out.println(numero + " pertece à sequencia");
        } else{
            System.out.println(numero + " Não pertence à sequencia");
        }
    }
}
