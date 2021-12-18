import java.util.Scanner;
public class Emprestimo {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

                double salarioBruto, valorPrestação, calculoPres;

                System.out.println("<==Verificação de empréstimo.==>");
                System.out.print("Me informe o seu salário bruto: R$");
                salarioBruto = entrada.nextDouble();
                System.out.println("Em quantas prestações deseja solicitar: R$");
                valorPrestação = entrada.nextDouble();

                calculoPres = salarioBruto * 0.3;
                if (valorPrestação > calculoPres){
                    System.out.println("Empréstimo negado:(");
                } else {
                    System.out.println("Emprestimo aceito(");
                }
    }
}
