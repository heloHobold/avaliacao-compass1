package questao6_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome de usuário: ");
        String usuario = leia.nextLine();

        String palpite;
        int erros = 0;
        int acertos = 0;

        ArrayList<String> conteudo = new ArrayList<String>();
        ArrayList<String> resposta = new ArrayList<String>();
        conteudo.add("Qual o maior animal do mundo? ");
        resposta.add("Baleia");
        conteudo.add("Qual o menor país do mundo? ");
        resposta.add("Vaticano");
        conteudo.add("Qual a raiz quadrada de 121? ");
        resposta.add("11");
        conteudo.add("Onde fica o maior rio do mundo? ");
        resposta.add("Brasil");
        conteudo.add("Em que cidade fica o Museo do Louvre? ");
        resposta.add("Paris");
        conteudo.add("Qual o animal que mata mais humanos por ano? ");
        resposta.add("Mosquito");
        conteudo.add("Quantas fases a lua têm? ");
        resposta.add("4");
        conteudo.add("Quantas camadas a atmosféra possui? ");
        resposta.add("5");
        conteudo.add("Quem falou a frase 'Penso, logo existo'? ");
        resposta.add("Descartes");
        conteudo.add("Quantas casas decimais tem o número pi? ");
        resposta.add("Infinitas");

        System.out.println("Vamos começar!!!");

        for (int i = 0; i<10; i++){
            System.out.println(conteudo.get(i));
            palpite = leia.nextLine();
            if (palpite.equalsIgnoreCase(resposta.get(i))){
                System.out.println("Parabéns, você acertou!");
                System.out.println("");
                acertos++;
            } else {
                System.out.println("Sinto muito mas a resposta certa era " + resposta.get(i));
                System.out.println("");
                erros++;
            }
        }
        System.out.println("");
        System.out.println("Usuário: " + usuario);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);

    }
}
