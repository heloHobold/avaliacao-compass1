package questao8_bonificacao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual será a quantidade de funcionários que serão cadastros? ");
        int qtd = leia.nextInt();

        Funcionario[] arr = new Funcionario[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe o nome do " + (i + 1) + "° funcionário: ");
            String nome = leia.next();
            System.out.println("Informe o salário do " + (i + 1) + "° funcionário: ");
            double salario = leia.nextDouble();
            System.out.println("");
            arr[i] = new Funcionario(nome, salario);
        }

        for (int i = 0; i < qtd; i++) {
            arr[i].display();
        }

    }
}
