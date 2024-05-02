import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o Numero da Agencia: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o Numero da Conta: ");
        int number = sc.nextInt();
        System.out.println("Digite o Valor do Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + number + " e seu saldo " + saldo + " já está disponivel para saque");


    }
}
