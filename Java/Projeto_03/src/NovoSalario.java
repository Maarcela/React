import java.util.Scanner;
public class NovoSalario {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        float salarioVelho, tempoDeCasa;
        double bonus;

        System.out.println("===Calculo do bônus concedido pela impresa===");
        System.out.println("Me informe o seu atual salário: R$");
        salarioVelho = entrada.nextFloat();
        System.out.println("Me informe quantos anos você possui na empresa");
        tempoDeCasa = entrada.nextFloat();

        if (tempoDeCasa >= 2){
            bonus = salarioVelho * 0.2;
            System.out.println( " O bônus que você concedido é de: R$" + bonus);
        } else {
            bonus = salarioVelho * 0.1;
            System.out.println("O bônus concedido a você é de: R$" + bonus);
        }
        entrada.close();
    }
}
