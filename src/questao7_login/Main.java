package questao7_login;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int qtd = 3;
        boolean login = false;

        Usuario[] arr = new Usuario[qtd];
        arr[0] = new Usuario("user1", "password1");
        arr[1] = new Usuario("user2", "password2");
        arr[2] = new Usuario("user3", "password3");

        System.out.println("Informe o usuário: ");
        String usuario = leia.nextLine();
        System.out.println("Informe a senha: ");
        String senha = leia.nextLine();

        for (int i = 0; i < qtd; i++){
            if (usuario.equals(arr[i].getNome()) && senha.equals(arr[i].getSenha())) {
                login = true;
                break;
            }
        }

        if (login) {
            LocalTime localTime = LocalTime.now();
            if (localTime.getHour() >= 6 && localTime.getHour() < 12 ) {
                System.out.println("Bom dia! Você se logou ao nosso sistema.");
            } else if (localTime.getHour() >= 12 && localTime.getHour() < 18) {
                System.out.println("Boa tarde! Você se logou ao nosso sistema.");
            } else if (localTime.getHour() >= 18) {
                System.out.println("Boa noite! Você se logou ao nosso sistema.");
            } else {
                System.out.println("Boa madrugada! Você se logou ao nosso sistema.");
            }
        } else {
            System.out.println("Usuário e/ou senha incorretos!");
        }

    }
}
