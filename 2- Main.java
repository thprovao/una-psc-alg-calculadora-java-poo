import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Digite o primeiro número:");
            double numeroUm = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numeroDois = scanner.nextDouble();

            Calculadora calc = new Calculadora(numeroUm, numeroDois);

            System.out.println("\nSelecione a operação desejada:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada do primeiro número");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir());
                    break;
                case 5:
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case 6:
                    System.out.println("Resultado: " + calc.raizQuadrada());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("\nDeseja realizar outra operação? (Digite 'Q' para sair ou qualquer tecla para continuar)");
            opcao = scanner.next();

        } while (!opcao.equalsIgnoreCase("Q"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
