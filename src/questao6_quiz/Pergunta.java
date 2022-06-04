package questao6_quiz;

public class Pergunta {
    private String comanda;
    private String resposta;
    private static int qtdPerguntas = 10;

    public Pergunta(String comanda, String resposta){
        this.comanda = comanda;
        this.resposta = resposta;
    }

    public static int getQtdPerguntas() {
        return qtdPerguntas;
    }

    public String getComanda() {
        return comanda;
    }

    public String getResposta() {
        return resposta;
    }

}
