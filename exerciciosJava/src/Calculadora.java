import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    public int soma(int num1, int num2) {return num1 + num2;}
    public int subtração(int num1, int num2) {return num1 - num2;}
    public int divisão(int num1, int num2) {return num1 / num2;}
    public int multiplucação(int num1, int num2) {return num1 * num2;}

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        List resultados = new ArrayList<>();
        boolean running = true;
        int opcao;
        int num1;
        int num2;

        while (running){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Escolha uma opção: \n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão \n 5- Sair");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();

            if (opcao == 1){
                Scanner input1 = new Scanner(System.in);
                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.soma(num1, num2);
                resultados.add(operacao);

                System.out.println("O resultado é: " + operacao);
                System.out.println("Os resultados anteriores são: "+resultados);
            } else if (opcao == 2) {
                Scanner input1 = new Scanner(System.in);

                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.subtração(num1, num2);
                resultados.add(operacao);

                System.out.println("O resultado é: " + operacao);
                System.out.println("Os resultados anteriores são: "+resultados);
            } else if (opcao == 3) {
                Scanner input1 = new Scanner(System.in);

                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.multiplucação(num1, num2);
                resultados.add(operacao);

                System.out.println("O resultado é: " + operacao);
                System.out.println("Os resultados anteriores são: "+resultados);
            } else if (opcao == 4) {
                Scanner input1 = new Scanner(System.in);

                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.divisão(num1, num2);
                resultados.add(operacao);

                System.out.println("O resultado é: " + operacao);
                System.out.println("Os resultados anteriores são: "+resultados);
            } else if (opcao == 5) {
                running = false;
            }
        }
    }
}