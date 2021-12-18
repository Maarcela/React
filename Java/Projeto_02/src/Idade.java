import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
        Scanner entreda = new Scanner(System.in);
        int Idade;
        System.out.print("Oi, poderia me informar sua idade:");
        Idade = entreda.nextInt();
        if (Idade >= 21){
            System.out.print("Sua idade é:" + Idade + "anos, indica que você é maior de idade.");
        }else {
            System.out.print("Sua idade é:" + Idade + "anos, você é menor de idade!");
        }
        entreda.close();
    }
}
