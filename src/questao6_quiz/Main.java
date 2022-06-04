package questao6_quiz;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome de usuário: ");
        String usuario = leia.nextLine();

        int qtdPerguntas = Pergunta.getQtdPerguntas();

        String palpite;
        int erros = 0;
        int acertos = 0;

        System.out.println("Vamos começar!!!");

        Pergunta[] arr = new Pergunta[qtdPerguntas];
        arr[0] = new Pergunta("Quantas casas decimais tem o número pi? ", "Infinitas");
        arr[1] = new Pergunta("Qual o maior animal do mundo? ", "Baleia");
        arr[2] = new Pergunta("Qual o menor país do mundo? ", "Vaticano");
        arr[3] = new Pergunta("Qual a raiz quadrada de 121? ", "11");
        arr[4] = new Pergunta("Onde fica o maior rio do mundo? ", "Brasil");
        arr[5] = new Pergunta("Em que cidade fica o Museo do Louvre? ", "Paris");
        arr[6] = new Pergunta("Qual o animal que mata mais humanos por ano? ", "Mosquito");
        arr[7] = new Pergunta("Quantas fases a lua têm?" , "4");
        arr[8] = new Pergunta("Quantas camadas a atmosféra possui? ", "5");
        arr[9] = new Pergunta("Quem falou a frase 'Penso, logo existo'? ", "Descartes");

        for (int i = 0; i<qtdPerguntas; i++){
            System.out.println(arr[i].getComanda());
            palpite = leia.nextLine();
            if (palpite.equalsIgnoreCase(arr[i].getResposta())){
                System.out.println("Parabéns, você acertou!");
                System.out.println("");
                acertos++;
            } else {
                System.out.println("Sinto muito mas a resposta certa era " + arr[i].getResposta());
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
