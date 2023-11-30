import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão \nEscolha a operação: ");
        int op = scanner.nextInt();

        double resultado;


        switch (op){
            case 1:
                resultado = valor1 + valor2;
                System.out.printf("%.2f + %.2f = %.3f", valor1, valor2, resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.printf("%.2f - %.2f = %.3f", valor1, valor2, resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.printf("%.2f x %.2f = %.3f", valor1, valor2, resultado);
                break;
            case 4:
                resultado = valor1 / valor2;
                System.out.printf("%.2f / %.2f = %.3f", valor1, valor2, resultado);
                break;
            default:
                System.out.print("Opção Inválida!");
                break;
        }
        scanner.close();

    }
}