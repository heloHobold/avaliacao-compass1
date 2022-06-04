package questao7_login;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String userLogin = "user.java.189";
        String userSenha = "user123";

        System.out.println("Informe o usuário: ");
        String usuario = leia.nextLine();
        System.out.println("Informe a senha: ");
        String senha = leia.nextLine();

        if (usuario.equals(userLogin) && senha.equals(userSenha)) {
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
