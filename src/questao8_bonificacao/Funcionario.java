package questao8_bonificacao;

public class Funcionario {
    private String nome;
    private double salario;
    private double bonus;
    private double desconto;
    private double salarioLiquido;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public void display(){
        if (this.salario <= 1000){
            this.bonus = this.salario * 0.2;
            this.salarioLiquido = this.salario + this.bonus;
        } else if (this.salario > 1000 && this.salario <= 2000) {
            this.bonus = this.salario * 0.1;
            this.salarioLiquido = this.salario + this.bonus;
        } else {
            this.desconto = this.salario * 0.1;
            this.salarioLiquido = this.salario - this.desconto;
        }
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário: " + this.salario);
        if(this.salario > 2000){
            System.out.println("Desconto: " + this.desconto);
        } else {
            System.out.println("Bônus: " + this.bonus);
        }
        System.out.println("Salário líquido: " + this.salarioLiquido);
        System.out.println("");
    }
}
