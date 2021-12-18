public class expressão {
    // Atividade Java 3
    //3.	Faça um algoritmo para imprimir em cada linha o resultado lógico das seguintes expressões:
    //a.	((120 - 30) = (3 ˆ 30))
    //b.	(não ((20 módulo 4)= 1) ou (9 != 9))
    //c.	((5 módulo 2 2) > 3)
    //d.	(a = A)
    public static void main(String[] args) {
        System.out.println("Resultado a " + ((120-30) == (Math.pow ( 3 , 30 ))));
        System.out.println("Resultado b" + (!((20% 4) == 1) || ( 9!= 9) ));
        System.out.println("Resultado c" + ((5% 22) > 3));
        float a = 7; float A =2;
        System.out.println("Resultado d" + (a == A));


        }
    }

