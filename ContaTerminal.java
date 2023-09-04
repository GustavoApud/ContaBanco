import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        //Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        Random numero = new Random();
        double saldo = 1 + numero.nextInt(500);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da sua Agência!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite sua Agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo!");
        String nomeCompleto = scanner.next();

        System.out.println("Seu saldo atual é:" + " " + saldo);

        System.out.println("Olá" + " " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é" + " " + agencia + ", conta" + " " + numeroAgencia + "" + " " + "e seu saldo" + " " + saldo + " " + "já está disponível para saque.");
    }
}
