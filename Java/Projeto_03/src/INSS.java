import java.util.Scanner;
public class INSS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, descontoINSS, salarioDescontado;
        System.out.print("Me informe o valor do seu salário: R$");
        salario = entrada.nextFloat();
        if (salario <= 884) {
            System.out.println("Inseto");
        } else {
            if (salario > 884 && salario <= 1700) {
                descontoINSS = (float) (salario * 0.2);
                salarioDescontado = (salario - descontoINSS);
                System.out.println(" Você possui um desconto de 20%, o seu total de desconto é: R$" + descontoINSS + ".");
                System.out.print("Seu salário após o desconto ficou R$" + salarioDescontado);
            } else {
                if (salario > 1700 && salario <= 2000){
                    descontoINSS = (float) (salario * 0.25);
                    salarioDescontado = (salario - descontoINSS);
                    System.out.println("Você possui um desconto de 25%, o seu total de desconto é: R$" + descontoINSS + ".");
                    System.out.print(" Seu salário após o desconto ficou R$" + salarioDescontado);
                } else{
                    descontoINSS = (float) (salario * 0.3);
                    salarioDescontado = (salario - descontoINSS);
                    System.out.println("Você possui um desconto de 30%, o seu total de desconto é: R$" + descontoINSS + ".");
                    System.out.print("Seu salário após o desconto ficou R$" + salarioDescontado);
                }
            }
        }
        entrada.close();
    }
}
